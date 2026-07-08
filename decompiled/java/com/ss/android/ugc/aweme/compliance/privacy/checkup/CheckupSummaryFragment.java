package com.ss.android.ugc.aweme.compliance.privacy.checkup;

import X.C01GW;
import X.C103K;
import X.C105F;
import X.C1264560j0o;
import X.C1843500y4a;
import X.C191821102p;
import X.C191880104w;
import X.C191985108x;
import X.C191994109g;
import X.C19203010Aq;
import X.C1954807lC;
import X.C197039127h;
import X.C20588115hH;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2344009Gk;
import X.C306560Bzy;
import X.C444910HcX;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC19202910Ap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.CheckupRelationViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class CheckupSummaryFragment extends CheckupBasePageFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODHELIOSclPy4wMWsvISowIzA8Zww7LSYnPD8APSghKD0qDjctLiI2JjE=";
    public View LLILZIL;
    public TuxTextView LLILZLL;
    public View LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public View LLJILJIL;
    public TuxTextView LLJILJILJ;
    public View LLJILLL;
    public TuxTextView LLJJ;
    public View LLJJI;
    public TuxTextView LLJJIII;
    public View LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 164));

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final int MR() {
        return R.layout.bdl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void PR() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJ(C2097608Jq.LJIIIIZZ(new Pair("following", bS().LL.getValue()), new Pair("follower", bS().LLILLJJLI.getValue()), new Pair("friends", bS().LLILLL.getValue())), "total_social_info");
        C191994109g.LIZ.getClass();
        c2344009Gk.LJ(C191994109g.LIZIZ(), "privacy_status_info");
        C20684815ws.LJIILLIIL("privacy_checkup_summary_page_show", c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final String RR() {
        return C1264560j0o.LIZ("summary");
    }

    public final CheckupRelationViewModel bS() {
        return (CheckupRelationViewModel) this.LLJJIJIL.getValue();
    }

    public static PrivacyUserSettingsV2 cS() {
        C191821102p.LIZIZ().getClass();
        return C191880104w.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final void OR(EnumC19202910Ap enumC19202910Ap) {
        String str;
        int i = C19203010Aq.LIZ[enumC19202910Ap.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str = "tap_x_exit";
                } else {
                    throw new C1954807lC();
                }
            } else {
                str = "";
            }
        } else {
            str = "tap_next";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
        c2344009Gk.LJ(C2097608Jq.LJIIIIZZ(new Pair("following", bS().LL.getValue()), new Pair("follower", bS().LLILLJJLI.getValue()), new Pair("friends", bS().LLILLL.getValue())), "total_social_info");
        C191994109g.LIZ.getClass();
        c2344009Gk.LJ(C191994109g.LIZIZ(), "privacy_status_info");
        c2344009Gk.LJIIIIZZ("action", str);
        C20684815ws.LJIILLIIL("privacy_checkup_summary_page_click", c2344009Gk.LIZ);
    }

    public final CharSequence aS(int i, int i2) {
        C444910HcX c444910HcX = new C444910HcX(getString(i2));
        c444910HcX.LIZ(52);
        return C20588115hH.LIZJ(requireContext(), i, c444910HcX);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLIZ;
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        boolean zLIZ2;
        CharSequence charSequenceAS;
        boolean zLIZ3;
        boolean zLIZ4;
        int i4;
        CharSequence charSequenceAS2;
        long jIntValue;
        long jIntValue2;
        super.onViewCreated(view, bundle);
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h != null) {
            c197039127h.setText(getString(2131845090));
        }
        TextView textView = (TextView) view.findViewById(R.id.f0h);
        long jIntValue3 = 0;
        if (textView != null) {
            Integer value = bS().LL.getValue();
            if (value != null) {
                jIntValue2 = value.intValue();
            } else {
                jIntValue2 = 0;
            }
            textView.setText(C1843500y4a.LIZIZ(jIntValue2));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.f0g);
        if (textView2 != null) {
            Integer value2 = bS().LLILLJJLI.getValue();
            if (value2 != null) {
                jIntValue = value2.intValue();
            } else {
                jIntValue = 0;
            }
            textView2.setText(C1843500y4a.LIZIZ(jIntValue));
        }
        TextView textView3 = (TextView) view.findViewById(R.id.f0i);
        if (textView3 != null) {
            Integer value3 = bS().LLILLL.getValue();
            if (value3 != null) {
                jIntValue3 = value3.intValue();
            }
            textView3.setText(C1843500y4a.LIZIZ(jIntValue3));
        }
        this.LLILZIL = view.findViewById(R.id.visibility_container);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.rux);
        int i5 = 2131829277;
        int i6 = 2131829278;
        if (!C306560Bzy.LIZ()) {
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            PrivacyUserSettingsV2 privacyUserSettingsV2CS = cS();
            if (privacyUserSettingsV2CS != null) {
                zLIZ3 = C103K.LIZ(privacyUserSettingsV2CS);
            } else {
                zLIZ3 = false;
            }
            TuxTextView tuxTextView = this.LLILZLL;
            if (tuxTextView != null) {
                if (zLIZ3) {
                    charSequenceAS2 = aS(2131845094, R.string.rcz);
                } else {
                    charSequenceAS2 = aS(2131845093, R.string.rme);
                }
                tuxTextView.setText(charSequenceAS2);
            }
            this.LLIZ = view.findViewById(R.id.ew6);
            this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.ew8);
            C191821102p.LIZIZ().getClass();
            if (C191985108x.LIZLLL(C191880104w.LJIIJJI(0, "content_reuse_permission")).LIZIZ) {
                View view3 = this.LLIZ;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(0, view3);
                }
                PrivacyUserSettingsV2 privacyUserSettingsV2CS2 = cS();
                int iLIZ = C105F.LIZ(privacyUserSettingsV2CS2, "content_reuse_permission", 1);
                if (privacyUserSettingsV2CS2 != null) {
                    zLIZ4 = C103K.LIZ(privacyUserSettingsV2CS2);
                } else {
                    zLIZ4 = false;
                }
                if (iLIZ != 4) {
                    if (iLIZ != 5) {
                        if (zLIZ4) {
                            i4 = 2131829277;
                        } else {
                            i4 = 2131829276;
                        }
                    } else {
                        i4 = 2131829280;
                    }
                } else {
                    i4 = 2131829278;
                }
                TuxTextView tuxTextView2 = this.LLIZLLLIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setText(aS(2131845095, i4));
                }
            } else {
                View view4 = this.LLIZ;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
            }
        } else {
            View view5 = this.LLILZIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
        }
        this.LLJ = view.findViewById(R.id.ruy);
        this.LLJI = (TuxTextView) view.findViewById(R.id.ruz);
        if (C306560Bzy.LIZ()) {
            View view6 = this.LLJ;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(0, view6);
            }
            PrivacyUserSettingsV2 privacyUserSettingsV2CS3 = cS();
            if (privacyUserSettingsV2CS3 != null) {
                zLIZ2 = C103K.LIZ(privacyUserSettingsV2CS3);
            } else {
                zLIZ2 = false;
            }
            TuxTextView tuxTextView3 = this.LLJI;
            if (tuxTextView3 != null) {
                if (zLIZ2) {
                    charSequenceAS = aS(2131845094, R.string.rcz);
                } else {
                    charSequenceAS = aS(2131845093, R.string.rme);
                }
                tuxTextView3.setText(charSequenceAS);
            }
        } else {
            View view7 = this.LLJ;
            if (view7 != null) {
                C786410Ut5.LJLLLLLL(8, view7);
            }
        }
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.eea);
        PrivacyUserSettingsV2 privacyUserSettingsV2CS4 = cS();
        int iLIZ2 = C105F.LIZ(privacyUserSettingsV2CS4, "comment", 0);
        if (privacyUserSettingsV2CS4 != null) {
            zLIZ = C103K.LIZ(privacyUserSettingsV2CS4);
        } else {
            zLIZ = false;
        }
        if (iLIZ2 != 1) {
            if (iLIZ2 != 3) {
                if (!zLIZ) {
                    i5 = 2131829276;
                }
            } else {
                i5 = 2131829279;
            }
        } else {
            i5 = 2131829278;
        }
        TuxTextView tuxTextView4 = this.LLJIJIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(aS(2131845097, i5));
        }
        this.LLJILJIL = view.findViewById(R.id.fuk);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.ful);
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "chatsets");
        if (privacySettingsRestrictionItemLJIIJJI != null && privacySettingsRestrictionItemLJIIJJI.showType == 2) {
            View view8 = this.LLJILJIL;
            if (view8 != null) {
                C786410Ut5.LJLLLLLL(8, view8);
            }
        } else {
            View view9 = this.LLJILJIL;
            if (view9 != null) {
                C786410Ut5.LJLLLLLL(0, view9);
            }
            int iLIZ3 = C105F.LIZ(cS(), "direct_message", 1);
            if (iLIZ3 != 2) {
                if (iLIZ3 != 3) {
                    if (iLIZ3 != 4) {
                        i6 = 2131831593;
                    } else {
                        i6 = 2131831596;
                    }
                } else {
                    i6 = 2131831594;
                }
            }
            TuxTextView tuxTextView5 = this.LLJILJILJ;
            if (tuxTextView5 != null) {
                tuxTextView5.setText(aS(2131845098, i6));
            }
        }
        this.LLJILLL = view.findViewById(R.id.g1_);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.g1a);
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI2 = C191880104w.LJIIJJI(0, "dm_setting_friends");
        if (privacySettingsRestrictionItemLJIIJJI2 != null && privacySettingsRestrictionItemLJIIJJI2.showType == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            View view10 = this.LLJILLL;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(0, view10);
            }
            TuxTextView tuxTextView6 = this.LLJJ;
            if (tuxTextView6 != null) {
                if (C105F.LIZ(cS(), "dm_setting_friends", 1) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    i3 = 2131845073;
                } else {
                    i3 = 2131845074;
                }
                C444910HcX c444910HcX = new C444910HcX(getString(i3));
                c444910HcX.LIZ(52);
                tuxTextView6.setText(C20588115hH.LIZJ(requireContext(), 2131845100, c444910HcX));
            }
        } else {
            View view11 = this.LLJILLL;
            if (view11 != null) {
                C786410Ut5.LJLLLLLL(8, view11);
            }
        }
        this.LLJJI = view.findViewById(R.id.g1i);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.g1j);
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI3 = C191880104w.LJIIJJI(0, "dm_setting_potential_connection");
        if (privacySettingsRestrictionItemLJIIJJI3 != null && privacySettingsRestrictionItemLJIIJJI3.showType == 2) {
            View view12 = this.LLJJI;
            if (view12 != null) {
                C786410Ut5.LJLLLLLL(8, view12);
            }
        } else {
            View view13 = this.LLJJI;
            if (view13 != null) {
                C786410Ut5.LJLLLLLL(0, view13);
            }
            TuxTextView tuxTextView7 = this.LLJJIII;
            if (tuxTextView7 != null) {
                int iLIZ4 = C105F.LIZ(cS(), "dm_setting_potential_connection", 2);
                if (iLIZ4 != 1 && iLIZ4 != 2) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    i = 2131845077;
                } else {
                    i = 2131845078;
                }
                C444910HcX c444910HcX2 = new C444910HcX(getString(i));
                c444910HcX2.LIZ(52);
                tuxTextView7.setText(C20588115hH.LIZJ(requireContext(), 2131845102, c444910HcX2));
            }
        }
        this.LLJJIJI = view.findViewById(R.id.g1f);
        this.LLJJIJIIJIL = (TuxTextView) view.findViewById(R.id.g1g);
        C191821102p.LIZIZ().getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI4 = C191880104w.LJIIJJI(0, "dm_setting_others");
        if (privacySettingsRestrictionItemLJIIJJI4 != null && privacySettingsRestrictionItemLJIIJJI4.showType == 2) {
            View view14 = this.LLJJIJI;
            if (view14 != null) {
                C786410Ut5.LJLLLLLL(8, view14);
                return;
            }
            return;
        }
        View view15 = this.LLJJIJI;
        if (view15 != null) {
            C786410Ut5.LJLLLLLL(0, view15);
        }
        TuxTextView tuxTextView8 = this.LLJJIJIIJIL;
        if (tuxTextView8 == null) {
            return;
        }
        int iLIZ5 = C105F.LIZ(cS(), "dm_setting_others", 2);
        if (iLIZ5 != 1 && iLIZ5 != 2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            i2 = 2131845075;
        } else {
            i2 = 2131845076;
        }
        C444910HcX c444910HcX3 = new C444910HcX(getString(i2));
        c444910HcX3.LIZ(52);
        tuxTextView8.setText(C20588115hH.LIZJ(requireContext(), 2131845101, c444910HcX3));
    }
}
