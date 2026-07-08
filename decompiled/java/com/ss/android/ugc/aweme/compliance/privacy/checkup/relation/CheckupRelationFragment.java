package com.ss.android.ugc.aweme.compliance.privacy.checkup.relation;

import X.C01GW;
import X.C0IOK;
import X.C1076010e6h;
import X.C1250250idj;
import X.C1264560j0o;
import X.C1308910kAL;
import X.C1590400rUM;
import X.C16G0;
import X.C16GX;
import X.C1843500y4a;
import X.C191994109g;
import X.C19Y2;
import X.C19Y3;
import X.C19Y5;
import X.C20684815ws;
import X.C2097608Jq;
import X.C21594419fC;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C418440Gaw;
import X.C428150Gqb;
import X.C452501pT;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC428940Grs;
import X.InterfaceC1245470iW1;
import X.InterfaceC1264580j0q;
import X.InterfaceC469360Ias;
import Y.AObserverS213S0100000_9;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS119S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.follower.CheckupRelationFollowerListFragment;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.following.CheckupRelationFollowingListFragment;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.friends.CheckupRelationFriendsListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CheckupRelationFragment extends CheckupBasePageFragment implements InterfaceC469360Ias {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wHELIOSMWsvISowIzA8Zz02JCQ4ICA9ZgYkLCw4PTUeLCMyPCwjJwkhKSIhLCEn";
    public C16G0 LLILZIL;
    public C16GX LLILZLL;
    public C21594419fC LLIZ;
    public C19Y3 LLIZLLLIL;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 860));
    public final List<Fragment> LLJI = new ArrayList();
    public final List<String> LLJIJIL = new ArrayList();
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 858));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 859));

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final int MR() {
        return R.layout.bdj;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR() {
        /*
            r10 = this;
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r1 = r10.getEnterFrom()
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r1)
            X.19fC r0 = r10.LLIZ
            if (r0 == 0) goto Lb5
            int r0 = r0.getCurrentItem()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L1a:
            java.lang.String r7 = "followers"
            r4 = 2
            java.lang.String r9 = "following"
            java.lang.String r3 = "friends"
            r6 = 1
            if (r1 == 0) goto Lb1
            int r0 = r1.intValue()
            if (r0 != 0) goto La0
            r1 = r3
        L2b:
            java.lang.String r0 = "page_type"
            r2.LJIIIIZZ(r0, r1)
            r0 = 3
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.CheckupRelationViewModel r0 = r10.aS()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LL
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8 = 0
            if (r0 == 0) goto L9e
            int r0 = r0.intValue()
        L46:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r9, r1)
            r5[r8] = r0
            com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.CheckupRelationViewModel r0 = r10.aS()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LLILLJJLI
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L9c
            int r0 = r0.intValue()
        L63:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r1)
            r5[r6] = r0
            com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.CheckupRelationViewModel r0 = r10.aS()
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L80
            int r8 = r0.intValue()
        L80:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r1)
            r5[r4] = r0
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r5)
            java.lang.String r0 = "total_social_info"
            r2.LJ(r1, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "privacy_checkup_connections_page_show"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L9c:
            r0 = 0
            goto L63
        L9e:
            r0 = 0
            goto L46
        La0:
            int r0 = r1.intValue()
            if (r0 != r6) goto La8
            r1 = r9
            goto L2b
        La8:
            int r0 = r1.intValue()
            if (r0 != r4) goto Lb1
            r1 = r7
            goto L2b
        Lb1:
            java.lang.String r1 = ""
            goto L2b
        Lb5:
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.CheckupRelationFragment.PR():void");
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final String RR() {
        return C1264560j0o.LIZ("connections_review");
    }

    public final CheckupRelationViewModel aS() {
        return (CheckupRelationViewModel) this.LLJ.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C21594419fC c21594419fC = this.LLIZ;
        if (c21594419fC != null) {
            c21594419fC.removeOnPageChangeListener(this);
        }
        aS().LLILZ.removeObservers(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C16G0 c16g0 = this.LLILZIL;
        if (c16g0 != null) {
            HandlerHook.viewPost(c16g0, new ARunnableS119S0100000_19(this, 34));
        }
        C21594419fC c21594419fC = this.LLIZ;
        if (c21594419fC != null) {
            c21594419fC.addOnPageChangeListener(this);
        }
        aS().LLILZ.observe(this, new AObserverS223S0100000_19(this, 13));
        C21594419fC c21594419fC2 = this.LLIZ;
        bS(c21594419fC2 != null ? c21594419fC2.getCurrentItem() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OR(X.EnumC19202910Ap r11) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.CheckupRelationFragment.OR(X.10Ap):void");
    }

    public final void bS(int i) {
        TextView textView;
        int i2;
        C19Y5 c19y5LJIIIZ;
        Integer num = (Integer) this.LLJILJIL.getValue();
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.LLJILJILJ.getValue();
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                int size = ((ArrayList) this.LLJIJIL).size();
                for (int i3 = 0; i3 < size; i3++) {
                    C19Y3 c19y3 = this.LLIZLLLIL;
                    View view = null;
                    if (c19y3 != null && (c19y5LJIIIZ = c19y3.LJIIIZ(i3)) != null) {
                        view = c19y5LJIIIZ.LJFF;
                    }
                    if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
                        if (i3 == i) {
                            i2 = iIntValue2;
                        } else {
                            i2 = iIntValue;
                        }
                        textView.setTextColor(i2);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() == null) {
            setArguments(new Bundle());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        String str;
        int iIntValue;
        int iIntValue2;
        InterfaceC1264580j0q interfaceC1264580j0q;
        InterfaceC1264580j0q interfaceC1264580j0q2;
        if (i >= 0 && i < ((ArrayList) this.LLJI).size()) {
            Fragment fragment = (Fragment) ListProtector.get(this.LLJI, i);
            String pageName = null;
            if (fragment.getActivity() != null && (fragment instanceof InterfaceC1264580j0q) && (interfaceC1264580j0q2 = (InterfaceC1264580j0q) fragment) != null) {
                interfaceC1264580j0q2.sn();
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", getEnterFrom());
            Object obj = ListProtector.get(this.LLJI, i);
            if ((obj instanceof InterfaceC1264580j0q) && (interfaceC1264580j0q = (InterfaceC1264580j0q) obj) != null) {
                pageName = interfaceC1264580j0q.getPageName();
            }
            c2344009Gk.LJIIIIZZ("page_name", pageName);
            C20684815ws.LJIILLIIL("change_relation_tab_privacy_checkup", c2344009Gk.LIZ);
            C191994109g c191994109g = C191994109g.LIZ;
            String enterFrom = getEnterFrom();
            if (i == 0) {
                str = "friends";
            } else if (i == 1) {
                str = "following";
            } else if (i == 2) {
                str = "followers";
            } else {
                str = "";
            }
            Pair[] pairArr = new Pair[3];
            Integer value = aS().LL.getValue();
            int iIntValue3 = 0;
            if (value != null) {
                iIntValue = value.intValue();
            } else {
                iIntValue = 0;
            }
            pairArr[0] = new Pair("following", Integer.valueOf(iIntValue));
            Integer value2 = aS().LLILLJJLI.getValue();
            if (value2 != null) {
                iIntValue2 = value2.intValue();
            } else {
                iIntValue2 = 0;
            }
            pairArr[1] = new Pair("followers", Integer.valueOf(iIntValue2));
            Integer value3 = aS().LLILLL.getValue();
            if (value3 != null) {
                iIntValue3 = value3.intValue();
            }
            pairArr[2] = new Pair("friends", Integer.valueOf(iIntValue3));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            c191994109g.getClass();
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", enterFrom);
            c2344009Gk2.LJIIIIZZ("action", "change_page");
            c2344009Gk2.LJIIIIZZ("page_type", str);
            c2344009Gk2.LJ(mapLJIIIIZZ, "total_social_info");
            C20684815ws.LJIILLIIL("privacy_checkup_connections_page_click", c2344009Gk2.LIZ);
            bS(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long jIntValue;
        long jIntValue2;
        C19Y2 c19y2;
        C19Y5 c19y5LJIIIZ;
        Integer numLIZJ;
        Integer numLIZJ2;
        super.onViewCreated(view, bundle);
        this.LLILZIL = (C16G0) view.findViewById(R.id.eqx);
        this.LLILZLL = (C16GX) view.findViewById(R.id.b6_);
        this.LLIZLLLIL = (C19Y3) view.findViewById(R.id.wya);
        this.LLIZ = (C21594419fC) view.findViewById(R.id.viewpager);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getString(2131845063);
            tuxNavBar.LJIJJ(c1250250idj);
        }
        VR(0.0f);
        C19Y3 c19y3 = this.LLIZLLLIL;
        if (c19y3 != null) {
            c19y3.setCustomTabViewResId(R.layout.bdf);
            c19y3.setupWithViewPager(this.LLIZ);
            c19y3.setAutoFillWhenScrollable(true);
            c19y3.LJIILLIIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            Context context = c19y3.getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, context)) != null) {
                int iIntValue = numLIZJ.intValue();
                Context context2 = c19y3.getContext();
                if (context2 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context2)) != null) {
                    c19y3.LJIIZILJ(iIntValue, numLIZJ2.intValue());
                }
            }
            c19y3.setOnTabClickListener(new InterfaceC1245470iW1() { // from class: X.0j0p
                @Override // X.InterfaceC1245470iW1
                public final void LIZ(C19Y5 c19y5) {
                    if (c19y5 != null) {
                        c19y5.LIZ = "from_click";
                    }
                    c19y5.LIZ();
                }
            });
        }
        C19Y3 c19y32 = this.LLIZLLLIL;
        if (c19y32 != null) {
            int tabCount = c19y32.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                C19Y3 c19y33 = this.LLIZLLLIL;
                if (c19y33 != null && (c19y5LJIIIZ = c19y33.LJIIIZ(i)) != null) {
                    c19y2 = c19y5LJIIIZ.LJIIIIZZ;
                } else {
                    c19y2 = null;
                }
                C428150Gqb.LIZ(c19y2, EnumC428940Grs.ALPHA, 0.0f);
            }
        }
        ((ArrayList) this.LLJI).clear();
        ((ArrayList) this.LLJIJIL).clear();
        Fragment fragmentLJJJJZI = getChildFragmentManager().LJJJJZI(C1590400rUM.LJJIZ(R.id.viewpager, ((ArrayList) this.LLJI).size()));
        if (fragmentLJJJJZI == null) {
            fragmentLJJJJZI = new CheckupRelationFriendsListFragment();
        }
        fragmentLJJJJZI.setArguments(getArguments());
        ((ArrayList) this.LLJI).add(fragmentLJJJJZI);
        List<String> list = this.LLJIJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C844470XAv.LIZ.getClass();
        sbLIZ.append(C844470XAv.LIZ().getString(2131834932));
        sbLIZ.append(' ');
        Integer value = aS().LLILLL.getValue();
        long jIntValue3 = 0;
        if (value != null) {
            jIntValue = value.intValue();
        } else {
            jIntValue = 0;
        }
        sbLIZ.append(C1843500y4a.LIZIZ(jIntValue));
        ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ));
        Fragment fragmentLJJJJZI2 = getChildFragmentManager().LJJJJZI(C1590400rUM.LJJIZ(R.id.viewpager, ((ArrayList) this.LLJI).size()));
        if (fragmentLJJJJZI2 == null) {
            fragmentLJJJJZI2 = new CheckupRelationFollowingListFragment();
        }
        fragmentLJJJJZI2.setArguments(getArguments());
        ((ArrayList) this.LLJI).add(fragmentLJJJJZI2);
        List<String> list2 = this.LLJIJIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(getResources().getString(2131845064));
        sbLIZ2.append(' ');
        Integer value2 = aS().LL.getValue();
        if (value2 != null) {
            jIntValue2 = value2.intValue();
        } else {
            jIntValue2 = 0;
        }
        sbLIZ2.append(C1843500y4a.LIZIZ(jIntValue2));
        ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ2));
        Fragment fragmentLJJJJZI3 = getChildFragmentManager().LJJJJZI(C1590400rUM.LJJIZ(R.id.viewpager, ((ArrayList) this.LLJI).size()));
        if (fragmentLJJJJZI3 == null) {
            fragmentLJJJJZI3 = new CheckupRelationFollowerListFragment();
        }
        fragmentLJJJJZI3.setArguments(getArguments());
        ((ArrayList) this.LLJI).add(fragmentLJJJJZI3);
        List<String> list3 = this.LLJIJIL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C844470XAv.LIZ().getString(R.string.jqq));
        sbLIZ3.append(' ');
        Integer value3 = aS().LLILLJJLI.getValue();
        if (value3 != null) {
            jIntValue3 = value3.intValue();
        }
        sbLIZ3.append(C1843500y4a.LIZIZ(jIntValue3));
        ((ArrayList) list3).add(C2188811AlT.LIZIZ(sbLIZ3));
        final FragmentManager childFragmentManager = getChildFragmentManager();
        final List<Fragment> list4 = this.LLJI;
        final List<String> list5 = this.LLJIJIL;
        C0IOK c0iok = new C0IOK(childFragmentManager, list4, list5) { // from class: X.0IUU
            public final List<Fragment> LLILZIL;
            public final List<String> LLILZLL;

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return this.LLILZIL.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i2) {
                if (i2 >= 0) {
                    this.LLILZIL.size();
                }
                return (CharSequence) ListProtector.get(this.LLILZLL, i2);
            }

            @Override // X.C0IOK
            public final Fragment LJJIJIL(int i2) {
                if (i2 >= 0) {
                    this.LLILZIL.size();
                }
                return (Fragment) ListProtector.get(this.LLILZIL, i2);
            }

            {
                this.LLILZIL = list4;
                this.LLILZLL = list5;
            }
        };
        C21594419fC c21594419fC = this.LLIZ;
        if (c21594419fC != null) {
            c21594419fC.setAdapter(c0iok);
        }
        C21594419fC c21594419fC2 = this.LLIZ;
        if (c21594419fC2 != null) {
            c21594419fC2.setOffscreenPageLimit(3);
        }
        ZR(1);
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        c1076010e6h.LIZIZ().getRelationObservable().subscribe(this, new AObserverS223S0100000_19(this, 68));
        c1076010e6h.LIZIZ().LIZJ().subscribe(this, new AObserverS223S0100000_19(this, 69));
        aS().LL.observe(getViewLifecycleOwner(), new AObserverS213S0100000_9(this, 13));
        aS().LLILLJJLI.observe(getViewLifecycleOwner(), new AObserverS213S0100000_9(this, 14));
        aS().LLILLL.observe(getViewLifecycleOwner(), new AObserverS213S0100000_9(this, 15));
    }
}
