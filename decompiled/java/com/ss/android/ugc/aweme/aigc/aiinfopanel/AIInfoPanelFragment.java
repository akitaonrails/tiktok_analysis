package com.ss.android.ugc.aweme.aigc.aiinfopanel;

import X.C098200Yq;
import X.C0C64;
import X.C0SRP;
import X.C1390920mIc;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C444920HcY;
import X.C720800SPe;
import X.C720820SPg;
import X.C738670SyH;
import X.C738680SyI;
import X.C786410Ut5;
import X.DialogInterfaceOnDismissListenerC738780SyS;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.C2PAInfo;
import com.ss.android.ugc.aweme.feed.model.ModerationAigcInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class AIInfoPanelFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQlLix9KSHELIOSwlJyk8OCQiLCN9CQwFJyk8GCQiLCMVOiQrJCo9PA==";
    public LinearLayout LLIZ;
    public RelativeLayout LLIZLLLIL;
    public RelativeLayout LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxIconView LLJILLL;
    public C0SRP LLJJ = new C0SRP(2, 0, true, null, null, null, "");

    public final void SR(String str, String str2) {
        if (str.length() != 0 && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SpannableString spannableString = new SpannableString(strLIZIZ);
            int iLJJJ = a0.LJJJ(strLIZIZ, str2, 0, false, 6);
            int length = str2.length() + iLJJJ;
            if (iLJJJ < 0) {
                TuxTextView tuxTextView = this.LLJIJIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(spannableString);
                }
                TuxTextView tuxTextView2 = this.LLJIJIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            }
            C786410Ut5.p2(spannableString, new C738680SyI(this, 0), iLJJJ, length, 17);
            C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, length, 17);
            TuxTextView tuxTextView3 = this.LLJIJIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(spannableString);
            }
            TuxTextView tuxTextView4 = this.LLJIJIL;
            if (tuxTextView4 != null) {
                tuxTextView4.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
    }

    public final void UR(C19EG c19eg, C0SRP c0srp) {
        this.LLJJ = c0srp;
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        if (supportFragmentManager == null) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = this;
        tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC738780SyS(this, c0srp, 1);
        tuxSheet.show(supportFragmentManager, "AIInfoPanelFragment");
        Function0<Unit> function0 = c0srp.LJII;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        TuxIconView tuxIconView;
        TuxTextView tuxTextView4;
        String string;
        String string2;
        boolean z;
        int i;
        boolean z2;
        C2PAInfo c2PAInfo;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        String string19;
        String string20;
        String string21;
        String str;
        String string22;
        String string23;
        String string24;
        C720800SPe c720800SPe;
        String str2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Integer num2;
        Integer num3;
        String string25;
        String string26;
        String string27;
        String string28;
        TuxIconView tuxIconView2;
        super.onViewCreated(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view;
        this.LLIZ = linearLayout;
        if (linearLayout != null) {
            relativeLayout = (RelativeLayout) linearLayout.findViewById(R.id.rjh);
        } else {
            relativeLayout = null;
        }
        this.LLIZLLLIL = relativeLayout;
        LinearLayout linearLayout2 = this.LLIZ;
        if (linearLayout2 != null) {
            relativeLayout2 = (RelativeLayout) linearLayout2.findViewById(R.id.anx);
        } else {
            relativeLayout2 = null;
        }
        this.LLJ = relativeLayout2;
        RelativeLayout relativeLayout3 = this.LLIZLLLIL;
        if (relativeLayout3 != null) {
            tuxTextView = (TuxTextView) relativeLayout3.findViewById(R.id.tv_post_label_title);
        } else {
            tuxTextView = null;
        }
        this.LLJI = tuxTextView;
        RelativeLayout relativeLayout4 = this.LLIZLLLIL;
        if (relativeLayout4 != null) {
            tuxTextView2 = (TuxTextView) relativeLayout4.findViewById(R.id.tv_post_label_desc);
        } else {
            tuxTextView2 = null;
        }
        this.LLJIJIL = tuxTextView2;
        RelativeLayout relativeLayout5 = this.LLJ;
        if (relativeLayout5 != null) {
            tuxTextView3 = (TuxTextView) relativeLayout5.findViewById(R.id.z94);
        } else {
            tuxTextView3 = null;
        }
        this.LLJILJIL = tuxTextView3;
        RelativeLayout relativeLayout6 = this.LLJ;
        if (relativeLayout6 != null) {
            tuxIconView = (TuxIconView) relativeLayout6.findViewById(R.id.l87);
        } else {
            tuxIconView = null;
        }
        this.LLJILLL = tuxIconView;
        RelativeLayout relativeLayout7 = this.LLJ;
        if (relativeLayout7 != null) {
            tuxTextView4 = (TuxTextView) relativeLayout7.findViewById(R.id.z93);
        } else {
            tuxTextView4 = null;
        }
        this.LLJILJILJ = tuxTextView4;
        LinearLayout linearLayout3 = this.LLIZ;
        if (linearLayout3 != null && (tuxIconView2 = (TuxIconView) linearLayout3.findViewById(R.id.lc0)) != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS146S0100000_11(this, 47));
        }
        C0SRP c0srp = this.LLJJ;
        RelativeLayout relativeLayout8 = this.LLJ;
        if (relativeLayout8 != null) {
            C786410Ut5.LLIIL(relativeLayout8, 8);
        }
        TuxTextView tuxTextView5 = this.LLJI;
        String str8 = "";
        if (tuxTextView5 != null) {
            Context context = getContext();
            if (context == null || (string28 = context.getString(2131826253)) == null) {
                string28 = "";
            }
            tuxTextView5.setText(string28);
        }
        Context context2 = getContext();
        if (context2 == null || (string = context2.getString(2131826243)) == null) {
            string = "";
        }
        Context context3 = getContext();
        if (context3 == null || (string2 = context3.getString(2131826254)) == null) {
            string2 = "";
        }
        SR(string, string2);
        ModerationAigcInfo moderationAigcInfo = c0srp.LJFF;
        if (moderationAigcInfo != null && moderationAigcInfo.moderationUserLabelStatus == 100 && c0srp.LIZ == 0 && c0srp.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            RelativeLayout relativeLayout9 = this.LLJ;
            if (relativeLayout9 != null) {
                C786410Ut5.LLIIL(relativeLayout9, 8);
            }
            TuxTextView tuxTextView6 = this.LLJI;
            if (tuxTextView6 != null) {
                Context context4 = getContext();
                if (context4 == null || (string27 = context4.getString(2131826252)) == null) {
                    string27 = "";
                }
                tuxTextView6.setText(string27);
            }
            Context context5 = getContext();
            if (context5 == null || (string25 = context5.getString(2131826246)) == null) {
                string25 = "";
            }
            Context context6 = getContext();
            if (context6 != null && (string26 = context6.getString(2131826254)) != null) {
                str8 = string26;
            }
            SR(string25, str8);
        } else {
            int i2 = c0srp.LIZ;
            if (i2 == 1) {
                RelativeLayout relativeLayout10 = this.LLJ;
                if (relativeLayout10 != null) {
                    C786410Ut5.LLIIL(relativeLayout10, 8);
                }
                TuxTextView tuxTextView7 = this.LLJI;
                if (tuxTextView7 != null) {
                    Context context7 = getContext();
                    if (context7 == null || (string24 = context7.getString(2131826252)) == null) {
                        string24 = "";
                    }
                    tuxTextView7.setText(string24);
                }
                Context context8 = getContext();
                if (context8 == null || (string22 = context8.getString(2131826246)) == null) {
                    string22 = "";
                }
                Context context9 = getContext();
                if (context9 != null && (string23 = context9.getString(2131826254)) != null) {
                    str8 = string23;
                }
                SR(string22, str8);
            } else if (i2 == 2) {
                Context context10 = getContext();
                if (context10 != null) {
                    context10.getString(2131826243);
                }
                Context context11 = getContext();
                if (context11 != null) {
                    context11.getString(2131826254);
                }
                ModerationAigcInfo moderationAigcInfo2 = c0srp.LJFF;
                if (moderationAigcInfo2 != null) {
                    i = moderationAigcInfo2.moderationAigcLabelType;
                } else {
                    i = -1;
                }
                C2PAInfo c2PAInfo2 = c0srp.LIZLLL;
                if (c2PAInfo2 != null && (str = c2PAInfo2.aigcSrc) != null && a0.LJJIIZI(str, "meta_contain_c2pa", false)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (c0srp.LIZIZ == 2) {
                        RelativeLayout relativeLayout11 = this.LLJ;
                        if (relativeLayout11 != null) {
                            C786410Ut5.LLIIL(relativeLayout11, 0);
                        }
                        TuxIconView tuxIconView3 = this.LLJILLL;
                        if (tuxIconView3 != null) {
                            tuxIconView3.setIconRes(R.raw.icon_ai_video);
                        }
                        TuxTextView tuxTextView8 = this.LLJILJIL;
                        if (tuxTextView8 != null) {
                            Context context12 = getContext();
                            if (context12 == null || (string21 = context12.getString(2131826250)) == null) {
                                string21 = "";
                            }
                            tuxTextView8.setText(string21);
                        }
                        TuxTextView tuxTextView9 = this.LLJILJILJ;
                        if (tuxTextView9 != null) {
                            Context context13 = getContext();
                            if (context13 == null || (string20 = context13.getString(2131826244)) == null) {
                                string20 = "";
                            }
                            tuxTextView9.setText(string20);
                        }
                        Context context14 = getContext();
                        if (context14 == null || (string18 = context14.getString(2131826247)) == null) {
                            string18 = "";
                        }
                        Context context15 = getContext();
                        if (context15 != null && (string19 = context15.getString(2131826254)) != null) {
                            str8 = string19;
                        }
                        SR(string18, str8);
                    } else {
                        RelativeLayout relativeLayout12 = this.LLJ;
                        if (relativeLayout12 != null) {
                            C786410Ut5.LLIIL(relativeLayout12, 0);
                        }
                        TuxIconView tuxIconView4 = this.LLJILLL;
                        if (tuxIconView4 != null) {
                            tuxIconView4.setIconRes(R.raw.icon_split_half_star_fill);
                        }
                        TuxTextView tuxTextView10 = this.LLJILJIL;
                        if (tuxTextView10 != null) {
                            Context context16 = getContext();
                            if (context16 == null || (string17 = context16.getString(2131826251)) == null) {
                                string17 = "";
                            }
                            tuxTextView10.setText(string17);
                        }
                        TuxTextView tuxTextView11 = this.LLJILJILJ;
                        if (tuxTextView11 != null) {
                            Context context17 = getContext();
                            if (context17 == null || (string16 = context17.getString(2131826245)) == null) {
                                string16 = "";
                            }
                            tuxTextView11.setText(string16);
                        }
                        Context context18 = getContext();
                        if (context18 == null || (string14 = context18.getString(2131826247)) == null) {
                            string14 = "";
                        }
                        Context context19 = getContext();
                        if (context19 != null && (string15 = context19.getString(2131826254)) != null) {
                            str8 = string15;
                        }
                        SR(string14, str8);
                    }
                } else {
                    C2PAInfo c2PAInfo3 = c0srp.LIZLLL;
                    if ((c2PAInfo3 != null && c2PAInfo3.isCapcut()) || ((c2PAInfo = c0srp.LIZLLL) != null && c2PAInfo.isTiktok())) {
                        RelativeLayout relativeLayout13 = this.LLJ;
                        if (relativeLayout13 != null) {
                            C786410Ut5.LLIIL(relativeLayout13, 0);
                        }
                        TuxIconView tuxIconView5 = this.LLJILLL;
                        if (tuxIconView5 != null) {
                            tuxIconView5.setIconRes(R.raw.icon_split_half_star_fill);
                        }
                        TuxTextView tuxTextView12 = this.LLJILJIL;
                        if (tuxTextView12 != null) {
                            Context context20 = getContext();
                            if (context20 == null || (string13 = context20.getString(2131826251)) == null) {
                                string13 = "";
                            }
                            tuxTextView12.setText(string13);
                        }
                        TuxTextView tuxTextView13 = this.LLJILJILJ;
                        if (tuxTextView13 != null) {
                            Context context21 = getContext();
                            if (context21 == null || (string12 = context21.getString(2131826245)) == null) {
                                string12 = "";
                            }
                            tuxTextView13.setText(string12);
                        }
                        Context context22 = getContext();
                        if (context22 == null || (string10 = context22.getString(2131826243)) == null) {
                            string10 = "";
                        }
                        Context context23 = getContext();
                        if (context23 != null && (string11 = context23.getString(2131826254)) != null) {
                            str8 = string11;
                        }
                        SR(string10, str8);
                    } else if (i > 0) {
                        if (c0srp.LIZJ && C0C64.LJIILLIIL().LJIIIZ(31744, "aigc_label_h5_enable_appeal", true, false)) {
                            RelativeLayout relativeLayout14 = this.LLJ;
                            if (relativeLayout14 != null) {
                                C786410Ut5.LLIIL(relativeLayout14, 8);
                            }
                            TuxTextView tuxTextView14 = this.LLJI;
                            if (tuxTextView14 != null) {
                                Context context24 = getContext();
                                if (context24 == null || (string9 = context24.getString(2131826253)) == null) {
                                    string9 = "";
                                }
                                tuxTextView14.setText(string9);
                            }
                            Context context25 = getContext();
                            if (context25 == null || (string6 = context25.getString(2131826249)) == null) {
                                string6 = "";
                            }
                            Context context26 = getContext();
                            if (context26 == null || (string7 = context26.getString(2131826247)) == null) {
                                string7 = "";
                            }
                            Context context27 = getContext();
                            if (context27 != null && (string8 = context27.getString(2131826248, string6)) != null) {
                                str8 = string8;
                            }
                            String str9 = c0srp.LJI;
                            if (string7.length() != 0 && str8.length() != 0) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(string7);
                                sbLIZ.append(' ');
                                sbLIZ.append(str8);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                SpannableString spannableString = new SpannableString(strLIZIZ);
                                int iLJJJ = a0.LJJJ(strLIZIZ, string6, 0, false, 6);
                                int length = string6.length() + iLJJJ;
                                if (iLJJJ < 0) {
                                    TuxTextView tuxTextView15 = this.LLJIJIL;
                                    if (tuxTextView15 != null) {
                                        tuxTextView15.setText(spannableString);
                                    }
                                    TuxTextView tuxTextView16 = this.LLJIJIL;
                                    if (tuxTextView16 != null) {
                                        tuxTextView16.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                } else {
                                    C786410Ut5.p2(spannableString, new C738670SyH(this, str9, 1), iLJJJ, length, 17);
                                    C786410Ut5.p2(spannableString, new C444920HcY(42, false), iLJJJ, length, 17);
                                    TuxTextView tuxTextView17 = this.LLJIJIL;
                                    if (tuxTextView17 != null) {
                                        tuxTextView17.setText(spannableString);
                                    }
                                    TuxTextView tuxTextView18 = this.LLJIJIL;
                                    if (tuxTextView18 != null) {
                                        tuxTextView18.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                }
                            }
                        } else {
                            RelativeLayout relativeLayout15 = this.LLJ;
                            if (relativeLayout15 != null) {
                                C786410Ut5.LLIIL(relativeLayout15, 8);
                            }
                            TuxTextView tuxTextView19 = this.LLJI;
                            if (tuxTextView19 != null) {
                                Context context28 = getContext();
                                if (context28 == null || (string5 = context28.getString(2131826253)) == null) {
                                    string5 = "";
                                }
                                tuxTextView19.setText(string5);
                            }
                            Context context29 = getContext();
                            if (context29 == null || (string3 = context29.getString(2131826247)) == null) {
                                string3 = "";
                            }
                            Context context30 = getContext();
                            if (context30 != null && (string4 = context30.getString(2131826254)) != null) {
                                str8 = string4;
                            }
                            SR(string3, str8);
                        }
                    }
                }
            }
        }
        C720820SPg c720820SPg = C720820SPg.LIZ;
        C0SRP c0srp2 = this.LLJJ;
        if (c0srp2 != null) {
            c720800SPe = c0srp2.LJ;
        } else {
            c720800SPe = null;
        }
        c720820SPg.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c720800SPe != null) {
            str2 = c720800SPe.LIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (c720800SPe != null) {
            num = c720800SPe.LJ;
        } else {
            num = null;
        }
        c2344009Gk.LJ(num, "aigc_label_type");
        if (c720800SPe != null) {
            str3 = c720800SPe.LIZIZ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str3);
        if (c720800SPe != null) {
            str4 = c720800SPe.LIZJ;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("user_id", str4);
        if (c720800SPe != null) {
            str5 = c720800SPe.LIZLLL;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("country_code", str5);
        if (c720800SPe != null) {
            str6 = c720800SPe.LJFF;
        } else {
            str6 = null;
        }
        c2344009Gk.LJIIIIZZ("aigc_creation_source", str6);
        if (c720800SPe != null) {
            str7 = c720800SPe.LJI;
        } else {
            str7 = null;
        }
        c2344009Gk.LJIIIIZZ("aigc_creation_channel", str7);
        if (c720800SPe != null) {
            num2 = c720800SPe.LJIIIIZZ;
        } else {
            num2 = null;
        }
        c2344009Gk.LJ(num2, "fingerprint_id");
        if (c720800SPe != null) {
            num3 = c720800SPe.LJIIIZ;
        } else {
            num3 = null;
        }
        c2344009Gk.LJ(num3, "invisible_watermark");
        C20684815ws.LJIILLIIL("show_aigc_info_panel", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.s7, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
