package com.ss.android.ugc.tools.chat.room.scene;

import X.C01GW;
import X.C1308910kAL;
import X.C18T2;
import X.C201955140j;
import X.C452501pT;
import X.C560380LyO;
import X.C560470LyX;
import X.EnumC560450LyV;
import X.InterfaceC1737690vJv;
import X.InterfaceC362610EJn;
import X.InterfaceC484050IyZ;
import Y.AAListenerS317S0100000_6;
import Y.AUListenerS34S0301000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatRoomRootScene extends AiChatBaseScene {
    public final C01GW LLJJIJIL;
    public final ArrayList<InterfaceC484050IyZ> LLJJJ;
    public final ArrayList<InterfaceC362610EJn> LLJJJIL;
    public final ArrayList<InterfaceC1737690vJv> LLJJJJ;
    public AIChatPageConfig LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public boolean LLJJL;
    public AwS611S0100000_32 LLJJLIIIJLLLLLLLZ;
    public AwS611S0100000_32 LLJL;

    @Override // X.AbstractC214814194y, X.C198H
    public final void finish() {
        if (this.LLJJL) {
            LLLLL(1.0f, 0.0f, new AwS576S0100000_32(this, 431));
        } else {
            super.finish();
        }
    }

    @Override // X.AbstractC214814194y, X.C198H
    public final boolean onBackPressed() {
        Iterator<InterfaceC1737690vJv> it2 = this.LLJJJJ.iterator();
        while (it2.hasNext()) {
            if (it2.next().onBackPressed()) {
                return true;
            }
        }
        return super.onBackPressed();
    }

    public AiChatRoomRootScene() {
        C18T2.LIZ.getClass();
        C18T2.LIZIZ.clear();
        C18T2.LIZ("ai_chat_room_boot_duration");
        C18T2.LIZ("ai_chat_room_ready_duration");
        LLLLJ(AFwS239S0000000_8.get$arr$(239));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 802));
        this.LLJJJ = new ArrayList<>();
        this.LLJJJIL = new ArrayList<>();
        this.LLJJJJ = new ArrayList<>();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 803));
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "AiChatRoomRootScene onPause");
    }

    @Override // X.AbstractC214814194y, com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C18T2.LIZ.getClass();
        C18T2.LIZLLL("ai_chat_room_boot_duration");
        C201955140j.LIZIZ("CreativeToolStayTimeMonitor", "AiChatRoomRootScene onResume");
        C560380LyO.LJIILLIIL(new C560470LyX(EnumC560450LyV.OTHERS, System.currentTimeMillis()));
    }

    @Override // X.AbstractC214814194y
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Iterator<InterfaceC362610EJn> it2 = this.LLJJJIL.iterator();
        while (it2.hasNext()) {
            if (it2.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void LLLLL(float f, float f2, Function0<Unit> function0) {
        Object parent;
        View view;
        int iIntValue;
        Context context;
        View view2 = this.mView;
        Integer numLIZJ = null;
        if (view2 != null) {
            parent = view2.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof View) {
            view = (View) parent;
        } else {
            view = null;
        }
        View view3 = this.mView;
        if (view3 != null && (context = view3.getContext()) != null) {
            numLIZJ = C1308910kAL.LIZJ(R.attr.a1_, context);
        }
        if (numLIZJ != null) {
            numLIZJ.intValue();
            iIntValue = (numLIZJ.intValue() >>> 24) & 255;
        } else {
            iIntValue = 0;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS34S0301000_6(this, numLIZJ, iIntValue, view, 0));
        valueAnimatorOfFloat.addListener(new AAListenerS317S0100000_6(function0, 20));
        valueAnimatorOfFloat.start();
    }

    @Override // X.AbstractC214814194y
    public final void onActivityResult(int i, int i2, Intent intent) {
        Iterator<InterfaceC484050IyZ> it2 = this.LLJJJ.iterator();
        while (it2.hasNext()) {
            it2.next().onActivityResult(i, i2, intent);
        }
    }
}
