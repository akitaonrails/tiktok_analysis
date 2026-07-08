package com.ss.android.ugc.aweme.topic.trendingtopic.ui;

import X.AbstractC21673619ry;
import X.AbstractC471570IeR;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0OM1;
import X.C0WZX;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1252710ihh;
import X.C13LE;
import X.C13LP;
import X.C15GA;
import X.C15GB;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C16HH;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C19EG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C291001Au;
import X.C337010DJb;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724720Sbm;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicSearchViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.api.BillboardInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTrendingTopicHeaderAssem extends UIContentAssem implements C15GB {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public EditText LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public RecyclerView LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public C1749280vcc LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTrendingTopicHeaderAssem.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/topic/trendingtopic/VideoTrendingTopicListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoTrendingTopicHeaderAssem.class, "searchVm", "getSearchVm()Lcom/ss/android/ugc/aweme/topic/trendingtopic/VideoTrendingTopicSearchViewModel;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public VideoTrendingTopicHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTrendingTopicListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ, 2330), AFwS276S0000000_31.get$arr$(240), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoTrendingTopicSearchViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS562S0100000_18(c19719912DlLIZ2, 2331), AFwS276S0000000_31.get$arr$(241), null, true);
        this.LLJJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2329));
        this.LLJJI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2328));
    }

    @Override // X.C15GB, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    private final C1722300uv6 Jo() {
        return (C1722300uv6) this.LLJJI.getValue();
    }

    private final C1722300uv6 Lo() {
        return (C1722300uv6) this.LLJJ.getValue();
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Go, reason: merged with bridge method [inline-methods] */
    public C15GA lt() {
        return new C15GA(new C291001Au(Boolean.FALSE), null);
    }

    public final void Ho() {
        C1749280vcc c1749280vcc = this.LLJILLL;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
    }

    @Override // X.C15GB
    public void LJJIL() {
        EditText editText = this.LLIZLLLIL;
        if (editText == null) {
            editText = null;
        }
        if (editText.hasFocus()) {
            editText.clearFocus();
        }
        EditText editText2 = this.LLIZLLLIL;
        KeyboardUtils.LIZIZ(editText2 != null ? editText2 : null);
    }

    public final VideoTrendingTopicListViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (VideoTrendingTopicListViewModel) assemVMLazy.getValue();
    }

    public final VideoTrendingTopicSearchViewModel Oo() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (VideoTrendingTopicSearchViewModel) assemVMLazy.getValue();
    }

    public final void Vo() {
        View view = this.LLJ;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        View view2 = this.LLJI;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.LJLLLLLL(8, view2);
        EditText editText = this.LLIZLLLIL;
        if (editText == null) {
            editText = null;
        }
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nc5bNkia4dy4PADxCQQaxGqBbTTLV1jXcicEsInQmRoEdkoWnC/j+d+xyOzEJKhzbkuQ=", null));
        if (editableLLJILLL != null) {
            editableLLJILLL.clear();
        }
        RecyclerView recyclerView = this.LLJIJIL;
        if (recyclerView == null) {
            recyclerView = null;
        }
        C786410Ut5.LLIZLLLIL(recyclerView, 0);
        if (No().LLIZLLLIL != null) {
            ((RecyclerView) LJJIJL().findViewById(R.id.yey)).scrollToPosition(No().wQ2());
        }
        C786410Ut5.LLF(0, (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.yey));
        C786410Ut5.LLF(8, (ViewOnAttachStateChangeListenerC20604515jv) LJJIJL().findViewById(R.id.tds));
        Ho();
        No().zQ2(null, true);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(239);
        Class<VideoTrendingTopicHeaderAssem> superclass = VideoTrendingTopicHeaderAssem.class;
        Class<?>[] interfaces = superclass.getInterfaces();
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls : interfaces) {
            if (InterfaceC724720Sbm.class.isAssignableFrom(cls)) {
                arrayList.add(cls);
            }
        }
        while (arrayList.isEmpty()) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return;
            }
            Class<?>[] interfaces2 = superclass.getInterfaces();
            arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces2) {
                if (InterfaceC724720Sbm.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
        }
        getSupervisor().LJFF().LJI((Class) C13LP.LJJJJZI(arrayList), aFwS276S0000000_31);
    }

    public final boolean So() {
        List<VideoTrendingTopic> list;
        if (No().xQ2() == 0) {
            List<VideoTrendingTopic> list2 = Oo().LL;
            if (list2 != null && !list2.isEmpty()) {
                return true;
            }
        } else {
            int iXQ2 = No().xQ2();
            if (1 <= iXQ2 && iXQ2 < 3) {
                VideoTrendingTopicListViewModel videoTrendingTopicListViewModelNo = No();
                if (videoTrendingTopicListViewModelNo.xQ2() < ((ArrayList) videoTrendingTopicListViewModelNo.LL).size() && (list = ((BillboardInfo) ListProtector.get(videoTrendingTopicListViewModelNo.LL, videoTrendingTopicListViewModelNo.xQ2())).topics) != null && (!list.isEmpty())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void Zo() {
        C1722300uv6 c1722300uv6Jo = Jo();
        if (c1722300uv6Jo != null) {
            C1749280vcc c1749280vcc = this.LLJILLL;
            if (c1749280vcc != null) {
                c1749280vcc.setStatus(c1722300uv6Jo);
            }
            C1749280vcc c1749280vcc2 = this.LLJILLL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
            }
        }
    }

    public final void ap() {
        C1722300uv6 c1722300uv6Lo = Lo();
        if (c1722300uv6Lo != null) {
            C1749280vcc c1749280vcc = this.LLJILLL;
            if (c1749280vcc != null) {
                c1749280vcc.setStatus(c1722300uv6Lo);
            }
            C1749280vcc c1749280vcc2 = this.LLJILLL;
            if (c1749280vcc2 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc2, 0);
            }
        }
    }

    public final void bp() {
        C1749280vcc c1749280vcc = (C1749280vcc) LJJIJL().findViewById(R.id.w28);
        this.LLJILLL = c1749280vcc;
        if (c1749280vcc == null) {
            c1749280vcc = null;
        }
        c1749280vcc.LJ();
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
        C1749280vcc c1749280vcc2 = this.LLJILLL;
        C786410Ut5.l9(c1749280vcc2 != null ? c1749280vcc2 : null, new ACListenerS165S0100000_31(this, 94));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        No().LLJ.LJ();
        Oo().LLILLL.LJ();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        String string = c19egLIZ.getString(2131850788);
        bp();
        TuxNavBar tuxNavBar = (TuxNavBar) LJJIJL().findViewById(R.id.y08);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZJ(new AwS432S0200000_31(c19egLIZ, this, 81));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        View viewFindViewById = LJJIJL().findViewById(R.id.u_1);
        viewFindViewById.setOnFocusChangeListener(new C16HH(this, 0));
        this.LLIZLLLIL = (EditText) viewFindViewById;
        View viewFindViewById2 = LJJIJL().findViewById(R.id.coo);
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS165S0100000_31(this, 92));
        this.LLJ = viewFindViewById2;
        View viewFindViewById3 = LJJIJL().findViewById(R.id.cuo);
        C786410Ut5.h9((TuxTextView) viewFindViewById3, new ACListenerS165S0100000_31(this, 93));
        this.LLJI = viewFindViewById3;
        final RecyclerView recyclerView = (RecyclerView) LJJIJL().findViewById(R.id.yf2);
        recyclerView.setAdapter(new C337010DJb(recyclerView.getContext(), C1697810uHb.LJIIJJI(c19egLIZ.getString(2131850794), c19egLIZ.getString(2131850795))));
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(new AbstractC471570IeR() { // from class: X.15G5
                @Override // X.AbstractC471570IeR
                public final void LIZIZ(int i, int i2) {
                    String string2;
                    if (i == ((C337010DJb) recyclerView.getAdapter()).LLILLL) {
                        VideoTrendingTopicListViewModel videoTrendingTopicListViewModelNo = this.No();
                        C337010DJb c337010DJb = (C337010DJb) recyclerView.getAdapter();
                        List<String> list = c337010DJb.LLILLJJLI;
                        if (list != null) {
                            string2 = (String) ListProtector.get(list, c337010DJb.LLILLL);
                        } else {
                            Context context = c337010DJb.LL;
                            if (context != null) {
                                string2 = context.getString(2131850794);
                            } else {
                                string2 = null;
                            }
                        }
                        videoTrendingTopicListViewModelNo.zQ2(string2, false);
                    }
                }
            });
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C786410Ut5.LLIZLLLIL(recyclerView, 0);
        this.LLJIJIL = recyclerView;
        C736680Sv4.LJIIIIZZ(this, No(), new C2217381BqS() { // from class: X.15GC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GD) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 78), 4);
        C736680Sv4.LJIIIIZZ(this, Oo(), new C2217381BqS() { // from class: X.159R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C159P) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 79), 4);
        C1252710ihh.LJIIJJI(this, C13LE.LIZ(C15GB.class), new C2217381BqS() { // from class: X.15G8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GA) obj).LIZIZ;
            }
        }, new C2217381BqS() { // from class: X.15G9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15GA) obj).LIZ;
            }
        }, new AwS645S0100000_31(this, 77));
    }
}
