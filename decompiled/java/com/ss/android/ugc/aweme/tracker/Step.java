package com.ss.android.ugc.aweme.tracker;

import X.C1200030hKj;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2177408g0;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2344009Gk;
import X.InterfaceC1199990hKf;
import Y.ARunnableS81S0200000_12;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class Step implements InterfaceC1199990hKf {
    public final String LIZ;
    public final boolean LIZIZ;
    public final C1200030hKj LIZJ;
    public volatile boolean LIZLLL;
    public volatile boolean LJ;
    public long LJFF = SystemClock.elapsedRealtime();
    public final Map<String, String> LJI = new LinkedHashMap();

    public final void LIZIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("endWhenFailed，loadScene=");
        sbLIZ.append(this.LIZJ.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, true);
        c2344009Gk.LIZJ(0, "is_success");
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LJFF, "duration");
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LIZJ.LIZLLL, "duration_to_start");
        C20684815ws.LJIILLIIL(this.LIZJ.LIZ, c2344009Gk.LIZ);
        if (this.LIZIZ) {
            this.LIZJ.LJ = "finish";
        }
    }

    public final void LIZJ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, true);
        c2344009Gk.LIZJ(1, "is_success");
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LJFF, "duration");
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LIZJ.LIZLLL, "duration_to_start");
        C20684815ws.LJIILLIIL(this.LIZJ.LIZ, c2344009Gk.LIZ);
        if (this.LIZIZ) {
            this.LIZJ.LJ = "finish";
        }
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf LJIJJLI() {
        this.LJI.put("error_type", "empty_data");
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf start() {
        if (!this.LIZLLL) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.LJFF = jElapsedRealtime;
            if (this.LIZIZ) {
                this.LIZJ.LIZLLL = jElapsedRealtime;
            }
            this.LIZLLL = true;
            C2344009Gk c2344009Gk = new C2344009Gk();
            LIZ(c2344009Gk, false);
            c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - this.LIZJ.LIZLLL, "duration_to_start");
            C20684815ws.LJIILLIIL(this.LIZJ.LIZ, c2344009Gk.LIZ);
        }
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final /* bridge */ /* synthetic */ InterfaceC1199990hKf LJJIFFI() {
        LIZIZ();
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf LJIJ(boolean z) {
        String str;
        Map<String, String> map = this.LJI;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_cache", str);
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf LJIJI(String str) {
        this.LJI.put("error_type", str);
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf LJIJJ(Map<String, String> map) {
        this.LJI.putAll(map);
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf LJIL(LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getLifecycle().addObserver(new Step$bindLife$1(this));
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf LJJ(final View view) {
        if (!this.LJ) {
            this.LJ = true;
            if (view == null) {
                LIZJ();
            } else {
                ViewTreeObserver.OnDrawListener onDrawListener = new ViewTreeObserver.OnDrawListener() { // from class: X.0T64
                    public boolean LL;

                    @Override // android.view.ViewTreeObserver.OnDrawListener
                    public final void onDraw() {
                        if (this.LL) {
                            return;
                        }
                        this.LL = true;
                        this.LLILLJJLI.LIZJ();
                        View view2 = view;
                        HandlerHook.viewPost(view2, new ARunnableS81S0200000_12(this, view2, 130));
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnDrawListener(onDrawListener);
                    C2187701Ajg.LIZ(viewTreeObserver, onDrawListener, ViewTreeObserver.OnDrawListener.class);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // X.InterfaceC1199990hKf
    public final InterfaceC1199990hKf LJJI(Throwable th) {
        Pair pairLIZIZ = C2177408g0.LIZIZ(th);
        this.LJI.put("error_type", (String) pairLIZIZ.getFirst());
        this.LJI.put("error_msg", (String) pairLIZIZ.getSecond());
        return this;
    }

    public final void LIZ(C2344009Gk c2344009Gk, boolean z) {
        c2344009Gk.LIZJ(z ? 1 : 0, "is_step_end");
        c2344009Gk.LJFF("step", this.LIZ);
        C1200030hKj c1200030hKj = this.LIZJ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(Scene.SCENE_SERVICE, c1200030hKj.LIZIZ);
        pairArr[1] = new Pair("scene_state", c1200030hKj.LJ);
        String str = c1200030hKj.LIZJ;
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("sub_scene_type", str);
        c2344009Gk.LJII(C2097608Jq.LJIIIIZZ(pairArr));
        c2344009Gk.LJII(this.LJI);
    }

    public Step(String str, boolean z, C1200030hKj c1200030hKj) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = c1200030hKj;
    }
}
