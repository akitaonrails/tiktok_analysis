package com.ss.android.ugc.aweme.compliance.privacy.checkup.privacy;

import X.AbstractC191832103a;
import X.AnonymousClass1031;
import X.C104A;
import X.C104S;
import X.C191821102p;
import X.C191834103c;
import X.C191848103q;
import X.C191850103s;
import X.C192007109t;
import X.C2097908Jt;
import Y.ARunnableS97S0200000_28;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public abstract class CheckupPrivacyBaseFragment extends CheckupBasePageFragment {
    public RecyclerView LLILZIL;
    public C191834103c LLILZLL;

    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment
    public final int MR() {
        return R.layout.bdm;
    }

    public abstract List<C104A> aS();

    public abstract String bS();

    public abstract C191850103s cS();

    /* JADX WARN: Type inference failed for: r11v0, types: [X.109f] */
    @Override // com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILZIL = (RecyclerView) view.findViewById(R.id.ms4);
        if (this.LLILZLL == null) {
            TPSCRenderManager tPSCRenderManagerLIZJ = C191821102p.LIZJ();
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext(), R.style.abh);
            ViewModelStoreOwner activity = getActivity();
            if (activity == null) {
                activity = this;
            }
            C191848103q c191848103q = new C191848103q(contextThemeWrapper, activity, this, bS(), getArguments(), C2097908Jt.LIZJ(new Pair(C104S.class, new AnonymousClass1031() { // from class: X.104P
                @Override // X.AnonymousClass1031
                public final AbstractC191843103l LIZ(C191848103q c191848103q2, C104A c104a) {
                    if (c104a instanceof C104S) {
                        TPSCRenderManager tPSCRenderManagerLIZJ2 = C191821102p.LIZJ();
                        C104S c104s = (C104S) c104a;
                        List<C191995109h> list = c104s.LJII;
                        tPSCRenderManagerLIZJ2.getClass();
                        return new C104R(c104s, C104C.LIZ(c191848103q2, list));
                    }
                    return null;
                }
            })), new C192007109t(getEnterFrom(), bS()) { // from class: X.109f
                public final String LIZ;
                public final String LIZIZ;

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.InterfaceC191999109l
                public final void LIZ(C192008109u c192008109u) {
                    if (c192008109u instanceof C192002109o) {
                        String str = c192008109u.LIZIZ;
                        if (str == null) {
                            str = c192008109u.LIZ;
                        }
                        switch (str.hashCode()) {
                            case -2037803430:
                                if (str.equals("checkup_dm_friends_options")) {
                                    C191994109g c191994109g = C191994109g.LIZ;
                                    String str2 = this.LIZ;
                                    c191994109g.getClass();
                                    C191994109g.LJIIIIZZ(str2, "tap_message_friends");
                                }
                                break;
                            case -1316821672:
                                if (str.equals("checkup_dm_potential_connection_options")) {
                                    C191994109g c191994109g2 = C191994109g.LIZ;
                                    String str3 = this.LIZ;
                                    c191994109g2.getClass();
                                    C191994109g.LJIIIIZZ(str3, "tap_message_potential");
                                }
                                break;
                            case -1195355141:
                                if (str.equals("checkup_content_reuse_permission_options")) {
                                    C191994109g c191994109g3 = C191994109g.LIZ;
                                    String str4 = this.LIZ;
                                    c191994109g3.getClass();
                                    C191994109g.LJIIL(str4, "tap_reuse_content_permission");
                                }
                                break;
                            case -764392387:
                                if (str.equals("checkup_private_account_item")) {
                                    if (Intrinsics.LJFF(this.LIZIZ, "checkup_privacy_visibility")) {
                                        C191994109g c191994109g4 = C191994109g.LIZ;
                                        String str5 = this.LIZ;
                                        c191994109g4.getClass();
                                        C191994109g.LJIIL(str5, "tap_private_account");
                                    } else {
                                        C191994109g c191994109g5 = C191994109g.LIZ;
                                        String str6 = this.LIZ;
                                        c191994109g5.getClass();
                                        C191994109g.LJIIIIZZ(str6, "tap_private_account");
                                    }
                                }
                                break;
                            case -424403924:
                                if (str.equals("checkup_direct_message_options")) {
                                    C191994109g c191994109g6 = C191994109g.LIZ;
                                    String str7 = this.LIZ;
                                    c191994109g6.getClass();
                                    C191994109g.LJIIIIZZ(str7, "tap_message_permission");
                                }
                                break;
                            case 1149621404:
                                if (str.equals("checkup_dm_others_options")) {
                                    C191994109g c191994109g7 = C191994109g.LIZ;
                                    String str8 = this.LIZ;
                                    c191994109g7.getClass();
                                    C191994109g.LJIIIIZZ(str8, "tap_message_others");
                                }
                                break;
                            case 1511640610:
                                if (str.equals("checkup_comment_options")) {
                                    C191994109g c191994109g8 = C191994109g.LIZ;
                                    String str9 = this.LIZ;
                                    c191994109g8.getClass();
                                    C191994109g.LJIIIIZZ(str9, "tap_comment_permission");
                                }
                                break;
                        }
                    }
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.InterfaceC191999109l
                public final void LIZIZ(C192008109u c192008109u) {
                    String str;
                    if (c192008109u instanceof C192002109o) {
                        String str2 = c192008109u.LIZIZ;
                        if (str2 == null) {
                            str2 = c192008109u.LIZ;
                        }
                        switch (str2.hashCode()) {
                            case -2037803430:
                                if (str2.equals("checkup_dm_friends_options")) {
                                    C191994109g c191994109g = C191994109g.LIZ;
                                    C192002109o c192002109o = (C192002109o) c192008109u;
                                    Integer num = c192002109o.LIZLLL;
                                    Integer numValueOf = Integer.valueOf(c192002109o.LIZJ);
                                    c191994109g.getClass();
                                    C191994109g.LJI(num, numValueOf, "friends");
                                }
                                break;
                            case -1316821672:
                                if (str2.equals("checkup_dm_potential_connection_options")) {
                                    C191994109g c191994109g2 = C191994109g.LIZ;
                                    C192002109o c192002109o2 = (C192002109o) c192008109u;
                                    Integer num2 = c192002109o2.LIZLLL;
                                    Integer numValueOf2 = Integer.valueOf(c192002109o2.LIZJ);
                                    c191994109g2.getClass();
                                    C191994109g.LJI(num2, numValueOf2, "potential");
                                }
                                break;
                            case -1195355141:
                                if (str2.equals("checkup_content_reuse_permission_options")) {
                                    C2344009Gk c2344009Gk = new C2344009Gk();
                                    c2344009Gk.LJIIIIZZ("enter_from", "privacy_checkup");
                                    C191819102n.LIZ.getClass();
                                    c2344009Gk.LIZJ(C191819102n.LIZ().getFriendCount(), "muf_cnt");
                                    C191994109g c191994109g3 = C191994109g.LIZ;
                                    C192002109o c192002109o3 = (C192002109o) c192008109u;
                                    Integer num3 = c192002109o3.LIZLLL;
                                    c191994109g3.getClass();
                                    c2344009Gk.LJIIIIZZ("from_reuse_settings", C191994109g.LJFF(num3));
                                    c2344009Gk.LJIIIIZZ("to_reuse_settings", C191994109g.LJFF(Integer.valueOf(c192002109o3.LIZJ)));
                                    C20684815ws.LJIILLIIL("click_reuse_content_permission_settings_sheet", c2344009Gk.LIZ);
                                }
                                break;
                            case -764392387:
                                if (str2.equals("checkup_private_account_item")) {
                                    if (((C192002109o) c192008109u).LIZJ == 1) {
                                        str = "private_account_on";
                                    } else {
                                        str = "private_account_off";
                                    }
                                    C2344009Gk c2344009Gk2 = new C2344009Gk();
                                    c2344009Gk2.LJIIIIZZ("enter_from", "privacy_checkup");
                                    C20684815ws.LJIILLIIL(str, c2344009Gk2.LIZ);
                                }
                                break;
                            case -424403924:
                                if (str2.equals("checkup_direct_message_options")) {
                                    C191994109g c191994109g4 = C191994109g.LIZ;
                                    C192002109o c192002109o4 = (C192002109o) c192008109u;
                                    Integer num4 = c192002109o4.LIZLLL;
                                    Integer numValueOf3 = Integer.valueOf(c192002109o4.LIZJ);
                                    c191994109g4.getClass();
                                    C191994109g.LJI(num4, numValueOf3, "");
                                }
                                break;
                            case 1149621404:
                                if (str2.equals("checkup_dm_others_options")) {
                                    C191994109g c191994109g5 = C191994109g.LIZ;
                                    C192002109o c192002109o5 = (C192002109o) c192008109u;
                                    Integer num5 = c192002109o5.LIZLLL;
                                    Integer numValueOf4 = Integer.valueOf(c192002109o5.LIZJ);
                                    c191994109g5.getClass();
                                    C191994109g.LJI(num5, numValueOf4, "others");
                                }
                                break;
                            case 1511640610:
                                if (str2.equals("checkup_comment_options")) {
                                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                                    c2344009Gk3.LJIIIIZZ("enter_from", "privacy_checkup");
                                    C191819102n.LIZ.getClass();
                                    c2344009Gk3.LIZJ(C191819102n.LIZ().getFriendCount(), "muf_cnt");
                                    C191994109g c191994109g6 = C191994109g.LIZ;
                                    C192002109o c192002109o6 = (C192002109o) c192008109u;
                                    Integer num6 = c192002109o6.LIZLLL;
                                    c191994109g6.getClass();
                                    c2344009Gk3.LJIIIIZZ("from_status", C191994109g.LIZ(null, num6));
                                    c2344009Gk3.LJIIIIZZ("to_status", C191994109g.LIZ(null, Integer.valueOf(c192002109o6.LIZJ)));
                                    C20684815ws.LJIILLIIL("change_comment_permission", c2344009Gk3.LIZ);
                                }
                                break;
                        }
                    }
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = str;
                }
            }, 64);
            List<C104A> listAS = aS();
            tPSCRenderManagerLIZJ.getClass();
            C191834103c c191834103cLIZJ = TPSCRenderManager.LIZJ(c191848103q, listAS);
            ((ArrayList) c191834103cLIZJ.LLILZIL).add(new AbstractC191832103a() { // from class: X.103r
                @Override // X.AbstractC191832103a
                public final void LIZIZ(List<AbstractC191840103i> list) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.LIZ.cS());
                    ArrayList<Object> arrayList2 = (ArrayList) list;
                    for (Object obj : arrayList2) {
                        if ((obj instanceof InterfaceC191854103w) && ((InterfaceC191854103w) obj).x0()) {
                            arrayList.add(new AnonymousClass1042(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
                        }
                        arrayList.add(obj);
                    }
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
            });
            this.LLILZLL = c191834103cLIZJ;
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(requireContext(), 1);
        final RecyclerView recyclerView = this.LLILZIL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(wrapLinearLayoutManager);
            recyclerView.setItemAnimator(null);
            recyclerView.setAdapter(this.LLILZLL);
            HandlerHook.viewPost(recyclerView, new ARunnableS97S0200000_28(this, recyclerView, 14));
            recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.104Q
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view2, int i, int i2, int i3, int i4) {
                    this.LIZ.UR(recyclerView.canScrollVertically(1));
                }
            });
        }
    }
}
