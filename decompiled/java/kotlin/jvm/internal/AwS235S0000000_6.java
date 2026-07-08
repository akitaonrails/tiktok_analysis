package kotlin.jvm.internal;

import X.C09AY;
import X.C0H7D;
import X.C0H7N;
import X.C1193420hA4;
import X.C1616006Uk;
import X.C425370Gm7;
import X.C427760Gpy;
import X.C435020H4a;
import X.C436060H8a;
import X.C436070H8b;
import X.C436090H8d;
import X.InterfaceC340040DUs;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS235S0000000_6 extends C09AY implements Function1 {
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
    public AwS235S0000000_6(int i) {
        super(1);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS235S0000000_6 awS235S0000000_6, Object obj) {
        View viewRequireView = ((Fragment) obj).requireView();
        int i = R.id.avk;
        View viewLIZ = C1616006Uk.LIZ(R.id.avk, viewRequireView);
        if (viewLIZ != null) {
            C0H7N.LIZ(viewLIZ);
            i = R.id.avu;
            if (C1616006Uk.LIZ(R.id.avu, viewRequireView) != null) {
                i = R.id.ds6;
                View viewLIZ2 = C1616006Uk.LIZ(R.id.ds6, viewRequireView);
                if (viewLIZ2 != null) {
                    C436060H8a.LIZ(viewLIZ2);
                    i = R.id.tb0;
                    View viewLIZ3 = C1616006Uk.LIZ(R.id.tb0, viewRequireView);
                    if (viewLIZ3 != null) {
                        C436090H8d.LIZ(viewLIZ3);
                        i = R.id.w2_;
                        View viewLIZ4 = C1616006Uk.LIZ(R.id.w2_, viewRequireView);
                        if (viewLIZ4 != null) {
                            C436070H8b.LIZ(viewLIZ4);
                            i = R.id.ywm;
                            View viewLIZ5 = C1616006Uk.LIZ(R.id.ywm, viewRequireView);
                            if (viewLIZ5 != null) {
                                C0H7D.LIZ(viewLIZ5);
                                final ConstraintLayout constraintLayout = (ConstraintLayout) viewRequireView;
                                return new InterfaceC340040DUs(constraintLayout) { // from class: X.0H8c
                                    public final ConstraintLayout LL;

                                    @Override // X.InterfaceC340040DUs
                                    public final /* bridge */ /* synthetic */ View getRoot() {
                                        return this.LL;
                                    }

                                    {
                                        this.LL = constraintLayout;
                                    }
                                };
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewRequireView.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS235S0000000_6 awS235S0000000_6, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) C1616006Uk.LIZ(R.id.r1m, viewGroup);
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            return new C435020H4a((ConstraintLayout) viewGroup, viewOnAttachStateChangeListenerC20604515jv);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(R.id.r1m)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS235S0000000_6 awS235S0000000_6, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.b__;
        C427760Gpy c427760Gpy = (C427760Gpy) C1616006Uk.LIZ(R.id.b__, viewGroup);
        if (c427760Gpy != null) {
            i = R.id.b_d;
            SmartImageView smartImageView = (SmartImageView) C1616006Uk.LIZ(R.id.b_d, viewGroup);
            if (smartImageView != null) {
                i = R.id.b_f;
                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.b_f, viewGroup);
                if (tuxTextView != null) {
                    return new C425370Gm7((LinearLayout) viewGroup, c427760Gpy, smartImageView, tuxTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS235S0000000_6 awS235S0000000_6, Object obj) {
        ViewGroup viewGroup = (ViewGroup) obj;
        int i = R.id.xf6;
        TuxIconView tuxIconView = (TuxIconView) C1616006Uk.LIZ(R.id.xf6, viewGroup);
        if (tuxIconView != null) {
            i = R.id.xf7;
            TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.xf7, viewGroup);
            if (tuxTextView != null) {
                i = R.id.xf8;
                TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.xf8, viewGroup);
                if (tuxTextView2 != null) {
                    i = R.id.xf9;
                    LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.xf9, viewGroup);
                    if (linearLayout != null) {
                        i = R.id.xf_;
                        TuxTextView tuxTextView3 = (TuxTextView) C1616006Uk.LIZ(R.id.xf_, viewGroup);
                        if (tuxTextView3 != null) {
                            i = R.id.xfa;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C1616006Uk.LIZ(R.id.xfa, viewGroup);
                            if (constraintLayout != null) {
                                i = R.id.xfb;
                                TuxTextView tuxTextView4 = (TuxTextView) C1616006Uk.LIZ(R.id.xfb, viewGroup);
                                if (tuxTextView4 != null) {
                                    i = R.id.xfc;
                                    TuxTextView tuxTextView5 = (TuxTextView) C1616006Uk.LIZ(R.id.xfc, viewGroup);
                                    if (tuxTextView5 != null) {
                                        return new C1193420hA4((LinearLayout) viewGroup, tuxIconView, tuxTextView, tuxTextView2, linearLayout, tuxTextView3, constraintLayout, tuxTextView4, tuxTextView5);
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
}
