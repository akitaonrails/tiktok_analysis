package com.ss.android.ugc.aweme.inbox.bulletin.assem.create;

import X.C01GW;
import X.C0HU6;
import X.C0HUY;
import X.C0HV5;
import X.C0OUZ;
import X.C10UZ;
import X.C1342130l1v;
import X.C1378990lzN;
import X.C1697810uHb;
import X.C1776900wLA;
import X.C1954807lC;
import X.C19746312Np;
import X.C19746412Nq;
import X.C21647019ng;
import X.C21647819no;
import X.C21648719nx;
import X.C2189731Amx;
import X.C364401bG;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19746112Nn;
import X.EnumC21647919np;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.create.BulletinBoardCreateAnimAssem;
import java.util.Collections;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS445S0200000_9;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class BulletinBoardCreateAnimAssem extends UIContentAssem {
    public C21647019ng LLJJIJIIJIL;
    public C21647019ng LLJJIJIL;
    public C21647019ng LLJJJ;
    public C21647019ng LLJJJIL;
    public C21647019ng LLJJJJ;
    public C21647019ng LLJJJJJIL;
    public C21647019ng LLJJJJLIIL;
    public C21647019ng LLJJL;
    public GestureDetector LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2483));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2475));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2478));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2482));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2481));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2479));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2484));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2485));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2476));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2477));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2480));
    public EnumC21647919np LLJJLIIIJLLLLLLLZ = EnumC21647919np.PHASE_1;
    public final BPEAHandler LLJLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS133S0100000_33 LLJLLIL = new ARunnableS133S0100000_33(this, 59);
    public final C01GW LLJLLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(137));

    public final void Jo() {
        this.LLJLIL = 0;
        C2189731Amx c2189731Amx = new C2189731Amx(this, 3);
        C21647019ng c21647019ng = this.LLJJIJIIJIL;
        if (c21647019ng != null) {
            c21647019ng.LIZJ("text_container_1", c2189731Amx);
        }
        C21647019ng c21647019ng2 = this.LLJJIJIL;
        if (c21647019ng2 != null) {
            c21647019ng2.LIZJ("text_container_2", c2189731Amx);
        }
        C21647019ng c21647019ng3 = this.LLJJJ;
        if (c21647019ng3 != null) {
            c21647019ng3.LIZJ("emoji_container_alpha", c2189731Amx);
        }
        C21647019ng c21647019ng4 = this.LLJJJIL;
        if (c21647019ng4 != null) {
            c21647019ng4.LIZJ("image_container_alpha", c2189731Amx);
        }
        C21647019ng c21647019ng5 = this.LLJJJJ;
        if (c21647019ng5 != null) {
            c21647019ng5.LIZJ("time_container_alpha", c2189731Amx);
        }
        C21647019ng c21647019ng6 = this.LLJJJJJIL;
        if (c21647019ng6 != null) {
            c21647019ng6.LIZJ("poll_container_alpha", c2189731Amx);
        }
        C21647019ng c21647019ng7 = this.LLJJJJLIIL;
        if (c21647019ng7 != null) {
            c21647019ng7.LIZJ("dot_1", c2189731Amx);
        }
        C21647019ng c21647019ng8 = this.LLJJL;
        if (c21647019ng8 != null) {
            c21647019ng8.LIZJ("dot_2", c2189731Amx);
        }
        C21647019ng c21647019ng9 = this.LLJJIJIIJIL;
        if (c21647019ng9 != null) {
            c21647019ng9.LJI(true);
        }
        C21647019ng c21647019ng10 = this.LLJJIJIL;
        if (c21647019ng10 != null) {
            c21647019ng10.LJI(true);
        }
        C21647019ng c21647019ng11 = this.LLJJJ;
        if (c21647019ng11 != null) {
            c21647019ng11.LJI(true);
        }
        C21647019ng c21647019ng12 = this.LLJJJIL;
        if (c21647019ng12 != null) {
            c21647019ng12.LJI(true);
        }
        C21647019ng c21647019ng13 = this.LLJJJJ;
        if (c21647019ng13 != null) {
            c21647019ng13.LJI(true);
        }
        C21647019ng c21647019ng14 = this.LLJJJJJIL;
        if (c21647019ng14 != null) {
            c21647019ng14.LJI(true);
        }
        C21647019ng c21647019ng15 = this.LLJJJJLIIL;
        if (c21647019ng15 != null) {
            c21647019ng15.LJI(true);
        }
        C21647019ng c21647019ng16 = this.LLJJL;
        if (c21647019ng16 != null) {
            c21647019ng16.LJI(true);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final void Go() {
        C21647019ng c21647019ng = this.LLJJIJIIJIL;
        if (c21647019ng != null) {
            c21647019ng.LIZ();
        }
        C21647019ng c21647019ng2 = this.LLJJIJIL;
        if (c21647019ng2 != null) {
            c21647019ng2.LIZ();
        }
        C21647019ng c21647019ng3 = this.LLJJJ;
        if (c21647019ng3 != null) {
            c21647019ng3.LIZ();
        }
        C21647019ng c21647019ng4 = this.LLJJJIL;
        if (c21647019ng4 != null) {
            c21647019ng4.LIZ();
        }
        C21647019ng c21647019ng5 = this.LLJJJJ;
        if (c21647019ng5 != null) {
            c21647019ng5.LIZ();
        }
        C21647019ng c21647019ng6 = this.LLJJJJJIL;
        if (c21647019ng6 != null) {
            c21647019ng6.LIZ();
        }
        C21647019ng c21647019ng7 = this.LLJJJJLIIL;
        if (c21647019ng7 != null) {
            c21647019ng7.LIZ();
        }
        C21647019ng c21647019ng8 = this.LLJJL;
        if (c21647019ng8 != null) {
            c21647019ng8.LIZ();
        }
    }

    public final void Ho() {
        if (this.LLJJLIIIJLLLLLLLZ == EnumC21647919np.PHASE_1) {
            if (this.LLJLILLLLZIIL) {
                Lo();
                return;
            }
            this.LLJLL.removeCallbacks(this.LLJLLIL);
            this.LLJLILLLLZIIL = true;
            Jo();
            this.LLJJLIIIJLLLLLLLZ = EnumC21647919np.PHASE_2;
        }
    }

    public final void Lo() {
        int i = C21647819no.LIZ[this.LLJJLIIIJLLLLLLLZ.ordinal()];
        if (i == 1) {
            C786410Ut5.V4((ImageView) this.LLJI.getValue(), 0.0f);
            C786410Ut5.V4((ImageView) this.LLJIJIL.getValue(), 1.0f);
            C786410Ut5.V4((ImageView) this.LLJILJIL.getValue(), 1.0f);
            C786410Ut5.V4((ImageView) this.LLJILJILJ.getValue(), 1.0f);
            C786410Ut5.T4((View) this.LLJILLL.getValue(), 0.0f);
            C786410Ut5.T4((View) this.LLJJ.getValue(), 1.0f);
            C786410Ut5.T4((View) this.LLJJI.getValue(), 0.5f);
            C786410Ut5.T4((View) this.LLJJIII.getValue(), 1.0f);
            this.LLJJLIIIJLLLLLLLZ = EnumC21647919np.PHASE_2;
            return;
        }
        if (i != 2) {
            throw new C1954807lC();
        }
        C786410Ut5.V4((ImageView) this.LLJI.getValue(), 1.0f);
        C786410Ut5.gd((ImageView) this.LLJI.getValue(), 0.0f);
        C786410Ut5.V4((ImageView) this.LLJIJIL.getValue(), 0.0f);
        C786410Ut5.V4((ImageView) this.LLJILJIL.getValue(), 0.0f);
        C786410Ut5.V4((ImageView) this.LLJILJILJ.getValue(), 0.0f);
        C786410Ut5.T4((View) this.LLJILLL.getValue(), 1.0f);
        C786410Ut5.T4((View) this.LLJJ.getValue(), 0.0f);
        C786410Ut5.T4((View) this.LLJJI.getValue(), 1.0f);
        C786410Ut5.T4((View) this.LLJJIII.getValue(), 0.5f);
        this.LLJJLIIIJLLLLLLLZ = EnumC21647919np.PHASE_1;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ((C0OUZ) this.LLJLLL.getValue()).LIZIZ();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (!this.LLJLILLLLZIIL) {
            this.LLJLL.removeCallbacks(this.LLJLLIL);
        }
        Go();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ((C0OUZ) this.LLJLLL.getValue()).LJ();
        C1378990lzN.LIZIZ((View) this.LLJJIJI.getValue(), null, Float.valueOf(C418440Gaw.LIZIZ(36)), null, null, null, 29);
        Context context = getContext();
        if (context != null) {
            C19746412Nq c19746412Nq = new C19746412Nq("text_container_1", new C0HUY(1.0f, 0.0f));
            C19746412Nq c19746412Nq2 = new C19746412Nq("text_container_2", new C0HUY(0.0f, 1.0f));
            View view2 = (View) this.LLJILLL.getValue();
            EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
            this.LLJJIJIIJIL = new C21647019ng(context, view2, new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(246.74f), new C1342130l1v(28.27f)), Collections.singletonList(c19746412Nq)), false);
            this.LLJJIJIL = new C21647019ng(context, (View) this.LLJJ.getValue(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(246.74f), new C1342130l1v(28.27f)), Collections.singletonList(c19746412Nq2)), false);
            this.LLJJJ = new C21647019ng(context, (View) this.LLJI.getValue(), new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.33f), new C1342130l1v(0.86f), new C1342130l1v(0.2f), new C1342130l1v(1.0f), 250L), C1697810uHb.LJIIJJI(new C19746412Nq("emoji_container_alpha", new C0HUY(1.0f, 0.0f)), new C19746412Nq("emoji_container_translation", new C0HV5(0.0f, C418440Gaw.LIZIZ(-48))))), false);
            this.LLJJJIL = new C21647019ng(context, (View) this.LLJIJIL.getValue(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(438.65f), new C1342130l1v(37.7f)), C1697810uHb.LJIIJJI(new C19746412Nq("image_container_alpha", new C0HUY(0.0f, 1.0f)), new C19746412Nq("image_container_translation", new C0HV5(C418440Gaw.LIZIZ(10), 0.0f)))), false);
            this.LLJJJJ = new C21647019ng(context, (View) this.LLJILJIL.getValue(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(438.65f), new C1342130l1v(37.7f)), C1697810uHb.LJIIJJI(new C19746412Nq("time_container_alpha", new C0HUY(0.0f, 1.0f)), new C19746412Nq("time_container_translation", new C0HV5(C418440Gaw.LIZIZ(60), 0.0f)))), false);
            this.LLJJJJJIL = new C21647019ng(context, (View) this.LLJILJILJ.getValue(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(109.66f), new C1342130l1v(16.76f)), C1697810uHb.LJIIJJI(new C19746412Nq("poll_container_alpha", new C0HUY(0.0f, 1.0f)), new C19746412Nq("poll_container_translation", new C0HV5(C418440Gaw.LIZIZ(95), 0.0f)))), false);
            C19746412Nq c19746412Nq3 = new C19746412Nq("dot_1", new C0HUY(1.0f, 0.5f));
            C19746412Nq c19746412Nq4 = new C19746412Nq("dot_2", new C0HUY(0.5f, 1.0f));
            this.LLJJJJLIIL = new C21647019ng(context, (View) this.LLJJI.getValue(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(246.74f), new C1342130l1v(28.27f)), Collections.singletonList(c19746412Nq3)), false);
            this.LLJJL = new C21647019ng(context, (View) this.LLJJIII.getValue(), new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(246.74f), new C1342130l1v(28.27f)), Collections.singletonList(c19746412Nq4)), false);
        }
        this.LLJL = new GestureDetector(getContext(), new C21648719nx() { // from class: X.19nn
            public final int LL = 50;
            public final int LLILLJJLI = 100;

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                int i = C21648019nq.LIZ[this.LLILLL.LLJJLIIIJLLLLLLLZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        BulletinBoardCreateAnimAssem bulletinBoardCreateAnimAssem = this.LLILLL;
                        if (bulletinBoardCreateAnimAssem.LLJJLIIIJLLLLLLLZ == EnumC21647919np.PHASE_2) {
                            if (bulletinBoardCreateAnimAssem.LLJLIL == 8) {
                                bulletinBoardCreateAnimAssem.Lo();
                            } else {
                                bulletinBoardCreateAnimAssem.Go();
                                return true;
                            }
                        }
                        return true;
                    }
                    throw new C1954807lC();
                }
                this.LLILLL.Ho();
                return true;
            }

            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(x) <= Math.abs(motionEvent2.getY() - motionEvent.getY()) || Math.abs(x) <= this.LL || Math.abs(f) <= this.LLILLJJLI) {
                    return false;
                }
                if (x > 0.0f) {
                    BulletinBoardCreateAnimAssem bulletinBoardCreateAnimAssem = this.LLILLL;
                    if (bulletinBoardCreateAnimAssem.LLJJLIIIJLLLLLLLZ == EnumC21647919np.PHASE_2) {
                        if (bulletinBoardCreateAnimAssem.LLJLIL == 8) {
                            bulletinBoardCreateAnimAssem.Lo();
                            return true;
                        }
                        bulletinBoardCreateAnimAssem.Go();
                        return true;
                    }
                    return true;
                }
                this.LLILLL.Ho();
                return true;
            }
        });
        C364401bG.LIZIZ(C364401bG.LIZ("quick_create_sheet", "bg", C10UZ.LIZLLL(view.getContext())), LifecycleOwnerKt.getLifecycleScope(this), new AwS445S0200000_9(this, view, 4));
    }
}
