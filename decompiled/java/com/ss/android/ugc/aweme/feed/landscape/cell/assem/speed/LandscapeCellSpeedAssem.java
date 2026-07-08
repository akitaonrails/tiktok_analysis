package com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed;

import X.C01GW;
import X.C0GY9;
import X.C0HCN;
import X.C0SXF;
import X.C13LE;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1887907aP;
import X.C1ER1;
import X.C20684815ws;
import X.C2344009Gk;
import X.C340340DVw;
import X.C340360DVy;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C586360MzC;
import X.C692450REd;
import X.C692480REg;
import X.C708140Rq8;
import X.C724270Sb3;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import Y.ACListenerS146S0100000_11;
import Y.ALAdapterS8S0100000_11;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.ICellSpeedActionAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedAutoPlayAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.bottom.LandscapeCellSeekBarVM;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopAreaContainerVM;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class LandscapeCellSpeedAssem extends FeedBaseContentAssem<LandscapeCellSpeedAssem> implements ICellSpeedActionAbility, InterfaceC1554640qYg {
    public static final List<Float> LLJZIJLIL = C1697810uHb.LJIILJJIL(Float.valueOf(2.0f), Float.valueOf(1.5f), Float.valueOf(1.25f), Float.valueOf(1.0f), Float.valueOf(0.75f));
    public static final float LLL;
    public View LLJJJJ;
    public RecyclerView LLJJJJJIL;
    public C340340DVw LLJJJJLIIL;
    public AnimatorSet LLJJLIIIJLLLLLLLZ;
    public AnimatorSet LLJL;
    public ArrayList<C340360DVy> LLJLIL;
    public VideoItemParams LLJZ;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 399));
    public final float LLJLILLLLZIIL = 1.0f;
    public final int LLJLL = 3;
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(TopAreaContainerVM.class), AFwS243S0000000_11.get$arr$(196));
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(LandscapeCellSeekBarVM.class), AFwS243S0000000_11.get$arr$(197));

    static {
        LLL = C418440Gaw.LIZIZ(Integer.valueOf(((C692450REd.LIZ ^ true) && C0HCN.LIZIZ()) ? 10 : 54));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 280727298) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.ICellSpeedActionAbility
    public final void wi2() {
        VideoItemParams videoItemParams = this.LLJZ;
        if (videoItemParams != null) {
            tp(videoItemParams);
        }
        C586360MzC c586360MzC = C586360MzC.LIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        C724270Sb3 c724270Sb32 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
        Context context = getContext();
        c586360MzC.getClass();
        if (aweme != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
            c2344009Gk.LIZJ(C0SXF.LJJIII(context, aweme), "is_landscape_screen");
            c2344009Gk.LJIIIIZZ("enter_method", "click_landscape_screen_button");
            c2344009Gk.LJIIIIZZ("is_collection_item", aweme.isPaidContent ? "1" : CardStruct.IStatusCode.DEFAULT);
            c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
            C20684815ws.LJIILLIIL("click_video_speed", c2344009Gk.LIZ);
        }
        RecyclerView recyclerView = this.LLJJJJJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C786410Ut5.Oc(recyclerView, 0.0f);
        AnimatorSet animatorSet = this.LLJJLIIIJLLLLLLLZ;
        if (animatorSet == null) {
            animatorSet = null;
        }
        animatorSet.start();
        View view = this.LLJJJJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        if (C692480REg.LIZ()) {
            LandscapeFeedAutoPlayAbility landscapeFeedAutoPlayAbility = (LandscapeFeedAutoPlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandscapeFeedAutoPlayAbility.class, null);
            if (landscapeFeedAutoPlayAbility != null) {
                landscapeFeedAutoPlayAbility.Yu1();
            }
            LandScapeFeedIntroAbility landScapeFeedIntroAbility = (LandScapeFeedIntroAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), LandScapeFeedIntroAbility.class, null);
            if (landScapeFeedIntroAbility != null) {
                landScapeFeedIntroAbility.FV0();
            }
        }
        View view2 = this.LLJJJJ;
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 19), view2 != null ? view2 : null);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: cp, reason: merged with bridge method [inline-methods] */
    public final void up(VideoItemParams videoItemParams) {
        ArrayList<C340360DVy> arrayList;
        if (this.LLJZ == null) {
            this.LLJZ = videoItemParams;
            return;
        }
        final Context context = getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem$onBind$linearLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return false;
            }
        };
        RecyclerView recyclerView = this.LLJJJJJIL;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(250));
        RecyclerView recyclerView3 = this.LLJJJJJIL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.getLayoutParams().height = iLIZIZ;
        Context context2 = getContext();
        if (context2 != null && (arrayList = this.LLJLIL) != null) {
            this.LLJJJJLIIL = new C340340DVw(context2, arrayList);
            Vibrator vibrator = (Vibrator) C786410Ut5.H2(context2, "vibrator");
            C340340DVw c340340DVw = this.LLJJJJLIIL;
            if (c340340DVw != null) {
                c340340DVw.LLILZ = new C708140Rq8(this, videoItemParams, context2, vibrator);
                c340340DVw.LLILLL = iLIZIZ;
            }
            RecyclerView recyclerView4 = this.LLJJJJJIL;
            if (recyclerView4 != null) {
                recyclerView2 = recyclerView4;
            }
            recyclerView2.setAdapter(c340340DVw);
        }
    }

    public final void dp(int i) {
        boolean z;
        ArrayList<C340360DVy> arrayList = this.LLJLIL;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C340360DVy c340360DVy = (C340360DVy) ListProtector.get(arrayList, i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                c340360DVy.LIZIZ = z;
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        float f;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility;
        this.LLJJJJ = view;
        this.LLJJJJJIL = (RecyclerView) view.findViewById(R.id.vtu);
        ArrayList<C340360DVy> arrayList = new ArrayList<>();
        int size = LLJZIJLIL.size();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= size) {
                break;
            }
            List<Float> list = LLJZIJLIL;
            String strLIZ = C1887907aP.LIZ(((Number) ListProtector.get(list, i)).floatValue());
            if (((Number) ListProtector.get(list, i)).floatValue() != this.LLJLILLLLZIIL) {
                z = false;
            }
            arrayList.add(new C340360DVy(strLIZ, z));
            i++;
        }
        this.LLJLIL = arrayList;
        boolean zLIZJ = C444960Hcc.LIZJ(getContext());
        RecyclerView recyclerView = this.LLJJJJJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(recyclerView, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(80L);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        RecyclerView recyclerView2 = this.LLJJJJJIL;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        float[] fArr = new float[1];
        float f2 = LLL;
        if (zLIZJ) {
            f = f2;
        } else {
            f = -f2;
        }
        fArr[0] = f;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(recyclerView2, "translationX", fArr);
        objectAnimatorOfFloat2.setDuration(100L);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        this.LLJJLIIIJLLLLLLLZ = animatorSet;
        RecyclerView recyclerView3 = this.LLJJJJJIL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(recyclerView3, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(80L);
        objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        RecyclerView recyclerView4 = this.LLJJJJJIL;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        float[] fArr2 = new float[1];
        if (zLIZJ) {
            f2 = -f2;
        }
        fArr2[0] = f2;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(recyclerView4, "translationX", fArr2);
        objectAnimatorOfFloat4.setDuration(100L);
        objectAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setStartDelay(100L);
        animatorSet2.playTogether(objectAnimatorOfFloat4, objectAnimatorOfFloat3);
        animatorSet2.addListener(new ALAdapterS8S0100000_11(this, 8));
        this.LLJL = animatorSet2;
        if (C692480REg.LIZ() && (landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LLJJL.getValue()) != null) {
            landscapeFeedViewPagerAbility.bY0(this, new AwS625S0100000_11(this, 32));
        }
    }
}
