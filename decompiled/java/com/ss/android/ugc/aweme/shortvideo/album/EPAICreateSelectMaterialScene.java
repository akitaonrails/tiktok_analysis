package com.ss.android.ugc.aweme.shortvideo.album;

import X.AbstractC20746216Ge;
import X.AbstractC359300E6u;
import X.C01GW;
import X.C0E9B;
import X.C0EHK;
import X.C0KFD;
import X.C1295960jpS;
import X.C16BC;
import X.C16G1;
import X.C19E3;
import X.C19E5;
import X.C19EG;
import X.C20622515mp;
import X.C286460BKq;
import X.C359210E6l;
import X.C359220E6m;
import X.C359270E6r;
import X.C359280E6s;
import X.C378370EsV;
import X.C378390EsX;
import X.C452501pT;
import X.C538540LAe;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC359320E6w;
import X.InterfaceC20597015ii;
import Y.ARunnableS75S0200000_6;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class EPAICreateSelectMaterialScene extends SelectMaterialScene {
    public boolean X0;
    public boolean Z0;
    public ShortVideoContext a1;
    public final C01GW K0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 266));
    public final C01GW L0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 260));
    public final C01GW M0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 255));
    public final C01GW N0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 265));
    public final C01GW O0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 263));
    public final C01GW P0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 267));
    public final C01GW Q0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 256));
    public final C01GW R0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 258));
    public final C01GW S0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 257));
    public final C01GW T0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 259));
    public final C01GW U0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 262));
    public final C01GW V0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 261));
    public final C01GW W0 = C452501pT.LIZIZ(new AwS576S0100000_32(this, 264));
    public String Y0 = "";
    public final C19E5 b1 = new AbstractC20746216Ge() { // from class: X.19E5
        @Override // X.C16GK
        public final boolean LIZ(C16GX c16gx) {
            return !this.LIZ.X0;
        }
    };

    public final void B0() {
        C1295960jpS c1295960jpS = (C1295960jpS) this.P0.getValue();
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        View view = (View) this.V0.getValue();
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public final void C0() {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior;
        C16G1 c16g1;
        View view = (View) this.L0.getValue();
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C16BC c16bc = null;
        if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
            c16bc = c16g1.LIZ;
        }
        if ((c16bc instanceof AppBarLayout$Behavior) && (appBarLayout$BaseBehavior = (AppBarLayout$BaseBehavior) c16bc) != null) {
            appBarLayout$BaseBehavior.setDragCallback(this.b1);
        }
        C19E3 c19e3 = (C19E3) this.Q0.getValue();
        if (c19e3 != null) {
            c19e3.setTapDismissActive(this.X0);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC214814194y, X.AbstractC1447660nm8, com.bytedance.scene.Scene
    public final void onDestroyView() {
        Activity activity = this.mActivity;
        C0EHK.LJFF(activity instanceof C19EG ? (C19EG) activity : null);
        super.onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        String creationId;
        String str;
        String creationId2;
        String str2;
        super.onResume();
        AbstractC359300E6u abstractC359300E6u = (C286460BKq.LIZ() && Intrinsics.LJFF(this.Y0, "new_edit")) ? C0E9B.LIZIZ : this.Z0 ? C359210E6l.LIZIZ : C359220E6m.LIZIZ;
        C378370EsV c378370EsV = C378370EsV.LIZ;
        ShortVideoContext shortVideoContext = this.a1;
        if (shortVideoContext == null || (creationId = shortVideoContext.getCreationId()) == null) {
            creationId = "";
        }
        ShortVideoContext shortVideoContext2 = this.a1;
        if (shortVideoContext2 == null || (str = shortVideoContext2.shootWay) == null) {
            str = "";
        }
        C359280E6s c359280E6s = C359280E6s.LIZIZ;
        c378370EsV.getClass();
        C378390EsX c378390EsX = C378390EsX.LIZIZ;
        EnumC359320E6w enumC359320E6w = EnumC359320E6w.AI_CREATE;
        C378370EsV.LIZJ(creationId, str, "upload", c378390EsX, abstractC359300E6u, false, c359280E6s, enumC359320E6w);
        ShortVideoContext shortVideoContext3 = this.a1;
        if (shortVideoContext3 == null || (creationId2 = shortVideoContext3.getCreationId()) == null) {
            creationId2 = "";
        }
        ShortVideoContext shortVideoContext4 = this.a1;
        if (shortVideoContext4 == null || (str2 = shortVideoContext4.shootWay) == null) {
            str2 = "";
        }
        C378370EsV.LIZJ(creationId2, str2, "upload", c378390EsX, abstractC359300E6u, false, C359270E6r.LIZIZ, enumC359320E6w);
    }

    public final void y0(boolean z) {
        String str;
        Intent intent = new Intent();
        if (z) {
            str = "key_ep_aigc_new_album_style_video_entry";
        } else {
            str = "key_ep_aigc_new_album_style_image_entry";
        }
        intent.putExtra("key_ep_aigc_new_album_style_entry_type", str);
        setResult(C538540LAe.LLJJJIL, intent);
        MvChoosePhotoScene.onFinish$default(this, false, null, 2, null);
    }

    public static final void A0(ViewGroup viewGroup, Function1 function1) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getId() != R.id.w10) {
                function1.invoke(childAt);
            }
        }
    }

    public static final void z0(final RecyclerView recyclerView, final EPAICreateSelectMaterialScene ePAICreateSelectMaterialScene) {
        ViewGroup viewGroup;
        if (!recyclerView.isNestedScrollingEnabled()) {
            return;
        }
        recyclerView.setNestedScrollingEnabled(false);
        final GestureDetector gestureDetector = new GestureDetector(recyclerView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: X.19E4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY()) != null) {
                    EPAICreateSelectMaterialScene ePAICreateSelectMaterialScene2 = ePAICreateSelectMaterialScene;
                    ePAICreateSelectMaterialScene2.X0 = false;
                    ePAICreateSelectMaterialScene2.C0();
                }
                return false;
            }
        });
        recyclerView.addOnItemTouchListener(new C0KFD() { // from class: X.0JOC
            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView2, MotionEvent motionEvent) {
                ViewParent parent;
                gestureDetector.onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if ((actionMasked != 0 && actionMasked != 2) || (parent = recyclerView2.getParent()) == null) {
                    return false;
                }
                parent.requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        ViewParent parent = recyclerView.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS75S0200000_6(ePAICreateSelectMaterialScene, viewGroup, 144));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0259  */
    @Override // com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC214814194y, com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean zLIZIZ;
        Resources.Theme theme;
        int i;
        Activity activity = this.mActivity;
        if (activity != null) {
            zLIZIZ = C960203pA.LIZIZ(activity);
        } else {
            zLIZIZ = true;
        }
        Activity activity2 = this.mActivity;
        if (activity2 != null && (theme = activity2.getTheme()) != null) {
            if (zLIZIZ) {
                i = R.style.z4;
            } else {
                i = R.style.z5;
            }
            theme.applyStyle(i, true);
        }
        LLLLJ(new AwS44S0010000_32(zLIZIZ, 2));
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(this);
        if (interfaceC20597015iiLJ != null) {
            interfaceC20597015iiLJ.ac(this);
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eps, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene, com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene, X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
