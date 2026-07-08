package com.ss.android.ugc.aweme.texttoimage.intro;

import X.C07CI;
import X.C098200Yq;
import X.C0VSP;
import X.C1294250jmh;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C1662160tM6;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C201955140j;
import X.C20642515q3;
import X.C418440Gaw;
import X.C426750GoL;
import X.C462630ICf;
import X.C572510Mcr;
import X.C572560Mcw;
import X.C572600Md0;
import X.C581210Mqt;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.texttoimage.setting.CreationTextimageAiVersionConfigModel;
import com.ss.android.ugc.aweme.texttoimage.setting.TextToImageUrlsConfig;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;
import com.zhiliaoapp.musically.R;
import java.io.FileNotFoundException;
import kotlin.Unit;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class TextToImageIntroFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEpMTsnJywhKCHELIOSg2ZiwiPT08ZhEpMTsHJwwhKCg2ASs4OyAVOiQrJCo9PA==";
    public C1295960jpS LL;

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C1295960jpS c1295960jpS = this.LL;
        if (c1295960jpS != null) {
            c1295960jpS.clearAnimation();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLJI;
        String string;
        Object objValueOf;
        C1295960jpS c1295960jpS;
        super.onViewCreated(view, bundle);
        int screenWidth = ScreenUtils.getScreenWidth(getContext());
        C1295960jpS c1295960jpS2 = (C1295960jpS) view.findViewById(R.id.nru);
        int i = (screenWidth * 248) / 390;
        C786410Ut5.s6(c1295960jpS2, new LinearLayout.LayoutParams(-1, i));
        this.LL = c1295960jpS2;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("lottie_file")) != null && string.length() > 0) {
            try {
                C0VSP c0vsp = new C0VSP(string);
                C1295960jpS c1295960jpS3 = this.LL;
                if (c1295960jpS3 != null) {
                    C786410Ut5.LLD(0, c1295960jpS3);
                }
                C1294250jmh.LJ(c0vsp, "text_2_image_intro").LIZIZ(new C581210Mqt(this, 0));
                C1295960jpS c1295960jpS4 = this.LL;
                if (c1295960jpS4 != null) {
                    c1295960jpS4.setRepeatCount(0);
                }
                C1295960jpS c1295960jpS5 = this.LL;
                if (c1295960jpS5 != null) {
                    c1295960jpS5.setRepeatMode(1);
                }
                c1295960jpS = this.LL;
            } catch (FileNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C1662160tM6.LIZIZ, "TextToImageIntro", e);
                objValueOf = Unit.LIZ;
            }
            if (c1295960jpS != null) {
                objValueOf = Boolean.valueOf(HandlerHook.viewPost(c1295960jpS, new ARunnableS108S0100000_8(this, 71)));
                if (objValueOf == null) {
                }
            }
            SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.jcp);
            C786410Ut5.G6(smartImageView, new LinearLayout.LayoutParams(-1, i));
            C786410Ut5.LLFF(0, smartImageView);
            smartImageView.setImageURI(((TextToImageUrlsConfig) C572560Mcw.LIZIZ.getValue()).aiFallbackGuide);
        } else {
            SmartImageView smartImageView2 = (SmartImageView) view.findViewById(R.id.jcp);
            C786410Ut5.G6(smartImageView2, new LinearLayout.LayoutParams(-1, i));
            C786410Ut5.LLFF(0, smartImageView2);
            smartImageView2.setImageURI(((TextToImageUrlsConfig) C572560Mcw.LIZIZ.getValue()).aiFallbackGuide);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.xkw);
        C572510Mcr.LIZ.getClass();
        if (C07CI.LIZIZ()) {
            strLJI = C20642515q3.LJI(2131821506);
        } else {
            strLJI = C20642515q3.LJI(2131821541);
        }
        c197039127h.setText(strLJI);
        C786410Ut5.U8(c197039127h, new ACListenerS143S0100000_8(this, 88));
        if (C07CI.LIZIZ()) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(ColorProtector.parseColor("#101216"));
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(200));
            c197039127h.LJJJJL(new AwS587S0100000_8(gradientDrawable, 303));
        }
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.xkx), new ACListenerS143S0100000_8(this, 89));
        C786410Ut5.O7((FrameLayout) view.findViewById(R.id.xkv), new ACListenerS143S0100000_8(this, 90));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.jdx);
        tuxTextView.LJJJJI(24.0f);
        tuxTextView.setText(C572510Mcr.LIZIZ());
        ((TextView) view.findViewById(R.id.jd3)).setText(C572510Mcr.LIZ());
        if (C07CI.LIZIZ()) {
            C786410Ut5.LLLLLLZZ((TuxIconView) view.findViewById(R.id.xkx), 8);
            C786410Ut5.LJZ(0, (FrameLayout) view.findViewById(R.id.xkv));
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            CreationTextimageAiVersionConfigModel creationTextimageAiVersionConfigModel = C572600Md0.LIZ;
            CreationTextimageAiVersionConfigModel creationTextimageAiVersionConfigModel2 = (CreationTextimageAiVersionConfigModel) settingsManagerLIZLLL.LJIIIIZZ("creation_textimage_ai_version_config", CreationTextimageAiVersionConfigModel.class, creationTextimageAiVersionConfigModel);
            if (creationTextimageAiVersionConfigModel2 != null) {
                creationTextimageAiVersionConfigModel = creationTextimageAiVersionConfigModel2;
            }
            String str = creationTextimageAiVersionConfigModel.disclaimerText;
            if (str != null) {
                TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.xko);
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
                tuxTextView2.setText(str);
                tuxTextView2.setTextSize(10.0f);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iLIZIZ;
        int iLIZIZ2 = 0;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fsv, viewGroup, false);
        if (C07CI.LIZIZ()) {
            RoundingCornerLayout roundingCornerLayout = (RoundingCornerLayout) viewTd.findViewById(R.id.xky);
            C572510Mcr.LIZ.getClass();
            if (C07CI.LIZIZ()) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = 0;
            }
            if (C07CI.LIZIZ()) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            C426750GoL.LJIIIZ(roundingCornerLayout, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ2), 0, false, 16);
            roundingCornerLayout.setRoundingParams(new C462630ICf(C418440Gaw.LIZIZ(40), C418440Gaw.LIZIZ(40), C418440Gaw.LIZIZ(40), C418440Gaw.LIZIZ(40)));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, viewTd.getContext());
            if (numLIZJ != null) {
                viewTd.setBackgroundColor(numLIZJ.intValue());
            }
        }
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
