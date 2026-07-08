package com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend;

import X.C0H1U;
import X.C1085500eM0;
import X.C12ES;
import X.C13BV;
import X.C1558520qew;
import X.C1559040qfm;
import X.C1559260qg8;
import X.C19471911Gb;
import X.C19675611yU;
import X.C19775812Yy;
import X.C2173061A2u;
import X.C337180DJs;
import X.C345780Dh2;
import X.C723580SZw;
import X.C724240Sb0;
import X.C786410Ut5;
import X.InterfaceC1085510eM1;
import X.InterfaceC1554640qYg;
import X.InterfaceC19675911yX;
import X.InterfaceC494301wD;
import Y.ALAdapterS24S0100000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.ab.ECSearchPhotoSearchShootingPageOptConfigs;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.IEcPreviewViewAbility;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendFeedItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.SysRecommendModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ExtendAlbumAssem extends UISlotAssem implements IEcExtendAlbumAbility, InterfaceC1554640qYg {
    public RecyclerView LLJJI;
    public C19675611yU LLJJIII;
    public int LLJJIJI;
    public InterfaceC19675911yX LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723580SZw(this, C1559040qfm.class, null), checkSupervisorPrepared());

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.bqs;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -277315885) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility
    public final void dismiss() {
        C1559040qfm c1559040qfm = (C1559040qfm) this.LLJJJ.getValue();
        if (!(c1559040qfm != null ? c1559040qfm.LLILLJJLI : ECSearchPhotoSearchShootingPageOptConfigs.LIZ()) && this.LLJJIJIL) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), "translationY", 0.0f, this.LLJJIJI);
            objectAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 2));
            objectAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(this, 1));
            objectAnimatorOfFloat.setDuration(300L);
            C786410Ut5.Pd(objectAnimatorOfFloat);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility
    public final boolean isShown() {
        return this.LLJJIJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int iLJIIIIZZ;
        PhotoSearchEnterParams photoSearchEnterParamsJ80;
        super.onViewCreated(view);
        C1559040qfm c1559040qfm = (C1559040qfm) this.LLJJJ.getValue();
        if (c1559040qfm != null) {
            iLJIIIIZZ = c1559040qfm.LL;
        } else {
            iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(getContext())) * 0.19d);
        }
        this.LLJJIJI = iLJIIIIZZ;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.LLJJIJI;
        C786410Ut5.W5(view, layoutParams);
        if (view instanceof C1085500eM0) {
            ((C1085500eM0) view).setGestureListener(new InterfaceC1085510eM1() { // from class: X.11yT
                @Override // X.InterfaceC1085510eM1
                public final void LIZ() {
                    IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), IEcPreviewViewAbility.class, null);
                    if (iEcPreviewViewAbility != null) {
                        iEcPreviewViewAbility.AI1();
                    }
                }

                @Override // X.InterfaceC1085510eM1
                public final void N3() {
                    IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), IEcPreviewViewAbility.class, null);
                    if (iEcPreviewViewAbility != null) {
                        iEcPreviewViewAbility.N3();
                    }
                }
            });
        }
        this.LLJJI = (RecyclerView) view.findViewById(R.id.gfz);
        getActualLifecycleOwner();
        C19675611yU c19675611yU = null;
        IEcPreviewViewAbility iEcPreviewViewAbility = (IEcPreviewViewAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IEcPreviewViewAbility.class, null);
        if (iEcPreviewViewAbility != null) {
            photoSearchEnterParamsJ80 = iEcPreviewViewAbility.j80();
        } else {
            photoSearchEnterParamsJ80 = null;
        }
        this.LLJJIII = new C19675611yU(this, photoSearchEnterParamsJ80, C19471911Gb.LIZ(C724240Sb0.LIZ(this)), C13BV.INSTANCE, new C19775812Yy(this, 2), new C19775812Yy(this, 3));
        RecyclerView recyclerView = this.LLJJI;
        if (recyclerView != null) {
            final Context context = recyclerView.getContext();
            recyclerView.setLayoutManager(new WrapGridLayoutManager(context) { // from class: com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.ExtendAlbumAssem$onViewCreated$5$1
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final boolean canScrollVertically() {
                    return false;
                }
            });
            C19675611yU c19675611yU2 = this.LLJJIII;
            if (c19675611yU2 != null) {
                c19675611yU = c19675611yU2;
            }
            recyclerView.setAdapter(c19675611yU);
            recyclerView.addItemDecoration(new C345780Dh2(4, (int) C12ES.LIZJ(1.0f, recyclerView.getContext()), false));
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility
    public final void sS1(C2173061A2u c2173061A2u) {
        this.LLJJIJIIJIL = c2173061A2u;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility
    public final void show(int i) {
        if (this.LLJJIJIL) {
            return;
        }
        this.LLJJIJI += i;
        ViewGroup.LayoutParams layoutParams = getContentView().getLayoutParams();
        layoutParams.height = this.LLJJIJI;
        C786410Ut5.W5(getContentView(), layoutParams);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJIJL(), "translationY", this.LLJJIJI, 0.0f);
        objectAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 3));
        objectAnimatorOfFloat.addListener(new ALAdapterS24S0100000_29(this, 2));
        objectAnimatorOfFloat.setDuration(300L);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.search.vision.record.extend.IEcExtendAlbumAbility
    public final void JB1(List<? extends MediaModel> list, SysRecommendModel sysRecommendModel) {
        C19675611yU c19675611yU;
        boolean zLIZ;
        List<SysRecommendFeedItem> list2;
        C19675611yU c19675611yU2 = this.LLJJIII;
        C19675611yU c19675611yU3 = null;
        if (c19675611yU2 == null) {
            c19675611yU = null;
        } else {
            c19675611yU = c19675611yU2;
        }
        c19675611yU.LLILZIL = list;
        if (c19675611yU2 == null) {
            c19675611yU2 = null;
        }
        if (sysRecommendModel == null || (list2 = sysRecommendModel.feedList) == null || list2.size() != 4) {
            sysRecommendModel = null;
        }
        c19675611yU2.LLILLL = sysRecommendModel;
        C1559040qfm c1559040qfm = (C1559040qfm) this.LLJJJ.getValue();
        if (c1559040qfm != null) {
            zLIZ = c1559040qfm.LLILLJJLI;
        } else {
            zLIZ = ECSearchPhotoSearchShootingPageOptConfigs.LIZ();
        }
        if (zLIZ && list.isEmpty()) {
            C0H1U.LIZIZ(LJJIJL());
            return;
        }
        C337180DJs.LIZJ(LJJIJL());
        C19675611yU c19675611yU4 = this.LLJJIII;
        if (c19675611yU4 != null) {
            c19675611yU3 = c19675611yU4;
        }
        c19675611yU3.notifyDataSetChanged();
    }
}
