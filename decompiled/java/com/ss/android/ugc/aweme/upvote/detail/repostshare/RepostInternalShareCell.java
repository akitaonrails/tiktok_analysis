package com.ss.android.ugc.aweme.upvote.detail.repostshare;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0I0B;
import X.C0ZE7;
import X.C123100dR;
import X.C1355570lNb;
import X.C1356430lOz;
import X.C1363150lZp;
import X.C1370970lmR;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1388190mED;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C897520ZIw;
import X.C946803n0;
import X.EnumC1910440zoY;
import X.InterfaceC1356370lOt;
import X.InterfaceC1356390lOv;
import X.InterfaceC1356400lOw;
import X.InterfaceC1362600lYw;
import X.InterfaceC1363370laB;
import X.InterfaceC1364710lcL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.service.analytics.ILogger;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS701S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostInternalShareCell extends PowerCell<C1355570lNb> implements InterfaceC1356390lOv, InterfaceC1363370laB, IRepostInternalShareAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LL;
    public InterfaceC1356370lOt LLILLJJLI;
    public InterfaceC1356390lOv LLILLL;
    public SharePackage LLILZ;
    public final C01GW LLILZIL;
    public InterfaceC1356400lOw LLILZLL;
    public RecyclerView LLIZ;
    public TuxIconView LLIZLLLIL;
    public final C01GW LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostInternalShareCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/upvote/detail/repostshare/ShareRepostViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.i6g;
    }

    public RepostInternalShareCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareRepostViewModel.class);
        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(c19719912DlLIZ, 1047);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(272);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1031), awS565S0100000_21, AFwS209S0000000_21.get$arr$(376), new AwS565S0100000_21((C03K6) this, 1033), new AwS565S0100000_21((C03K6) this, 1035), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1037), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 1039), null, new AwS565S0100000_21((C03K6) this, 1040));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS565S0100000_21 awS565S0100000_212 = new AwS565S0100000_21((C03K6) this, 1034);
            AwS565S0100000_21 awS565S0100000_213 = new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1036);
            AwS565S0100000_21 awS565S0100000_214 = new AwS565S0100000_21(c19719912DlLIZ, 1038);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS422S0200000_21((InterfaceC451590HnJ) obj, awS565S0100000_212, 69));
            AwS565S0100000_21 awS565S0100000_215 = new AwS565S0100000_21(c01gwLIZIZ, 1041);
            AwS565S0100000_21 awS565S0100000_216 = new AwS565S0100000_21(c01gwLIZIZ, 1042);
            AwS565S0100000_21 awS565S0100000_217 = new AwS565S0100000_21(c01gwLIZIZ, 1043);
            AwS565S0100000_21 awS565S0100000_218 = new AwS565S0100000_21(c01gwLIZIZ, 1044);
            AwS565S0100000_21 awS565S0100000_219 = new AwS565S0100000_21(c01gwLIZIZ, 1045);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS565S0100000_214, awS565S0100000_21, new C452080Ho6(), awS565S0100000_215, awS565S0100000_216, awS565S0100000_213, aFwS259S0000000_21, awS565S0100000_217, awS565S0100000_218, awS565S0100000_219);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1046), awS565S0100000_21, AFwS209S0000000_21.get$arr$(377), new AwS565S0100000_21((C03K6) this, 1048), new AwS565S0100000_21((C03K6) this, 1049), new AwS565S0100000_21((HasDefaultViewModelProviderFactory) this, 1050), aFwS259S0000000_21, new AwS565S0100000_21((C03K6) this, 1051), null, new AwS565S0100000_21((C03K6) this, 1052));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS565S0100000_21(c19719912DlLIZ, 1053), awS565S0100000_21, AFwS209S0000000_21.get$arr$(378), new AwS565S0100000_21((C03K6) this, 1054), new AwS565S0100000_21((C03K6) this, 1055), new AwS565S0100000_21((C03K6) this, 1029), aFwS259S0000000_21, null, null, new AwS565S0100000_21((C03K6) this, 1030));
        }
        this.LL = assemVMLazy;
        this.LLILZIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(375));
        this.LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1032));
    }

    public final ShareRepostViewModel I5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (ShareRepostViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.repostshare.IRepostInternalShareAbility
    public final void UB1() {
        InterfaceC1356400lOw interfaceC1356400lOw = this.LLILZLL;
        if (interfaceC1356400lOw != null) {
            interfaceC1356400lOw.refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.repostshare.IRepostInternalShareAbility
    public final Pair<C1371590lnR, InterfaceC1362600lYw> Z2() {
        SharePackage sharePackage = this.LLILZ;
        if (sharePackage == null) {
            return null;
        }
        C1371600lnS c1371600lnS = new C1371600lnS();
        c1371600lnS.LJJIIJ = sharePackage;
        return new Pair<>(new C1371590lnR(c1371600lnS), this.LLJ.getValue());
    }

    @Override // X.InterfaceC1363370laB
    public final C0ZE7 getActivityStatusParams() {
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(EnumC1910440zoY.SHARE_PANEL);
        c0ze7.LIZLLL = I5().LL;
        return c0ze7;
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.repostshare.IRepostInternalShareAbility
    public final long getHeight() {
        return this.itemView.getHeight();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLIZ = (RecyclerView) this.itemView.findViewById(R.id.t_u);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.t_s);
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        TuxIconView tuxIconView = this.LLIZLLLIL;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AbS701S0100000_21(this, 15, 42), tuxIconView);
        }
        View viewFindViewById = this.itemView.findViewById(R.id.t_x);
        C786410Ut5.I7(new ACListenerS155S0100000_21(viewFindViewById, 100), viewFindViewById);
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLIZ, null), this, IRepostInternalShareAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.repostshare.IRepostInternalShareAbility
    public final View Va() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        C897520ZIw c897520ZIw = (C897520ZIw) this.LLILZIL.getValue();
        if (c897520ZIw != null) {
            c897520ZIw.LJIIJJI(new C1356430lOz(list, null));
        }
        if (list.size() > 15) {
            list = list.subList(0, 15);
        }
        InterfaceC1356400lOw interfaceC1356400lOw = this.LLILZLL;
        if (interfaceC1356400lOw != null) {
            this.itemView.getContext();
            interfaceC1356400lOw.LLJILJILJ(this, list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[PHI: r10
      0x0081: PHI (r10v8 X.0lao) = (r10v11 X.0lao), (r10v12 X.0lao), (r10v18 X.0lao) binds: [B:7:0x0049, B:9:0x004d, B:19:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.19ry] */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.0lbv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0lOw] */
    /* JADX WARN: Type inference failed for: r21v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0lcL] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r23) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.repostshare.RepostInternalShareCell.onBindItemView(X.0zJl):void");
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
        I5().setStateImmediate(new AwS32S0010000_18(true, 9));
        InterfaceC1356390lOv interfaceC1356390lOv = this.LLILLL;
        if (interfaceC1356390lOv != null) {
            interfaceC1356390lOv.Pu0(list, list2);
        }
        InterfaceC1356400lOw interfaceC1356400lOw = this.LLILZLL;
        if (interfaceC1356400lOw != null) {
            interfaceC1356400lOw.LJLL(this.LLIZ, list);
        }
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean eJ2(IMContact iMContact, boolean z) {
        Set<IMContact> setLIZIZ;
        Set<IMContact> setLIZIZ2;
        Set<IMContact> setLIZIZ3;
        SharePackage sharePackage;
        String strLJ;
        SharePackage sharePackage2;
        Bundle bundle;
        Boolean boolValueOf = null;
        Set<IMContact> setLIZIZ4 = null;
        boolValueOf = null;
        if (iMContact instanceof C1363150lZp) {
            I5().vQ2();
            Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
            if (activityLIZ != null && (sharePackage = this.LLILZ) != null) {
                C786410Ut5.LJJJI("cancel_toast", "false", sharePackage.extras);
                InterfaceC1356370lOt interfaceC1356370lOt = this.LLILLJJLI;
                if (interfaceC1356370lOt != null && (strLJ = interfaceC1356370lOt.LJ()) != null && C123100dR.LIZ(strLJ) && (sharePackage2 = this.LLILZ) != null && (bundle = sharePackage2.extras) != null) {
                    C786410Ut5.LJJJI("default_edit_text_msg", strLJ, bundle);
                }
                IInternalShareApi.LIZ.getClass();
                InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
                InterfaceC1356370lOt interfaceC1356370lOt2 = this.LLILLJJLI;
                if (interfaceC1356370lOt2 != null) {
                    setLIZIZ4 = interfaceC1356370lOt2.LIZIZ();
                }
                C946803n0.LIZ(this.itemView);
                interfaceC1364710lcLLIZIZ.LJFF(activityLIZ, sharePackage, null, setLIZIZ4, false, null, false, null, false, true, null, false, true, null);
                ILogger iLogger = (ILogger) PluggableExtentionKt.pluggableSpi$default(ILogger.class, false, false, false, 14, null);
                if (iLogger != null) {
                    iLogger.LJ(sharePackage, "long_press", C0I0B.LJFF.LIZIZ());
                }
            }
            return false;
        }
        InterfaceC1356390lOv interfaceC1356390lOv = this.LLILLL;
        if (interfaceC1356390lOv != null && !interfaceC1356390lOv.dE(iMContact, z, C946803n0.LIZ(this.itemView))) {
            return false;
        }
        if (z) {
            InterfaceC1356370lOt interfaceC1356370lOt3 = this.LLILLJJLI;
            if (interfaceC1356370lOt3 != null) {
                setLIZIZ3 = interfaceC1356370lOt3.LIZIZ();
            } else {
                setLIZIZ3 = null;
            }
            if (C19719512Dh.LJIIIIZZ(setLIZIZ3) && setLIZIZ3 != null) {
                setLIZIZ3.add(iMContact);
            }
        } else {
            InterfaceC1356370lOt interfaceC1356370lOt4 = this.LLILLJJLI;
            if (interfaceC1356370lOt4 != null) {
                setLIZIZ = interfaceC1356370lOt4.LIZIZ();
            } else {
                setLIZIZ = null;
            }
            if (C19719512Dh.LJIIIIZZ(setLIZIZ) && setLIZIZ != null) {
                setLIZIZ.remove(iMContact);
            }
        }
        InterfaceC1356370lOt interfaceC1356370lOt5 = this.LLILLJJLI;
        if (interfaceC1356370lOt5 != null && (setLIZIZ2 = interfaceC1356370lOt5.LIZIZ()) != null) {
            boolValueOf = Boolean.valueOf(!setLIZIZ2.isEmpty());
        }
        I5().setStateImmediate(new AwS32S0010000_18(Intrinsics.LJFF(boolValueOf, Boolean.TRUE), 9));
        InterfaceC1356390lOv interfaceC1356390lOv2 = this.LLILLL;
        if (interfaceC1356390lOv2 != null) {
            interfaceC1356390lOv2.eJ2(iMContact, z);
            return true;
        }
        return true;
    }
}
