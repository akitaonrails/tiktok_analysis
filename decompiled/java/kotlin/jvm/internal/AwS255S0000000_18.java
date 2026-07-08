package kotlin.jvm.internal;

import X.C09AY;
import X.C0I7D;
import X.C1173290gdb;
import X.C1193210h9j;
import X.C1193270h9p;
import X.C1193320h9u;
import X.C1193430hA5;
import X.C1193440hA6;
import X.C1193450hA7;
import X.C1193460hA8;
import X.C1193470hA9;
import X.C1195550hDV;
import X.C1195570hDX;
import X.C1616006Uk;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS255S0000000_18 extends C09AY implements Function1 {
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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0000000_18(int i) {
        super(1);
        this.$t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS255S0000000_18(Throwable th, int i) {
        super(1);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.psl;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.psl, viewGroup);
        if (tuxIconView != null) {
            i = R.id.psw;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.psw, viewGroup);
            if (tuxTextView != null) {
                i = R.id.psx;
                TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.psx, viewGroup);
                if (tuxIconView2 != null) {
                    i = R.id.pt1;
                    TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.pt1, viewGroup);
                    if (tuxTextView2 != null) {
                        i = R.id.pt2;
                        TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.pt2, viewGroup);
                        if (tuxTextView3 != null) {
                            i = R.id.pt3;
                            TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.pt3, viewGroup);
                            if (tuxTextView4 != null) {
                                i = R.id.pt4;
                                TuxTextView tuxTextView5 = (TuxTextView) C1616006Uk.LIZ(R.id.pt4, viewGroup);
                                if (tuxTextView5 != null) {
                                    return new C1193430hA5((ConstraintLayout) viewGroup, tuxIconView, tuxTextView, tuxIconView2, tuxTextView2, tuxTextView3, tuxTextView4, tuxTextView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        View view = (View) obj;
        int i = R.id.f18;
        C0I7D c0i7d = (C0I7D) C1616006Uk.LIZ(R.id.f18, view);
        if (c0i7d != null) {
            i = R.id.f1_;
            TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.f1_, view);
            if (tuxIconView != null) {
                i = R.id.f1b;
                TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.f1b, view);
                if (tuxIconView2 != null) {
                    i = R.id.ogx;
                    View viewLIZ = C1616006Uk.LIZ(R.id.ogx, view);
                    if (viewLIZ != null) {
                        i = R.id.qvk;
                        View viewLIZ2 = C1616006Uk.LIZ(R.id.qvk, view);
                        if (viewLIZ2 != null) {
                            return new C1195570hDX(view, viewLIZ, viewLIZ2, tuxIconView, tuxIconView2, c0i7d);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static final Object invoke$10(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        obj.getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        obj.getClass();
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.l39;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.l39, viewGroup);
        if (tuxTextView != null) {
            i = R.id.l4_;
            TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.l4_, viewGroup);
            if (tuxTextView2 != null) {
                return new C1193460hA8((LinearLayout) viewGroup, tuxTextView, tuxTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.l2a;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.l2a, viewGroup);
        if (tuxIconView != null) {
            i = R.id.l43;
            TuxIconView tuxIconView2 = (TuxIconView) C1616006Uk.LIZ(R.id.l43, viewGroup);
            if (tuxIconView2 != null) {
                i = R.id.l4_;
                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.l4_, viewGroup);
                if (tuxTextView != null) {
                    i = R.id.ptx;
                    TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.ptx, viewGroup);
                    if (tuxTextView2 != null) {
                        i = R.id.tks;
                        if (C1616006Uk.LIZ(R.id.tks, viewGroup) != null) {
                            i = R.id.tmi;
                            TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.tmi, viewGroup);
                            if (tuxTextView3 != null) {
                                return new C1193440hA6((FrameLayout) viewGroup, tuxIconView, tuxIconView2, tuxTextView, tuxTextView2, tuxTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.l2a;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.l2a, viewGroup);
        if (tuxIconView != null) {
            i = R.id.l4_;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.l4_, viewGroup);
            if (tuxTextView != null) {
                i = R.id.whc;
                LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.whc, viewGroup);
                if (linearLayout != null) {
                    return new C1193270h9p((ConstraintLayout) viewGroup, tuxIconView, tuxTextView, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.l1o;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.l1o, viewGroup);
        if (tuxTextView != null) {
            i = R.id.l1w;
            TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.l1w, viewGroup);
            if (tuxTextView2 != null) {
                return new C1173290gdb((ConstraintLayout) viewGroup, tuxTextView, tuxTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.fwm;
        LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.fwm, viewGroup);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) viewGroup;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.title, viewGroup);
            if (tuxTextView != null) {
                return new C1193320h9u(linearLayout2, linearLayout, tuxTextView);
            }
            i = R.id.title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.l39;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.l39, viewGroup);
        if (tuxTextView != null) {
            i = R.id.l4_;
            TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.l4_, viewGroup);
            if (tuxTextView2 != null) {
                return new C1193470hA9((FrameLayout) viewGroup, tuxTextView, tuxTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
        int i = R.id.fbd;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.fbd, viewGroup);
        if (tuxTextView != null) {
            i = R.id.fwp;
            if (C1616006Uk.LIZ(R.id.fwp, viewGroup) != null) {
                i = R.id.fwq;
                LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.fwq, viewGroup);
                if (linearLayout != null) {
                    i = R.id.fwr;
                    TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.fwr, viewGroup);
                    if (tuxTextView2 != null) {
                        i = R.id.fwy;
                        TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.fwy, viewGroup);
                        if (tuxTextView3 != null) {
                            i = R.id.fyx;
                            View viewLIZ = C1616006Uk.LIZ(R.id.fyx, viewGroup);
                            if (viewLIZ != null) {
                                i = R.id.hfe;
                                TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.hfe, viewGroup);
                                if (tuxTextView4 != null) {
                                    i = R.id.jew;
                                    if (C1616006Uk.LIZ(R.id.jew, viewGroup) != null) {
                                        i = R.id.jez;
                                        View viewLIZ2 = C1616006Uk.LIZ(R.id.jez, viewGroup);
                                        if (viewLIZ2 != null) {
                                            i = R.id.jf0;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C1616006Uk.LIZ(R.id.jf0, viewGroup);
                                            if (constraintLayout2 != null) {
                                                i = R.id.jff;
                                                TuxTextView tuxTextView5 = (TuxTextView) C1616006Uk.LIZ(R.id.jff, viewGroup);
                                                if (tuxTextView5 != null) {
                                                    i = R.id.ptf;
                                                    TuxTextView tuxTextView6 = (TuxTextView) C1616006Uk.LIZ(R.id.ptf, viewGroup);
                                                    if (tuxTextView6 != null) {
                                                        i = R.id.rt2;
                                                        if (C1616006Uk.LIZ(R.id.rt2, viewGroup) != null) {
                                                            i = R.id.skw;
                                                            TuxTextView tuxTextView7 = (TuxTextView) C1616006Uk.LIZ(R.id.skw, viewGroup);
                                                            if (tuxTextView7 != null) {
                                                                i = R.id.skx;
                                                                if (C1616006Uk.LIZ(R.id.skx, viewGroup) != null) {
                                                                    i = R.id.sl0;
                                                                    if (C1616006Uk.LIZ(R.id.sl0, viewGroup) != null) {
                                                                        i = R.id.vge;
                                                                        TuxTextView tuxTextView8 = (TuxTextView) C1616006Uk.LIZ(R.id.vge, viewGroup);
                                                                        if (tuxTextView8 != null) {
                                                                            i = R.id.vgf;
                                                                            C1195550hDV c1195550hDV = (C1195550hDV) C1616006Uk.LIZ(R.id.vgf, viewGroup);
                                                                            if (c1195550hDV != null) {
                                                                                i = R.id.vgl;
                                                                                SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.vgl, viewGroup);
                                                                                if (smartImageView != null) {
                                                                                    i = R.id.vi1;
                                                                                    TuxTextView tuxTextView9 = (TuxTextView) C1616006Uk.LIZ(R.id.vi1, viewGroup);
                                                                                    if (tuxTextView9 != null) {
                                                                                        i = R.id.vi4;
                                                                                        TuxTextView tuxTextView10 = (TuxTextView) C1616006Uk.LIZ(R.id.vi4, viewGroup);
                                                                                        if (tuxTextView10 != null) {
                                                                                            return new C1193210h9j(constraintLayout, tuxTextView, linearLayout, tuxTextView2, tuxTextView3, viewLIZ, tuxTextView4, viewLIZ2, constraintLayout2, tuxTextView5, tuxTextView6, tuxTextView7, tuxTextView8, c1195550hDV, smartImageView, tuxTextView9, tuxTextView10);
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

    public static /* bridge */ /* synthetic */ Object invoke$9(AwS255S0000000_18 awS255S0000000_18, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.l2a;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.l2a, viewGroup);
        if (tuxIconView != null) {
            i = R.id.l39;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.l39, viewGroup);
            if (tuxTextView != null) {
                i = R.id.l4_;
                TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.l4_, viewGroup);
                if (tuxTextView2 != null) {
                    return new C1193450hA7((FrameLayout) viewGroup, tuxIconView, tuxTextView, tuxTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }
}
