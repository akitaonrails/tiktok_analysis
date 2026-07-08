package com.ss.android.ugc.tools.chat.demo;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0MGE;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatDemoRootScene extends AbstractC214814194y implements C0MGE {
    public final ArrayList<InterfaceC484050IyZ> LLJJIJIL;
    public final ArrayList<InterfaceC362610EJn> LLJJJ;
    public final C01GW LLJJJIL;

    @Override // X.AbstractC214814194y
    public final int getFinishAnimationType() {
        return 3;
    }

    @Override // X.AbstractC214814194y
    public final int getStartAnimationType() {
        return DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
    }

    public AiChatDemoRootScene() {
        LLLLJ(AFwS278S0000000_32.get$arr$(117));
        this.LLJJIJIL = new ArrayList<>();
        this.LLJJJ = new ArrayList<>();
        this.LLJJJIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 384));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        String string;
        super.onActivityCreated(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("enter_params")) != null) {
            C1664590tQ1.LIZLLL(this, null, false, AFwS278S0000000_32.get$arr$(118), 3);
            C1664600tQ2.LIZ(this, null, new AwS146S1100000_32(this, string, 7));
            return;
        }
        throw new RuntimeException("need a session id");
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<InterfaceC362610EJn> it2 = this.LLJJJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLJJIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AbstractC1447660nm8, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bjg, viewGroup, false);
    }
}
