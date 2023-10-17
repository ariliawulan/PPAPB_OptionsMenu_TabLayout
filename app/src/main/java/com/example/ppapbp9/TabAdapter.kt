import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.ppapbp9.Home
import com.example.ppapbp9.Materi
import com.example.ppapbp9.Quiz

class TabAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Home()
            1 -> Materi()
            2 -> Quiz()
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
    override fun getCount(): Int {
        return 3
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Home"
            1 -> "Materi"
            2 -> "Quiz"
            else -> null
        }
    }
}