package com.ss.android.ugc.aweme.socialavatar.view.socialavatar;

import X.C01GW;
import X.C098200Yq;
import X.C099M;
import X.C099Q;
import X.C099R;
import X.C0HMP;
import X.C0HYP;
import X.C0PEM;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1591860rWi;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C19MB;
import X.C19ME;
import X.C1DFH;
import X.C2107308Nj;
import X.C21415018rM;
import X.C2252611DEt;
import X.C23250099c;
import X.C418440Gaw;
import X.C426750GoL;
import X.C433250Gyp;
import X.C433310Gyv;
import X.C437650HEd;
import X.C439470HLd;
import X.C452501pT;
import X.C463080IDy;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import X.EnumC439500HLg;
import X.EnumC439790HMj;
import X.InterfaceC1364105Vn;
import Y.ACListenerS110S0200000_6;
import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes7.dex */
public final class SAEffectPopupFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYjKiYyJCQ6KDsyOms6HELIOSICokZjYjKiYyJCQ6KDsyOmsfCAo1LiAvPR88ODA8Dz0yLygpJzs=";
    public final EnumC439790HMj LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(319));
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(318));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(327));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(328));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(329));
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(317));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(320));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(321));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 699));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(316));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(324));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(326));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(325));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(322));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(323));

    public final int NR() {
        return ((Number) this.LLIZ.getValue()).intValue();
    }

    public final SmartImageView OR() {
        return (SmartImageView) this.LLJI.getValue();
    }

    public SAEffectPopupFragment(EnumC439790HMj enumC439790HMj) {
        this.LL = enumC439790HMj;
    }

    public static Object PR(String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIZ.LJJII(new C463080IDy(c2252611DEt, 0));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public final Bitmap MR(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(NR(), NR(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        Rect rect = new Rect(0, 0, NR(), NR());
        canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
        paint.setXfermode(null);
        return bitmapCreateBitmap;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0HYP.LIZ.getClass();
        C0HYP.LJ().storeBoolean("has_shown_effect_popup", true);
        C439470HLd c439470HLd = C439470HLd.LIZ;
        EnumC439790HMj enumC439790HMj = this.LL;
        EnumC439500HLg enumC439500HLg = EnumC439500HLg.SHOW;
        c439470HLd.getClass();
        C439470HLd.LIZJ(enumC439790HMj, enumC439500HLg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bitmap bitmapDecodeByteArray;
        String str;
        Context contextRequireContext = requireContext();
        ConstraintLayout constraintLayout = new ConstraintLayout(contextRequireContext);
        C786410Ut5.m6(constraintLayout, new ViewGroup.LayoutParams(-1, -1));
        constraintLayout.setBackgroundColor(C960203pA.LIZ(R.attr.a1b, contextRequireContext));
        SmartImageView smartImageView = new SmartImageView(contextRequireContext);
        smartImageView.setId(View.generateViewId());
        C786410Ut5.G6(smartImageView, new C19ME(-1, ((Number) this.LLILLJJLI.getValue()).intValue()));
        if (C960203pA.LIZIZ(contextRequireContext)) {
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(C437650HEd.LIZ().effectHeaderBackgroundDarkUrl));
            c1331670kl3LJI.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJI.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJI);
        } else {
            C1331670kl3 c1331670kl3LJI2 = C1331660kl2.LJI(UriProtector.parse(C437650HEd.LIZ().effectHeaderBackgroundLightUrl));
            c1331670kl3LJI2.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJI2.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJI2);
        }
        SmartImageView smartImageView2 = new SmartImageView(contextRequireContext);
        smartImageView2.setId(View.generateViewId());
        C786410Ut5.G6(smartImageView2, new C19ME(NR(), NR()));
        if (C960203pA.LIZIZ(contextRequireContext)) {
            C1331670kl3 c1331670kl3LJI3 = C1331660kl2.LJI(UriProtector.parse(C437650HEd.LIZ().hexagonBackgroundDark));
            c1331670kl3LJI3.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJI3.LJJ(smartImageView2);
            C786410Ut5.h3(c1331670kl3LJI3);
        } else {
            C1331670kl3 c1331670kl3LJI4 = C1331660kl2.LJI(UriProtector.parse(C437650HEd.LIZ().hexagonBackgroundLight));
            c1331670kl3LJI4.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJI4.LJJ(smartImageView2);
            C786410Ut5.h3(c1331670kl3LJI4);
        }
        SmartImageView smartImageViewOR = OR();
        smartImageViewOR.setId(View.generateViewId());
        String str2 = (String) this.LLJIJIL.getValue();
        String str3 = (String) this.LLJILJIL.getValue();
        C19GS c19gs = null;
        if (str2 != null && str3 != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C433310Gyv(smartImageViewOR, this, str2, str3, null), 2);
        }
        C0HMP.LIZ.getClass();
        byte[] bytes = C0HMP.LIZJ().getBytes(C0HMP.LJ("key_effect_header_image"), null);
        if (bytes != null) {
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        } else {
            bitmapDecodeByteArray = null;
        }
        if (bitmapDecodeByteArray != null && (str = (String) this.LLJILJIL.getValue()) != null) {
            SmartImageView smartImageViewOR2 = OR();
            LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope2, C2107308Nj.LIZ, null, new C433250Gyp(smartImageViewOR2, this, bitmapDecodeByteArray, str, null), 2);
        }
        int i = 6;
        C21415018rM c21415018rM = new C21415018rM(contextRequireContext, null, 6);
        c21415018rM.setId(View.generateViewId());
        C786410Ut5.Q6(c21415018rM, new C19ME(0, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(View.generateViewId());
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        C197039127h c197039127h = new C197039127h(linearLayout.getContext(), null == true ? 1 : 0, i, 0);
        C786410Ut5.J6(c197039127h, new LinearLayout.LayoutParams(-1, -2));
        C426750GoL.LJIIIZ(c197039127h, Integer.valueOf(((Number) this.LLIZLLLIL.getValue()).intValue()), Integer.valueOf(((Number) this.LLJ.getValue()).intValue()), Integer.valueOf(((Number) this.LLIZLLLIL.getValue()).intValue()), Integer.valueOf(((Number) this.LLJ.getValue()).intValue()), false, 16);
        c197039127h.LJJJJL(new AwS580S0100000_1(c197039127h, 388));
        c197039127h.setTextColorRes(R.attr.a0o);
        c197039127h.setTuxFont(102);
        c197039127h.setText(c197039127h.getContext().getString(2131846693));
        C786410Ut5.U8(c197039127h, new ACListenerS110S0200000_6(this, c197039127h, 24));
        TuxTextView tuxTextView = new TuxTextView(linearLayout.getContext(), null == true ? 1 : 0, i, 0);
        C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
        C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21))), false, 21);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setTuxFont(102);
        tuxTextView.setText(tuxTextView.getContext().getString(2131846694));
        C786410Ut5.h9(tuxTextView, new ACListenerS141S0100000_6(this, 101));
        linearLayout.addView(c197039127h);
        linearLayout.addView(tuxTextView);
        C1591860rWi.LIZ(constraintLayout, new AwS215S0300000_6(this, c21415018rM, contextRequireContext, 9));
        constraintLayout.addView(smartImageView);
        constraintLayout.addView(c21415018rM);
        constraintLayout.addView(smartImageView2);
        constraintLayout.addView(OR());
        constraintLayout.addView(linearLayout);
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(smartImageView.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(smartImageView.getId(), 7, 0, 7);
        c19mb.LJIIIIZZ(smartImageView.getId(), 3, 0, 3);
        c19mb.LJIIIZ(smartImageView.getId(), 4, c21415018rM.getId(), 3, ((Number) this.LLILLL.getValue()).intValue());
        c19mb.LJIIIZ(c21415018rM.getId(), 6, 0, 6, ((Number) this.LLILZIL.getValue()).intValue());
        c19mb.LJIIIZ(c21415018rM.getId(), 7, 0, 7, ((Number) this.LLILZIL.getValue()).intValue());
        c19mb.LJIIIZ(c21415018rM.getId(), 4, linearLayout.getId(), 3, ((Number) this.LLILZ.getValue()).intValue());
        c19mb.LJIIIIZZ(smartImageView2.getId(), 4, smartImageView.getId(), 4);
        c19mb.LJIIIIZZ(smartImageView2.getId(), 6, smartImageView.getId(), 6);
        c19mb.LJIIIIZZ(smartImageView2.getId(), 7, smartImageView.getId(), 7);
        c19mb.LJIIIIZZ(OR().getId(), 4, smartImageView.getId(), 4);
        c19mb.LJIIIIZZ(OR().getId(), 6, smartImageView.getId(), 6);
        c19mb.LJIIIIZZ(OR().getId(), 7, smartImageView.getId(), 7);
        c19mb.LJIIIIZZ(linearLayout.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(linearLayout.getId(), 7, 0, 7);
        c19mb.LJIIIIZZ(linearLayout.getId(), 4, 0, 4);
        c19mb.LIZIZ(constraintLayout);
        try {
            ViewTreeLifecycleOwner.set(constraintLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(constraintLayout, this);
            constraintLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return constraintLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return constraintLayout;
        }
    }
}
