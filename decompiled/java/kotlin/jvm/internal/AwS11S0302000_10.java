package kotlin.jvm.internal;

import X.C09AY;
import X.C0P6R;
import X.C21681919tJ;
import X.C645130PSd;
import X.C645860PUy;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public class AwS11S0302000_10 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S0302000_10 awS11S0302000_10) {
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams;
        C21681919tJ c21681919tJ;
        int i;
        C21681919tJ c21681919tJ2;
        Fragment fragmentLIZ = ((C645130PSd) awS11S0302000_10.l0).LLILLJJLI.LIZ();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (fragmentLIZ != null) {
            numValueOf = Integer.valueOf(fragmentLIZ.hashCode());
        } else {
            numValueOf = null;
        }
        int i2 = awS11S0302000_10.i3;
        View view = ((RecyclerView.ViewHolder) awS11S0302000_10.l1).itemView;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof C21681919tJ) {
            c21681919tJ = (C21681919tJ) layoutParams;
        } else {
            c21681919tJ = null;
        }
        int i3 = -1;
        if (c21681919tJ != null) {
            i = c21681919tJ.LL;
        } else {
            i = -1;
        }
        boolean zLJ = C645860PUy.LJ(awS11S0302000_10.i4, (SearchMixFeed) awS11S0302000_10.l2);
        View view2 = ((RecyclerView.ViewHolder) awS11S0302000_10.l1).itemView;
        if (view2 != null) {
            layoutParams2 = view2.getLayoutParams();
        }
        if ((layoutParams2 instanceof C21681919tJ) && (c21681919tJ2 = (C21681919tJ) layoutParams2) != null) {
            i3 = c21681919tJ2.LLILLJJLI;
        }
        C0P6R.LIZ(numValueOf, i2, i, zLJ, i3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S0302000_10 awS11S0302000_10) {
        Integer numValueOf;
        C21681919tJ c21681919tJ;
        int i;
        C21681919tJ c21681919tJ2;
        Fragment fragmentLIZ = ((C645130PSd) awS11S0302000_10.l0).LLILLJJLI.LIZ();
        if (fragmentLIZ != null) {
            numValueOf = Integer.valueOf(fragmentLIZ.hashCode());
        } else {
            numValueOf = null;
        }
        int i2 = awS11S0302000_10.i3;
        ViewGroup.LayoutParams layoutParams = ((RecyclerView.ViewHolder) awS11S0302000_10.l1).itemView.getLayoutParams();
        if (layoutParams instanceof C21681919tJ) {
            c21681919tJ = (C21681919tJ) layoutParams;
        } else {
            c21681919tJ = null;
        }
        int i3 = -1;
        if (c21681919tJ != null) {
            i = c21681919tJ.LL;
        } else {
            i = -1;
        }
        boolean zLJ = C645860PUy.LJ(awS11S0302000_10.i4, (SearchMixFeed) awS11S0302000_10.l2);
        ViewGroup.LayoutParams layoutParams2 = ((RecyclerView.ViewHolder) awS11S0302000_10.l1).itemView.getLayoutParams();
        if ((layoutParams2 instanceof C21681919tJ) && (c21681919tJ2 = (C21681919tJ) layoutParams2) != null) {
            i3 = c21681919tJ2.LLILLJJLI;
        }
        C0P6R.LIZ(numValueOf, i2, i, zLJ, i3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS11S0302000_10(C645130PSd c645130PSd, int i, RecyclerView.ViewHolder viewHolder, int i2, SearchMixFeed searchMixFeed, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = c645130PSd;
        this.i3 = i;
        this.l1 = viewHolder;
        this.i4 = i2;
        this.l2 = searchMixFeed;
    }
}
