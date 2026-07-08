package com.ss.android.ugc.aweme.editorpro;

import X.AbstractC1653180t7c;
import X.AbstractC1671300taq;
import X.C01GW;
import X.C0AZF;
import X.C1425580nCW;
import X.C1453290nvD;
import X.C1654320t9S;
import X.C1664590tQ1;
import X.C1664600tQ2;
import X.C1DRG;
import X.C452501pT;
import X.C539900LFk;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC545560LaU;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public final class x extends AbstractC1653180t7c {
    public final C1DRG LLJILLL;
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 108));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 109));

    @Override // X.AbstractC1653180t7c
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.AbstractC1653180t7c
    public final String getTag() {
        return "CreateEntranceScene";
    }

    public final C1453290nvD LLLLILI() {
        return (C1453290nvD) this.LLJJ.getValue();
    }

    @Override // X.AbstractC1653180t7c
    public final void hide() {
        if (isAdded(LLLLILI())) {
            LLLLILI().hide();
        }
    }

    @Override // X.AbstractC1653180t7c
    public final void show() {
        LLLLILI().LLJJJJLIIL = System.currentTimeMillis();
        if (!isAdded(LLLLILI())) {
            add(R.id.grx, LLLLILI(), "CreateEntranceScene");
            show(LLLLILI());
        }
        LLLLILI().show();
    }

    @Override // X.AbstractC1653180t7c
    public final EnumC545560LaU LLLLIL() {
        return EnumC545560LaU.CREATE_SCENE;
    }

    public x(C1DRG c1drg) {
        this.LLJILLL = c1drg;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1425580nCW c1425580nCW = C1425580nCW.LIZIZ;
        Context sceneContext = getSceneContext();
        c1425580nCW.getClass();
        if (sceneContext != null) {
            int iIntValue = ((Number) C0AZF.LIZ.getValue()).intValue();
            boolean zLIZIZ = true;
            if (iIntValue != 0) {
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        zLIZIZ = C960203pA.LIZIZ(sceneContext);
                    }
                } else {
                    zLIZIZ = false;
                }
            }
            AbstractC1671300taq.LIZ = zLIZIZ;
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(59));
        if (C539900LFk.LJII((ShortVideoContext) this.LLJJI.getValue())) {
            C1664590tQ1.LIZLLL(this, null, false, AFwS261S0000000_22.get$arr$(58), 3);
            C1664600tQ2.LIZ(this, null, new AwS601S0100000_22(this, 91));
        } else {
            C1664590tQ1.LIZLLL(this, null, false, AFwS261S0000000_22.get$arr$(60), 3);
            C1664600tQ2.LIZ(this, null, AFwS261S0000000_22.get$arr$(61));
        }
    }

    @Override // X.AbstractC1653180t7c, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(requireSceneContext());
        frameLayout.setId(R.id.grx);
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }
}
