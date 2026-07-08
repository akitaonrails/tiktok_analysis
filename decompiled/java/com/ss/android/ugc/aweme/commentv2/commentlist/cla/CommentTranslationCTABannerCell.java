package com.ss.android.ugc.aweme.commentv2.commentlist.cla;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0HD5;
import X.C1344400l5a;
import X.C13LE;
import X.C1839820xye;
import X.C19719912Dl;
import X.C20600815jK;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C426750GoL;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC586200Myw;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS155S0100000_21;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentTranslationCTABannerCell extends PowerCell<C1344400l5a> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final String LL = "CommentTransCTABannerCell";
    public final AssemVMLazy LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentTranslationCTABannerCell.class, "listVm", "getListVm()Lcom/ss/android/ugc/aweme/commentv2/commentlist/viewmodel/CommentListAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentTranslationCTABannerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentListAssemVM.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 287);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(104);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 272), awS565S0100000_21, AFwS209S0000000_21.get$arr$(165), new AwS565S0100000_21((C03K6) this, 273), new AwS565S0100000_21((C03K6) this, 275), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 277), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 279), null, new AwS565S0100000_21((C03K6) this, 280));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 274);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 276);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 278);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 24));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 281);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 282);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 283);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 284);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 285);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 286), awS565S0100000_21, AFwS209S0000000_21.get$arr$(166), new AwS565S0100000_21((C03K6) this, 288), new AwS565S0100000_21((C03K6) this, 289), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 290), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 291), null, new AwS565S0100000_21((C03K6) this, 292));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 293), awS565S0100000_21, AFwS209S0000000_21.get$arr$(167), new AwS565S0100000_21((C03K6) this, 294), new AwS565S0100000_21((C03K6) this, 295), new AwS565S0100000_21((C03K6) this, 296), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 297));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    public final CommentListAssemVM I5() {
        AssemVMLazy assemVMLazy = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (CommentListAssemVM) assemVMLazy.getValue();
    }

    public final void L5() {
        Object next;
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        C20600815jK<InterfaceC1891350zJl> c20600815jK2 = I5().LLJILJIL;
        if (c20600815jK2 != null) {
            Iterator it2 = ((ArrayList) c20600815jK2.LJII()).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (next instanceof C1344400l5a) {
                        break;
                    }
                }
            }
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
            if (interfaceC1891350zJl != null && (c20600815jK = I5().LLJILJIL) != null) {
                C20600815jK.LJIIL(c20600815jK, interfaceC1891350zJl);
            }
        }
        C1839820xye.LIZ().LJIIIZ(1);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLL = (TuxIconView) this.itemView.findViewById(R.id.eeo);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.eeq);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.eep);
        TuxIconView tuxIconView = this.LLILLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS155S0100000_21(this, 46));
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS155S0100000_21(this, 47));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1839820xye.LIZ().LJIIIZ(1);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        EnumC586200Myw enumC586200Myw;
        EnumC586200Myw enumC586200Myw2;
        String string;
        String string2;
        super.onBindItemView(interfaceC1891350zJl);
        C1344400l5a item = getItem();
        String string3 = null;
        if (item != null) {
            enumC586200Myw = item.LLILZ;
        } else {
            enumC586200Myw = null;
        }
        if (enumC586200Myw == EnumC586200Myw.AUTO_TRANSLATION_ON) {
            TuxTextView tuxTextView = this.LLILZIL;
            if (tuxTextView != null) {
                Context context = getContext();
                if (context != null) {
                    string2 = context.getString(2131838818);
                } else {
                    string2 = null;
                }
                tuxTextView.setText(string2);
            }
            TuxTextView tuxTextView2 = this.LLILZ;
            if (tuxTextView2 != null) {
                Context context2 = getContext();
                if (context2 != null) {
                    string3 = context2.getString(2131838816);
                }
                tuxTextView2.setText(string3);
            }
        } else {
            C1344400l5a item2 = getItem();
            if (item2 != null) {
                enumC586200Myw2 = item2.LLILZ;
            } else {
                enumC586200Myw2 = null;
            }
            if (enumC586200Myw2 == EnumC586200Myw.AUTO_TRANSLATION_OFF) {
                TuxTextView tuxTextView3 = this.LLILZIL;
                if (tuxTextView3 != null) {
                    Context context3 = getContext();
                    if (context3 != null) {
                        string = context3.getString(2131838817);
                    } else {
                        string = null;
                    }
                    tuxTextView3.setText(string);
                }
                TuxTextView tuxTextView4 = this.LLILZ;
                if (tuxTextView4 != null) {
                    Context context4 = getContext();
                    if (context4 != null) {
                        string3 = context4.getString(2131838816);
                    }
                    tuxTextView4.setText(string3);
                }
            }
        }
        C1344400l5a item3 = getItem();
        if (item3 != null && item3.LLILLL) {
            C426750GoL.LJIIIZ(this.itemView, null, null, null, Integer.valueOf(C0HD5.LIZ(this.itemView, 4)), false, 23);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.a58, viewGroup, false);
    }
}
