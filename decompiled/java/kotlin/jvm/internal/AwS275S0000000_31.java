package kotlin.jvm.internal;

import X.C09AY;
import X.C1087110eOb;
import X.C156U;
import X.C1616006Uk;
import X.C166C;
import X.C166M;
import X.C197039127h;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS275S0000000_31 extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS275S0000000_31(int i) {
        super(1);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS275S0000000_31 awS275S0000000_31, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.ddx;
        ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.ddx, viewGroup);
        if (constraintLayout != null) {
            i = R.id.ev4;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ev4, viewGroup);
            if (tuxTextView != null) {
                i = R.id.ev5;
                TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.ev5, viewGroup);
                if (tuxTextView2 != null) {
                    i = R.id.eve;
                    if (C1616006Uk.LIZ(R.id.eve, viewGroup) != null) {
                        i = R.id.evf;
                        TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.evf, viewGroup);
                        if (tuxTextView3 != null) {
                            i = R.id.g3c;
                            LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.g3c, viewGroup);
                            if (linearLayout != null) {
                                i = R.id.jev;
                                if (C1616006Uk.LIZ(R.id.jev, viewGroup) != null) {
                                    i = R.id.kbd;
                                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) C1616006Uk.LIZ(R.id.kbd, viewGroup);
                                    if (viewOnAttachStateChangeListenerC20631115oD != null) {
                                        i = R.id.m45;
                                        View viewLIZ = C1616006Uk.LIZ(R.id.m45, viewGroup);
                                        if (viewLIZ != null) {
                                            i = R.id.m46;
                                            C1087110eOb c1087110eOb = (C1087110eOb) C1616006Uk.LIZ(R.id.m46, viewGroup);
                                            if (c1087110eOb != null) {
                                                i = R.id.oh7;
                                                if (C1616006Uk.LIZ(R.id.oh7, viewGroup) != null) {
                                                    i = R.id.qbl;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) C1616006Uk.LIZ(R.id.qbl, viewGroup);
                                                    if (constraintLayout2 != null) {
                                                        i = R.id.uy8;
                                                        C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.uy8, viewGroup);
                                                        if (c197039127h != null) {
                                                            i = R.id.wrk;
                                                            if (C1616006Uk.LIZ(R.id.wrk, viewGroup) != null) {
                                                                return new C166M((ConstraintLayout) viewGroup, constraintLayout, tuxTextView, tuxTextView2, tuxTextView3, linearLayout, viewOnAttachStateChangeListenerC20631115oD, viewLIZ, c1087110eOb, constraintLayout2, c197039127h);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS275S0000000_31 awS275S0000000_31, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.aw4;
        if (C1616006Uk.LIZ(R.id.aw4, viewGroup) != null) {
            i = R.id.aw5;
            LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.aw5, viewGroup);
            if (linearLayout != null) {
                i = R.id.aw6;
                if (C1616006Uk.LIZ(R.id.aw6, viewGroup) != null) {
                    i = R.id.aw7;
                    if (C1616006Uk.LIZ(R.id.aw7, viewGroup) != null) {
                        i = R.id.ayf;
                        if (C1616006Uk.LIZ(R.id.ayf, viewGroup) != null) {
                            i = R.id.bwb;
                            if (C1616006Uk.LIZ(R.id.bwb, viewGroup) != null) {
                                i = R.id.bwh;
                                ImageView imageView = (ImageView) C1616006Uk.LIZ(R.id.bwh, viewGroup);
                                if (imageView != null) {
                                    i = R.id.cap;
                                    ImageView imageView2 = (ImageView) C1616006Uk.LIZ(R.id.cap, viewGroup);
                                    if (imageView2 != null) {
                                        i = R.id.caq;
                                        ImageView imageView3 = (ImageView) C1616006Uk.LIZ(R.id.caq, viewGroup);
                                        if (imageView3 != null) {
                                            i = R.id.dra;
                                            if (C1616006Uk.LIZ(R.id.dra, viewGroup) != null) {
                                                i = R.id.ev4;
                                                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ev4, viewGroup);
                                                if (tuxTextView != null) {
                                                    i = R.id.ev5;
                                                    TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.ev5, viewGroup);
                                                    if (tuxTextView2 != null) {
                                                        i = R.id.eve;
                                                        if (C1616006Uk.LIZ(R.id.eve, viewGroup) != null) {
                                                            i = R.id.evf;
                                                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.evf, viewGroup);
                                                            if (tuxTextView3 != null) {
                                                                i = R.id.g3c;
                                                                LinearLayout linearLayout2 = (LinearLayout) C1616006Uk.LIZ(R.id.g3c, viewGroup);
                                                                if (linearLayout2 != null) {
                                                                    i = R.id.jet;
                                                                    if (C1616006Uk.LIZ(R.id.jet, viewGroup) != null) {
                                                                        i = R.id.jev;
                                                                        if (C1616006Uk.LIZ(R.id.jev, viewGroup) != null) {
                                                                            i = R.id.kbd;
                                                                            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) C1616006Uk.LIZ(R.id.kbd, viewGroup);
                                                                            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                                                                                i = R.id.m46;
                                                                                C1087110eOb c1087110eOb = (C1087110eOb) C1616006Uk.LIZ(R.id.m46, viewGroup);
                                                                                if (c1087110eOb != null) {
                                                                                    i = R.id.oh7;
                                                                                    if (C1616006Uk.LIZ(R.id.oh7, viewGroup) != null) {
                                                                                        i = R.id.qbl;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.qbl, viewGroup);
                                                                                        if (constraintLayout != null) {
                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewGroup;
                                                                                            i = R.id.uy8;
                                                                                            C197039127h c197039127h = (C197039127h) C1616006Uk.LIZ(R.id.uy8, viewGroup);
                                                                                            if (c197039127h != null) {
                                                                                                i = R.id.wrk;
                                                                                                if (C1616006Uk.LIZ(R.id.wrk, viewGroup) != null) {
                                                                                                    i = R.id.y92;
                                                                                                    ImageView imageView4 = (ImageView) C1616006Uk.LIZ(R.id.y92, viewGroup);
                                                                                                    if (imageView4 != null) {
                                                                                                        return new C166C(constraintLayout2, linearLayout, imageView, imageView2, imageView3, tuxTextView, tuxTextView2, tuxTextView3, linearLayout2, viewOnAttachStateChangeListenerC20631115oD, c1087110eOb, constraintLayout, constraintLayout2, c197039127h, imageView4);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static final Object invoke$2(AwS275S0000000_31 awS275S0000000_31, Object obj) {
        return C156U.LIZ((C156U) obj, true, null, true, R.raw.icon_music_note_s_alt_slash, null, false, false, false, 210);
    }

    public static final Object invoke$3(AwS275S0000000_31 awS275S0000000_31, Object obj) {
        return C156U.LIZ((C156U) obj, true, null, true, R.raw.icon_music_note_s_alt_slash, null, true, false, false, 210);
    }
}
