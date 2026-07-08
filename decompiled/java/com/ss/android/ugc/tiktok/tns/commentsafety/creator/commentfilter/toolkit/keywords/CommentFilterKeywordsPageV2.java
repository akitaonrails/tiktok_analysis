package com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords;

import X.C01GW;
import X.C09JN;
import X.C0EZW;
import X.C0I7D;
import X.C0WZX;
import X.C1163504gr;
import X.C11S5;
import X.C1250250idj;
import X.C1251150ifB;
import X.C127K;
import X.C13BV;
import X.C15438062q;
import X.C1701940uOG;
import X.C1703730uR9;
import X.C1887830zE5;
import X.C1887860zE8;
import X.C1888190zEf;
import X.C1888220zEi;
import X.C19333910kT;
import X.C2204961BRm;
import X.C452501pT;
import X.C513601zK;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import Y.AfS138S0200000_2;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.ss.android.ugc.tiktok.pns.ui.BaseFragment;
import com.ss.android.ugc.tiktok.tns.commentsafety.ICommentSafetyDepService;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.api.CommentFilterApi;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.keywords.CommentKeywordsVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class CommentFilterKeywordsPageV2 extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2s4Jzx9KyohJCo9PDYtLyonMWsvOyoyPCo+Zyw8JSHELIOSgpJzs1ISk4LD19PCojJSQ6PGsnLDYkJzcoOmEQJyghLCEnDiwgPSohAyA1PiAhLDYcKCg2Hnc=";
    public TuxNavBar LL;
    public C127K LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public C0I7D LLILZIL;
    public TuxIconView LLILZLL;
    public String LLIZ = "";
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 651));

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment
    public final int MR() {
        return R.layout.be3;
    }

    public final CommentKeywordsVM NR() {
        return (CommentKeywordsVM) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        CommentKeywordsVM commentKeywordsVMNR = NR();
        if (commentKeywordsVMNR.LLJIJIL && commentKeywordsVMNR.LLJI) {
            List<String> value = commentKeywordsVMNR.LLILZLL.getValue();
            if (value == null) {
                value = C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : value) {
                if (true ^ Intrinsics.LJFF(a0.LJLJJL(str).toString(), "")) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            CommentFilterApi commentFilterApi = CommentFilterApi.LIZ;
            String json = GsonProtectorUtils.toJson(C1703730uR9.LIZ(), arrayList2);
            commentFilterApi.getClass();
            ICommentSafetyDepService.LIZ.getClass();
            C1888190zEf.LIZ().LIZ(CommentFilterApi.LIZIZ.setCommentFilterKeywords(json), "/aweme/v2/comment/filter/update_words/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS138S0200000_2(commentKeywordsVMNR, arrayList2, 2), new C09JN() { // from class: X.05gA
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String errorMsg;
                    C1C7U.LIZ("CommentKeywordsVM@44f8.upload$2");
                    Throwable th = (Throwable) obj;
                    if (th instanceof C632200Oqw) {
                        errorMsg = ((C632200Oqw) th).getErrorMsg();
                    } else {
                        errorMsg = "";
                    }
                    CommentKeywordsVM.vQ2(errorMsg);
                    C1C7U.LIZIZ("CommentKeywordsVM@44f8.upload$2");
                }
            });
            if (arrayList2.isEmpty()) {
                commentKeywordsVMNR.LLILZ.setValue(2);
                C1888220zEi.LIZIZ.LJIILIIL(2);
            }
            Integer num = (Integer) commentKeywordsVMNR.LLILZIL.getValue();
            int iIntValue = num != null ? num.intValue() : 2;
            int i = commentKeywordsVMNR.LLILLL;
            String str2 = commentKeywordsVMNR.LLILLJJLI;
            String str3 = iIntValue == 1 ? "filter_on" : "filter_off";
            if (iIntValue != i) {
                C1163504gr c1163504gr = C1163504gr.LIZIZ;
                C1887860zE8 c1887860zE8 = new C1887860zE8();
                C1887860zE8.LIZ(c1887860zE8, "enter_from", str2);
                c1163504gr.onEventV3(str3, c1887860zE8.LIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string2 = null;
        if (arguments != null) {
            string2 = arguments.getString("enter_from");
        }
        String str2 = "";
        if (string2 == null) {
            string2 = "";
        }
        this.LLIZ = string2;
        CommentKeywordsVM commentKeywordsVMNR = NR();
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("enter_method")) != null) {
            str2 = string;
        }
        commentKeywordsVMNR.LL = str2;
        NR().LLILLJJLI = this.LLIZ;
        boolean z = true;
        if (C1888220zEi.LIZIZ.LIZJ() != 1) {
            z = false;
        }
        String str3 = this.LLIZ;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C1887860zE8 c1887860zE8 = new C1887860zE8();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        C1887860zE8.LIZ(c1887860zE8, "keyword_toggle_status", str);
        C1887860zE8.LIZ(c1887860zE8, "enter_from", str3);
        c1163504gr.onEventV3("filter_specific_keywords_page_sw", c1887860zE8.LIZ);
    }

    @Override // com.ss.android.ugc.tiktok.pns.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Editable editableLLLLJI;
        String string;
        super.onViewCreated(view, bundle);
        this.LL = (TuxNavBar) view.findViewById(R.id.y1z);
        TuxNavBar tuxNavBar = this.LL;
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
            c1251150ifB.LJIIIIZZ = getString(2131823332);
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 668));
            tuxNavBar.LIZIZ(c1251150ifB);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = tuxNavBar.getContext().getString(2131829047);
            tuxNavBar.LJIJJ(c1250250idj);
            tuxNavBar.LJIIZILJ(false);
            tuxNavBar.setNavBackground(0);
        }
        C127K c127k = (C127K) view.findViewById(R.id.hxx);
        this.LLILLJJLI = c127k;
        if (c127k != null) {
            C0EZW.LIZ(c127k, true, true);
        }
        View viewFindViewById = view.findViewById(R.id.m39);
        this.LLILLL = viewFindViewById;
        int i = 8;
        if (viewFindViewById != null) {
            C0EZW.LIZ(viewFindViewById, false, true);
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        this.LLILZ = (TuxTextView) view.findViewById(R.id.m3_);
        this.LLILZIL = (C0I7D) view.findViewById(R.id.gt2);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.gt4);
        final C0I7D c0i7d = this.LLILZIL;
        if (c0i7d != null) {
            c0i7d.setFilters(new InputFilter[]{new InputFilter.LengthFilter() { // from class: X.0zEe
            }});
            c0i7d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: X.0zEE
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                    int size;
                    if (i2 == 6) {
                        String strValueOf = String.valueOf(C2204961BRm.LLLLJI(c0i7d, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS8bYyA3z1Xk4EBwSivsZmJGiEk314h1cKzwsJsnR9UOzA8ArwyFzazDb+kZDc2tEb+wGWO3RmvlCFQIXz1EtSJgDxKO1iEatAUoYxvUnwOn23C9GA=", null)));
                        if (strValueOf.length() > 0) {
                            List list = (List) this.NR().LLIZ.getValue();
                            if (list != null && list.contains(strValueOf)) {
                                C1389890mGx c1389890mGx = new C1389890mGx(c0i7d);
                                c1389890mGx.LJIIJ(c0i7d.getContext().getString(2131829044));
                                c1389890mGx.LJIIJJI();
                                C1887930zEF.LIZIZ("duplicate", this.LLIZ);
                                return false;
                            }
                            List list2 = (List) this.NR().LLIZ.getValue();
                            if (list2 != null && list2.size() >= 500) {
                                c0i7d.clearFocus();
                                C1389890mGx c1389890mGx2 = new C1389890mGx(c0i7d);
                                c1389890mGx2.LJIIJ(C786410Ut5.j4(c0i7d.getContext().getString(2131836304), Arrays.copyOf(new Object[]{500}, 1)));
                                c1389890mGx2.LJIIJJI();
                                C1887930zEF.LIZIZ("over", this.LLIZ);
                                return false;
                            }
                            this.NR().LLJI = true;
                            CommentKeywordsVM commentKeywordsVMNR = this.NR();
                            List<String> value = commentKeywordsVMNR.LLILZLL.getValue();
                            if (value == null) {
                                value = C13BV.INSTANCE;
                            }
                            ArrayList arrayList = new ArrayList(value);
                            ListProtector.add(arrayList, 0, strValueOf);
                            commentKeywordsVMNR.LLILZLL.setValue(arrayList);
                            commentKeywordsVMNR.LLIZLLLIL.setValue(Integer.valueOf(arrayList.size()));
                            InterfaceC1887850zE7 interfaceC1887850zE7 = commentKeywordsVMNR.LLJ;
                            if (interfaceC1887850zE7 != null) {
                                interfaceC1887850zE7.LIZIZ();
                            }
                            String str = this.NR().LL;
                            List list3 = (List) this.NR().LLIZ.getValue();
                            if (list3 != null) {
                                size = list3.size();
                            } else {
                                size = 0;
                            }
                            String str2 = this.LLIZ;
                            C1163504gr c1163504gr = C1163504gr.LIZIZ;
                            C1887860zE8 c1887860zE8 = new C1887860zE8();
                            C1887860zE8.LIZ(c1887860zE8, "enter_method", str);
                            C1887860zE8.LIZ(c1887860zE8, "keyword", strValueOf);
                            String strValueOf2 = String.valueOf(size);
                            InterfaceC1887880zEA.LIZ.getClass();
                            ((HashMap) c1887860zE8.LIZ).put("current_keyword_num", C1887870zE9.LIZ(strValueOf2));
                            C1887860zE8.LIZ(c1887860zE8, "enter_from", str2);
                            c1163504gr.onEventV3("keyword_filter_add_ck", c1887860zE8.LIZ);
                            c0i7d.clearFocus();
                            c0i7d.setText("");
                            return false;
                        }
                        c0i7d.clearFocus();
                        C1887930zEF.LIZIZ("null", this.LLIZ);
                        C1389890mGx c1389890mGx3 = new C1389890mGx(c0i7d);
                        c1389890mGx3.LJIIIZ(2131829161);
                        c1389890mGx3.LJIIJJI();
                    }
                    return false;
                }
            });
            c0i7d.addTextChangedListener(new C19333910kT(this, 1));
        }
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C0I7D c0i7d2 = this.LLILZIL;
            if (c0i7d2 != null && (editableLLLLJI = C2204961BRm.LLLLJI(c0i7d2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wwd3M8baS8bYyA3z1Xk4EBwSivsZmJGiEk314h1cKzwsJsnR9UOzA8ArwyFzazDb+kZDc2tEb+wGWO3RmvlCFQIXz1EtSJgDxKO1iEatAUoYxvUnwOn23C9GA=", null))) != null && (string = editableLLLLJI.toString()) != null && string.length() != 0) {
                i = 0;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView, i);
            C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(this, 85));
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.m3c);
        if (recyclerView != null) {
            FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(recyclerView.getContext(), 0);
            flexboxLayoutManager.LJJII(1);
            flexboxLayoutManager.LJJIFFI(0);
            flexboxLayoutManager.LJJI(4);
            flexboxLayoutManager.LJJIII(0);
            recyclerView.setLayoutManager(flexboxLayoutManager);
            recyclerView.setAdapter(new C1887830zE5(NR()));
        }
        NR().LLILZIL.observe(getViewLifecycleOwner(), new AObserverS230S0100000_28(this, 58));
        NR().LLIZLLLIL.observe(getViewLifecycleOwner(), new C513601zK(this, 41));
    }
}
