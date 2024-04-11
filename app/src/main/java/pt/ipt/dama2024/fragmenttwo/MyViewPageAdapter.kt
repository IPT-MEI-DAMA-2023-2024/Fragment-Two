package pt.ipt.dama2024.fragmenttwo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * this class is used to choose the fragment to be presented at 'main_activity.xml'
 *
 * @constructor
 *
 * @param fragmentActivity
 */
class MyViewPageAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    /**
     * gets the number of tabs (in this case 3)
     *
     * @return
     */
    override fun getItemCount(): Int {
        return 3
    }

    /**
     * choose the fragment to be used
     *
     * @param position
     * @return
     */
    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> FragmentOne()
            1->FragmentTwo()
            2->FragmentThree()
            else ->FragmentOne()
        }
    }
}