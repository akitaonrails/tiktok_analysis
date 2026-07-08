package com.ss.android.ugc.aweme.topic.book.creator;

import X.AbstractC2211791BhR;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C098200Yq;
import X.C0HZQ;
import X.C0ID2;
import X.C0OAT;
import X.C0P4I;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C1558360qeg;
import X.C1558520qew;
import X.C189200o6;
import X.C19719912Dl;
import X.C1AF0;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C264720AZa;
import X.C444960Hcc;
import X.C452080Ho6;
import X.C452501pT;
import X.C724240Sb0;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1334290kpH;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS141S0100000_6;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BookSearchItemCell extends PowerCell<C0OAT> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public TopicSearchListAssem.TopicSelectedAbility LL;
    public final AssemVMLazy LLILLJJLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BookSearchItemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/topic/common/creator/vm/TopicSearchViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BookSearchItemCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicSearchViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1509);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(627);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 1520), awS553S0100000_9, AFwS195S0000000_9.get$arr$(316), new AwS553S0100000_9((C03K6) this, 1495), new AwS553S0100000_9((C03K6) this, 1497), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1499), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 1501), null, new AwS553S0100000_9((C03K6) this, 1502));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9((C03K6) this, 1496);
            AwS553S0100000_9 awS553S0100000_93 = new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1498);
            AwS553S0100000_9 awS553S0100000_94 = new AwS553S0100000_9(c19719912DlLIZ, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS410S0200000_9((InterfaceC451590HnJ) obj, awS553S0100000_92, 66));
            AwS553S0100000_9 awS553S0100000_95 = new AwS553S0100000_9(c01gwLIZIZ, 1503);
            AwS553S0100000_9 awS553S0100000_96 = new AwS553S0100000_9(c01gwLIZIZ, 1504);
            AwS553S0100000_9 awS553S0100000_97 = new AwS553S0100000_9(c01gwLIZIZ, 1505);
            AwS553S0100000_9 awS553S0100000_98 = new AwS553S0100000_9(c01gwLIZIZ, 1506);
            AwS553S0100000_9 awS553S0100000_99 = new AwS553S0100000_9(c01gwLIZIZ, 1507);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS553S0100000_94, awS553S0100000_9, new C452080Ho6(), awS553S0100000_95, awS553S0100000_96, awS553S0100000_93, aFwS240S0000000_9, awS553S0100000_97, awS553S0100000_98, awS553S0100000_99);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 1508), awS553S0100000_9, AFwS195S0000000_9.get$arr$(317), new AwS553S0100000_9((C03K6) this, 1510), new AwS553S0100000_9((C03K6) this, 1511), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1512), aFwS240S0000000_9, new AwS553S0100000_9((C03K6) this, 1513), null, new AwS553S0100000_9((C03K6) this, 1514));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS553S0100000_9(c19719912DlLIZ, 1515), awS553S0100000_9, AFwS195S0000000_9.get$arr$(318), new AwS553S0100000_9((C03K6) this, 1516), new AwS553S0100000_9((C03K6) this, 1517), new AwS553S0100000_9((C03K6) this, 1518), aFwS240S0000000_9, null, null, new AwS553S0100000_9((C03K6) this, 1519));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Fragment fragmentLJI;
        super.onItemViewCreated();
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = null;
        if (currentLifecycleOwner != null && (fragmentLJI = C724240Sb0.LJI(currentLifecycleOwner)) != null) {
            topicSelectedAbility = (TopicSearchListAssem.TopicSelectedAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), TopicSearchListAssem.TopicSelectedAbility.class, null);
        }
        this.LL = topicSelectedAbility;
        C2211751BhN.LIZ(this.itemView, new AbstractC2211791BhR(this) { // from class: X.0Oiq
            public Function0<String> LJ;
            public final float LJFF = 0.001f;
            public final C638890P4d LJI;

            @Override // X.AbstractC2211791BhR
            public final boolean LJIIIIZZ() {
                return false;
            }

            @Override // X.AbstractC2211791BhR
            public final Function0<String> LIZLLL() {
                return this.LJ;
            }

            @Override // X.AbstractC2211791BhR
            public final InterfaceC2211931Bhf LJFF() {
                return this.LJI;
            }

            @Override // X.AbstractC2211791BhR
            public final float LJIIL() {
                return this.LJFF;
            }

            {
                this.LJ = new AwS553S0100000_9(this, 1494);
                this.LJI = new C638890P4d(this, 1);
            }

            @Override // X.AbstractC2211791BhR
            public final void LJIILL(Function0<String> function0) {
                this.LJ = function0;
            }
        });
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        SpannableString spannableString;
        int i;
        boolean zUB0;
        List<String> urlList;
        String str;
        Object c098200Yq;
        int iIntValue;
        C0OAT c0oat = (C0OAT) interfaceC1891350zJl;
        TopicRawInfo topicRawInfo = c0oat.LL;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        String str2 = topicRawInfo.title;
        if (str2 != null) {
            spannableString = new SpannableString(str2);
            try {
                List<Position> list = c0oat.LLILLJJLI;
                if (list != null) {
                    for (Position position : list) {
                        C786410Ut5.p2(spannableString, new StyleSpan(1), position.getBegin(), position.getEnd() + 1, 18);
                        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
                        if (currentLifecycleOwner != null && C724240Sb0.LIZ(currentLifecycleOwner) != null) {
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.itemView.getContext());
                            if (numLIZJ != null) {
                                iIntValue = numLIZJ.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), position.getBegin(), position.getEnd() + 1, 18);
                        }
                    }
                    c098200Yq = Unit.LIZ;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        } else {
            spannableString = null;
        }
        textView.setText(spannableString);
        View viewFindViewById = this.itemView.findViewById(R.id.title);
        if (C444960Hcc.LIZJ(this.itemView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        viewFindViewById.setTextDirection(i);
        ((TextView) this.itemView.findViewById(R.id.wlq)).setText(topicRawInfo.authorName);
        if (C264720AZa.LIZJ) {
            Double dLIZIZ = c0oat.LL.LIZIZ();
            if (dLIZIZ != null) {
                C786410Ut5.LJZL(0, (LinearLayout) this.itemView.findViewById(R.id.srp));
                ((TextView) this.itemView.findViewById(R.id.srz)).setText(dLIZIZ.toString());
            } else {
                C786410Ut5.LJZL(8, (LinearLayout) this.itemView.findViewById(R.id.srp));
            }
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 10), this.itemView);
        C0HZQ c0hzq = (C0HZQ) this.itemView.findViewById(R.id.uki);
        C786410Ut5.D7(c0hzq, null);
        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = this.LL;
        String str3 = "";
        if (topicSelectedAbility != null) {
            String str4 = topicRawInfo.id;
            if (str4 == null) {
                str4 = "";
            }
            zUB0 = topicSelectedAbility.uB0(str4);
        } else {
            zUB0 = false;
        }
        c0hzq.setChecked(zUB0);
        C786410Ut5.D7(c0hzq, new C0P4I(this, c0oat, c0hzq, topicRawInfo, 0));
        UrlModel urlModel = topicRawInfo.cover;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null && (str = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            str3 = str;
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str3);
        c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.cover));
        c1331670kl3LJIIIZ.LJIIJ(new C0ID2(this, 0));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fw3, viewGroup, false);
    }
}
