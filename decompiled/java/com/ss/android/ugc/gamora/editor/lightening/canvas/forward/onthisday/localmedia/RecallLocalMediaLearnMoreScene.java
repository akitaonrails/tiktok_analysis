package com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.localmedia;

import X.AbstractC214814194y;
import X.C0MQO;
import X.C1308910kAL;
import X.C1766560w4U;
import X.C384050F3z;
import X.C418440Gaw;
import X.C431260Gvc;
import X.C786410Ut5;
import X.C814420VxA;
import X.C960203pA;
import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes9.dex */
public final class RecallLocalMediaLearnMoreScene extends AbstractC214814194y {
    public boolean LLJJIJIL;
    public VideoPublishEditModel LLJJJ;
    public List<ForwardMedia> LLJJJIL;

    public final void LLLLL() {
        if (this.LLJJIJIL) {
            EventBus.LIZLLL().LJIILL(new Object() { // from class: X.0MR5
            });
        } else {
            finish();
        }
    }

    public RecallLocalMediaLearnMoreScene() {
        LLLLJ(AFwS239S0000000_8.get$arr$(204));
    }

    public final View LLLLJI(String str) {
        int iIntValue;
        Context contextRequireSceneContext = requireSceneContext();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, contextRequireSceneContext);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        View viewLJLLJ = C786410Ut5.LJLLJ(contextRequireSceneContext, R.layout.gb, null);
        ImageView imageView = (ImageView) viewLJLLJ.findViewById(R.id.cy0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(iIntValue);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        imageView.setImageDrawable(c384050F3z.LIZ(contextRequireSceneContext));
        C786410Ut5.LJZI(0, imageView);
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.cy1);
        tuxTextView.setTuxFont(101);
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setText(str);
        tuxTextView.setTextDirection(5);
        tuxTextView.setMovementMethod(C431260Gvc.LIZ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C786410Ut5.W5(viewLJLLJ, layoutParams);
        return viewLJLLJ;
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        TuxImmersionBar tuxImmersionBarLJ = C1766560w4U.LJ(requireFragmentActivity());
        tuxImmersionBarLJ.LIZJ(false, false);
        tuxImmersionBarLJ.LJ(R.attr.zm);
        tuxImmersionBarLJ.LJIIIIZZ(R.attr.zm);
        tuxImmersionBarLJ.LIZIZ.LJIIJ(true);
        tuxImmersionBarLJ.LIZLLL();
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 100), requireViewById(R.id.l_a));
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 101), requireViewById(R.id.zzh));
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 102), requireViewById(R.id.z9c));
        SmartImageView smartImageView = (SmartImageView) requireViewById(R.id.lqq);
        HandlerHook.viewPost(smartImageView, new ARunnableS108S0100000_8(smartImageView, 84));
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2;
        if (C960203pA.LIZIZ(requireContext())) {
            i = R.style.y0;
        } else {
            i = R.style.xm;
        }
        LLLLJ(new AwS23S0001000_8(i, 8));
        if (C0MQO.LIZ()) {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.er9, viewGroup, false);
        } else {
            viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.er8, viewGroup, false);
        }
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.l2l);
        View viewLLLLJI = LLLLJI(getString(2131838686));
        View viewLLLLJI2 = LLLLJI(getString(2131838687));
        View viewLLLLJI3 = LLLLJI(getString(2131838688));
        View viewLLLLJI4 = LLLLJI(getString(2131838689));
        viewGroup3.addView(viewLLLLJI, viewLLLLJI.getLayoutParams());
        viewGroup3.addView(viewLLLLJI2, viewLLLLJI2.getLayoutParams());
        viewGroup3.addView(viewLLLLJI3, viewLLLLJI3.getLayoutParams());
        viewGroup3.addView(viewLLLLJI4, viewLLLLJI4.getLayoutParams());
        return viewGroup2;
    }
}
