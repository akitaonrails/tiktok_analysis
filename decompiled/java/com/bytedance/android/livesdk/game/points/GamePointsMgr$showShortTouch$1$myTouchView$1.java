package com.bytedance.android.livesdk.game.points;

import X.C0JT6;
import X.C1096990eeX;
import X.InterfaceC1085330eLj;
import X.InterfaceC772390URp;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class GamePointsMgr$showShortTouch$1$myTouchView$1 implements InterfaceC1085330eLj, GenericLifecycleObserver {
    public final /* synthetic */ InterfaceC1085330eLj LL;
    public final /* synthetic */ InterfaceC1085330eLj LLILLJJLI;
    public final /* synthetic */ GamePointsMgr LLILLL;

    @Override // X.InterfaceC1085330eLj
    public final void Ec2() {
        this.LL.Ec2();
    }

    @Override // X.InterfaceC1085330eLj
    public final void JG1(String str, JSONObject jSONObject) {
        this.LL.JG1(str, jSONObject);
    }

    @Override // X.InterfaceC1085330eLj
    public final View LLLILZJ() {
        return this.LL.LLLILZJ();
    }

    @Override // X.InterfaceC1085330eLj
    public final void Pl() {
        this.LL.Pl();
    }

    @Override // X.InterfaceC1085330eLj
    public final String dT1() {
        return this.LL.dT1();
    }

    @Override // X.InterfaceC1085330eLj
    public final String mP0() {
        return this.LL.mP0();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1085330eLj
    public final void LJLJL() {
        this.LLILLJJLI.LJLJL();
        C1096990eeX c1096990eeX = this.LLILLL.LLILZLL;
        if (c1096990eeX != null) {
            c1096990eeX.LJ();
        }
    }

    @Override // X.InterfaceC1085330eLj
    public final void LLLZI() {
        this.LLILLJJLI.LLLZI();
        GamePointsMgr gamePointsMgr = this.LLILLL;
        C0JT6<String> c0jt6 = InterfaceC772390URp.LLZLI;
        gamePointsMgr.getClass();
        if (GamePointsMgr.LJI(c0jt6)) {
            this.LLILLL.LJJIJ("task_entrance", true);
        }
    }

    @Override // X.InterfaceC1085330eLj
    public final String Sr() {
        return this.LLILLJJLI.Sr();
    }

    @Override // X.InterfaceC1085330eLj
    public final void kk0(Map<String, String> map) {
        this.LLILLJJLI.kk0(map);
    }

    public GamePointsMgr$showShortTouch$1$myTouchView$1(InterfaceC1085330eLj interfaceC1085330eLj, GamePointsMgr gamePointsMgr) {
        this.LLILLJJLI = interfaceC1085330eLj;
        this.LLILLL = gamePointsMgr;
        this.LL = interfaceC1085330eLj;
    }
}
