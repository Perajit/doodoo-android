package com.example.dodoo.ui.planList

import android.icu.text.SimpleDateFormat
import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.dodoo.R
import com.example.dodoo.data.Plan
import com.example.dodoo.databinding.PlanListItemBinding

class PlanListViewAdapter : RecyclerView.Adapter<PlanListViewAdapter.ViewHolder>() {

    var list: List<Plan> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: PlanListItemBinding = DataBindingUtil.inflate(inflater, R.layout.plan_list_item, parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(list[position])
    }

    class ViewHolder(private val binding: PlanListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val timeFormatter = SimpleDateFormat("MMM d, yyyy h:mm:a")

        fun bindData(plan: Plan) {
            binding.planTitle = plan.title

            val planTime = plan.time
            if (planTime != null) {
                binding.planTimeVisibility = View.VISIBLE
                binding.planTime = timeFormatter.format(planTime)
            } else {
                binding.planTimeVisibility = View.GONE
            }
        }
    }

}
