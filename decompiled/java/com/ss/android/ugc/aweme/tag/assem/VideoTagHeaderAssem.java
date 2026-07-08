package com.ss.android.ugc.aweme.tag.assem;

import X.C019F;
import X.C09R3;
import X.C0OM1;
import X.C0WZX;
import X.C1250250idj;
import X.C1251150ifB;
import X.C13LE;
import X.C13LP;
import X.C15GH;
import X.C15NN;
import X.C1637806bA;
import X.C1637906bB;
import X.C16HQ;
import X.C19719912Dl;
import X.C19EG;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C291001Au;
import X.C298690BnH;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737450SwJ;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import X.InterfaceC724720Sbm;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.tag.assem.VideoTagHeaderAssem;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagSearchListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class VideoTagHeaderAssem extends UIContentAssem implements C15NN {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public EditText LLJI;
    public View LLJIJIL;
    public List<IMUser> LLJILJIL;
    public boolean LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VideoTagHeaderAssem.class, "friendsListVM", "getFriendsListVM()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagFriendsListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(VideoTagHeaderAssem.class, "searchListVM", "getSearchListVM()Lcom/ss/android/ugc/aweme/tag/viewmodel/VideoTagSearchListViewModel;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJ = 8;
    }

    public VideoTagHeaderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoTagFriendsListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1212), AFwS276S0000000_31.get$arr$(222), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(VideoTagSearchListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1213), AFwS276S0000000_31.get$arr$(223), null, true);
        this.LLJILJIL = new ArrayList();
    }

    @Override // X.C15NN, X.InterfaceC724720Sbm, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC724720Sbm
    /* JADX INFO: renamed from: Go, reason: merged with bridge method [inline-methods] */
    public C15GH lt() {
        return new C15GH(new C291001Au(Boolean.FALSE), null);
    }

    public final VideoTagFriendsListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (VideoTagFriendsListViewModel) assemVMLazy.getValue();
    }

    public final VideoTagSearchListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (VideoTagSearchListViewModel) assemVMLazy.getValue();
    }

    @Override // X.C15NN
    public void LJJIL() {
        EditText editText = this.LLJI;
        if (editText == null) {
            editText = null;
        }
        if (editText.hasFocus()) {
            editText.clearFocus();
        }
        EditText editText2 = this.LLJI;
        KeyboardUtils.LIZIZ(editText2 != null ? editText2 : null);
    }

    public final void Lo() {
        View view = this.LLJIJIL;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(8, view);
        EditText editText = this.LLJI;
        if (editText == null) {
            editText = null;
        }
        Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6pZNHPzyEvNQstqSJSEdDl1QdYHJqpuv4KLzeN", null));
        if (editableLLJILLL != null) {
            editableLLJILLL.clear();
        }
        LJJIL();
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(221);
        Class<VideoTagHeaderAssem> superclass = VideoTagHeaderAssem.class;
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        Context context;
        String string;
        String string2;
        Context context2;
        Context context3;
        final C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            return;
        }
        if (C298690BnH.LIZ() == 2 || C298690BnH.LIZ() == 3 ? (context = getContext()) == null || (string = context.getString(2131849590)) == null : C298690BnH.LIZ() != 4 ? (context2 = getContext()) == null || (string = context2.getString(2131849592)) == null : (context3 = getContext()) == null || (string = context3.getString(2131849591)) == null) {
            string = "";
        }
        if (C298690BnH.LIZJ()) {
            TuxNavBar tuxNavBar = (TuxNavBar) LJJIJL().findViewById(R.id.y08);
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            c0om1.LIZJ = c1250250idj;
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZJ(new AwS575S0100000_31(this, 1162));
            c0om1.LIZIZ(c1251150ifB);
            tuxNavBar.setNavActions(c0om1);
        } else {
            TuxNavBar tuxNavBar2 = (TuxNavBar) LJJIJL().findViewById(R.id.y08);
            C0OM1 c0om12 = new C0OM1();
            C1251150ifB c1251150ifB2 = new C1251150ifB();
            c1251150ifB2.LIZLLL();
            c1251150ifB2.LIZJ = R.raw.icon_x_mark;
            c1251150ifB2.LIZJ(new AwS575S0100000_31(c19egLIZ, 1163));
            c0om12.LJ(c1251150ifB2);
            C1250250idj c1250250idj2 = new C1250250idj();
            c1250250idj2.LIZJ = string;
            c0om12.LIZJ = c1250250idj2;
            tuxNavBar2.setNavActions(c0om12);
        }
        View viewFindViewById = LJJIJL().findViewById(R.id.u_1);
        TextView textView = (TextView) viewFindViewById;
        int iLIZ = C298690BnH.LIZ();
        if (2 <= iLIZ && iLIZ < 5) {
            Context context4 = textView.getContext();
            if (context4 != null) {
                string2 = context4.getString(2131849594);
            } else {
                string2 = null;
            }
            textView.setHint(string2);
        }
        textView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.15NQ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (!this.LL.LLJILJILJ && C298690BnH.LIZJ() && z) {
                    VideoTagHeaderAssem videoTagHeaderAssem = this.LL;
                    videoTagHeaderAssem.LLJILJILJ = true;
                    ViewGroup.LayoutParams layoutParams = videoTagHeaderAssem.LJJIJL().getLayoutParams();
                    layoutParams.height = (int) (((double) C497820Jfg.LIZ(c19egLIZ)) * 0.95d);
                    C786410Ut5.W5(this.LL.LJJIJL(), layoutParams);
                }
            }
        });
        textView.addTextChangedListener(new C16HQ(this, 3));
        this.LLJI = (EditText) viewFindViewById;
        View viewFindViewById2 = LJJIJL().findViewById(R.id.coo);
        C786410Ut5.a9((TuxIconView) viewFindViewById2, new ACListenerS165S0100000_31(this, 89));
        this.LLJIJIL = viewFindViewById2;
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.15NR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 72), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.15NS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 73), 4);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.15NT
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15NF) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS645S0100000_31(this, 71), 4);
        int iLIZ2 = C298690BnH.LIZ();
        if (2 <= iLIZ2 && iLIZ2 < 5) {
            return;
        }
        C737450SwJ.LIZIZ.LJFF(c19egLIZ, true, AFwS221S0000000_31.get$arr$(284));
    }
}
