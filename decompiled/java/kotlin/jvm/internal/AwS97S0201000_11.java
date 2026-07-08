package kotlin.jvm.internal;

import X.AnonymousClass1912;
import X.AnonymousClass1916;
import X.AnonymousClass1991;
import X.C03H5;
import X.C09AY;
import X.C0RHH;
import X.C191A;
import X.C191C;
import X.C20673215v0;
import X.C21392618nk;
import X.C214703190r;
import X.C631370Opb;
import X.C721560SSc;
import X.C737910Sx3;
import X.InterfaceC214797194h;
import X.InterfaceC738310Sxh;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.ui.feed.collection.PhotoSlideComponentInCollection;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlideComponent;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS97S0201000_11 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS97S0201000_11 awS97S0201000_11, Object obj) {
        AssemViewModel assemViewModel = (AssemViewModel) obj;
        if (assemViewModel != null) {
            assemViewModel.setState(new AwS590S0100000_11(new C0RHH(((VideoItemParams) C631370Opb.LIZ((FeedPhotoSlideComponent) awS97S0201000_11.l0)).getAweme().getAid(), (((long) awS97S0201000_11.i2) + 1) * 2150, 2150 * ((long) ((PhotoSlideComponentInCollection) awS97S0201000_11.l1).Gp().AQ2())), 490));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS97S0201000_11 awS97S0201000_11, Object obj) {
        C214703190r c214703190r;
        AnonymousClass1991 anonymousClass1991 = (AnonymousClass1991) obj;
        PostModeDetailParams postModeDetailParams = ((PostModeDetailRootFragment) awS97S0201000_11.l0).LLJJIII;
        if (postModeDetailParams != null && postModeDetailParams.enableScale) {
            c214703190r = new C214703190r(new WeakReference((PostModeDetailRootFragment) awS97S0201000_11.l0));
        } else {
            c214703190r = null;
        }
        PostModeDetailRootFragment postModeDetailRootFragment = (PostModeDetailRootFragment) awS97S0201000_11.l0;
        AnonymousClass1916 anonymousClass1916 = new AnonymousClass1916((Map) awS97S0201000_11.l1, c214703190r, new C21392618nk(), AnonymousClass1912.FALLBACK, C191A.CONTINUE);
        int i = awS97S0201000_11.i2;
        final PostModeDetailRootFragment postModeDetailRootFragment2 = (PostModeDetailRootFragment) awS97S0201000_11.l0;
        anonymousClass1991.LIZJ = new C721560SSc(anonymousClass1916);
        anonymousClass1916.LJIIJ = i;
        anonymousClass1916.LIZ(new InterfaceC214797194h() { // from class: X.0SQc
            @Override // X.InterfaceC214797194h
            public final void LIZIZ() {
                C720620SOm.LIZ.setValue(null);
                postModeDetailRootFragment2.getViewModel().LLLILZLLLI = true;
                postModeDetailRootFragment2.getViewModel().LLJLLL.setValue(Boolean.TRUE);
                postModeDetailRootFragment2.getViewModel().LLLFFI.setValue(Boolean.FALSE);
            }

            @Override // X.InterfaceC214797194h
            public final void LIZ() {
                C0SQL.LIZ();
            }

            @Override // X.InterfaceC214797194h
            public final void LIZJ() {
                C0SQL.LIZIZ();
            }

            @Override // X.InterfaceC214797194h
            public final void LIZLLL() {
                C717470SCj.LIZ();
            }
        });
        postModeDetailRootFragment.LLJJJJLIIL = anonymousClass1916;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS97S0201000_11 awS97S0201000_11, Object obj) {
        InterfaceC738310Sxh interfaceC738310Sxh = (InterfaceC738310Sxh) obj;
        View viewLIZJ = C20673215v0.LIZJ(awS97S0201000_11.i2, C737910Sx3.LIZIZ((Context) awS97S0201000_11.l0));
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) awS97S0201000_11.l1;
        reusedUISlotAssem.LLJJJJJIL = viewLIZJ;
        if (reusedUISlotAssem.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            if (((ReusedUISlotAssem) awS97S0201000_11.l1).isOverrideOnViewCreatedAsync()) {
                interfaceC738310Sxh.LIZLLL();
            }
            ((ReusedUISlotAssem) awS97S0201000_11.l1).Ao(viewLIZJ);
        }
        return viewLIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS97S0201000_11(Context context, Context context2, int i, ReusedUISlotAssem<C03H5> reusedUISlotAssem) {
        super(1);
        this.$t = reusedUISlotAssem;
        this.l0 = context;
        this.i2 = context2;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS97S0201000_11(FeedPhotoSlideComponent feedPhotoSlideComponent, int i, PhotoSlideComponentInCollection photoSlideComponentInCollection, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = feedPhotoSlideComponent;
        this.i2 = i;
        this.l1 = photoSlideComponentInCollection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS97S0201000_11(PostModeDetailRootFragment postModeDetailRootFragment, PostModeDetailRootFragment postModeDetailRootFragment2, Map<String, ? extends C191C> map, int i) {
        super(1);
        this.$t = i;
        this.l0 = postModeDetailRootFragment;
        this.l1 = postModeDetailRootFragment2;
        this.i2 = map;
    }
}
