package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C07MW;
import X.C0H1U;
import X.C0I7D;
import X.C0NOH;
import X.C0NOI;
import X.C0NOL;
import X.C1252710ihh;
import X.C12ES;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1730290v7z;
import X.C1730670v8b;
import X.C1730750v8j;
import X.C1731050v9D;
import X.C1731260v9Y;
import X.C19719912Dl;
import X.C2095008Iq;
import X.C2217381BqS;
import X.C290160BYw;
import X.C428440Gr4;
import X.C520040KaQ;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1728430v4z;
import X.InterfaceC1730790v8n;
import X.InterfaceC2217461Bqa;
import X.InterfaceC459810I1j;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.LiveGiveawayTemplateEditViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AFwS310S0000000_24;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS675S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class LiveGiveawayTemplateEditAssem extends UISlotAssem implements InterfaceC1728430v4z, InterfaceC459810I1j {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public C428440Gr4 LLJJI;
    public C0I7D LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public SmartImageView LLJJIJIL;
    public final C1559260qg8 LLJJJ = new C1559260qg8(new C723590SZx(this, C1730750v8j.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJJJIL;
    public InterfaceC1730790v8n LLJJJJ;
    public FixedKeyboardMonitor LLJJJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveGiveawayTemplateEditAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/influencer/ecommercelive/common/business/effect2/viewmodel/LiveGiveawayTemplateEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJL = 8;
    }

    public LiveGiveawayTemplateEditAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveGiveawayTemplateEditViewModel.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 696), AFwS268S0000000_26.get$arr$(355), null, true);
    }

    private final void up() {
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v8e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730690v8d) obj).LLILLJJLI;
            }
        }, null, AFwS310S0000000_24.get$arr$(28), 6);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0v8f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1730690v8d) obj).LLILLL;
            }
        }, null, new AwS638S0100000_24(this, 51), 6);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.bup;
    }

    @Override // X.InterfaceC1728430v4z, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // X.InterfaceC459810I1j
    public void V3() {
    }

    public final InterfaceC1730790v8n hp() {
        InterfaceC1730790v8n interfaceC1730790v8n = this.LLJJJJ;
        if (interfaceC1730790v8n != null) {
            return interfaceC1730790v8n;
        }
        InterfaceC1730790v8n interfaceC1730790v8n2 = null;
        try {
            interfaceC1730790v8n2 = (InterfaceC1730790v8n) C1252710ihh.LIZIZ(this, C13LE.LIZ(InterfaceC1730790v8n.class), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLJJJJ = interfaceC1730790v8n2;
        return interfaceC1730790v8n2;
    }

    public final C0I7D ip() {
        View viewFindViewById = this.LLJJIII;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hcc) : null;
            this.LLJJIII = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final C428440Gr4 kp() {
        View viewFindViewById = this.LLJJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i24) : null;
            this.LLJJI = (C428440Gr4) viewFindViewById;
        }
        return (C428440Gr4) viewFindViewById;
    }

    public final C1730750v8j lp() {
        return (C1730750v8j) this.LLJJJ.getValue();
    }

    public final SmartImageView mp() {
        View viewFindViewById = this.LLJJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.l6h) : null;
            this.LLJJIJIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxTextView op() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z23) : null;
            this.LLJJIJIIJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView sp() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z4j) : null;
            this.LLJJIJI = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final LiveGiveawayTemplateEditViewModel tp() {
        AssemVMLazy assemVMLazy = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJLIIL;
        return (LiveGiveawayTemplateEditViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[PHI: r3
      0x0050: PHI (r3v9 java.lang.String) = (r3v5 java.lang.String), (r3v10 java.lang.String) binds: [B:18:0x004e, B:16:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[PHI: r3 r7
      0x0059: PHI (r3v8 java.lang.String) = (r3v5 java.lang.String), (r3v9 java.lang.String) binds: [B:18:0x004e, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r7v4 java.lang.String) = (r7v1 java.lang.String), (r7v5 java.lang.String) binds: [B:18:0x004e, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[PHI: r1 r3 r7
      0x00c5: PHI (r1v6 java.lang.String) = (r1v8 java.lang.String), (r1v9 java.lang.String) binds: [B:25:0x005b, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r3v6 java.lang.String) = (r3v8 java.lang.String), (r3v9 java.lang.String) binds: [B:25:0x005b, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]
      0x00c5: PHI (r7v2 java.lang.String) = (r7v4 java.lang.String), (r7v5 java.lang.String) binds: [B:25:0x005b, B:23:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1728430v4z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem Ul() {
        /*
            r20 = this;
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.LiveGiveawayTemplateEditViewModel r2 = r20.tp()
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem r11 = r2.LL
            X.002o r6 = r2.getState()
            X.0v8d r6 = (X.C1730690v8d) r6
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField> r0 = r11.fieldList
            r13.addAll(r0)
            java.util.Iterator r3 = r13.iterator()
            r5 = 0
            r10 = 0
        L1c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField) r0
            java.lang.String r1 = r0.fieldName
            java.lang.String r0 = "product_image"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L36
            int r10 = r10 + 1
            goto L1c
        L35:
            r10 = -1
        L36:
            r4 = 0
            if (r10 < 0) goto L65
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField> r0 = r11.fieldList
            java.lang.Object r9 = X.C13LP.LJJJLZIJ(r10, r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r9 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField) r9
            if (r9 == 0) goto L65
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateFieldProduct r8 = r6.LL
            java.lang.String r7 = ""
            if (r8 == 0) goto L4d
            java.lang.String r3 = r8.productId
            if (r3 != 0) goto L50
        L4d:
            r3 = r7
            if (r8 == 0) goto L59
        L50:
            java.lang.String r0 = r8.productImage
            if (r0 == 0) goto L55
            r7 = r0
        L55:
            java.lang.String r1 = r8.productIndex
            if (r1 != 0) goto Lc5
        L59:
            java.lang.String r1 = "0"
            if (r8 != 0) goto Lc5
            r0 = r4
        L5e:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r0 = X.C1730900v8y.LIZ(r9, r3, r7, r1, r0)
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r13, r10, r0)
        L65:
            java.util.Iterator r7 = r13.iterator()
            r3 = 0
        L6a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r7.next()
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r0 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField) r0
            java.lang.String r1 = r0.fieldName
            java.lang.String r0 = "customize_text"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto Lc2
            if (r3 < 0) goto L95
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField> r0 = r11.fieldList
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r3, r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField) r1
            if (r1 == 0) goto L95
            java.lang.String r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateField r0 = X.C1730900v8y.LIZJ(r1, r0)
            com.bytedance.mt.protector.impl.collections.ListProtector.set(r13, r3, r0)
        L95:
            r12 = 0
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo r3 = new com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo
            java.lang.Integer r0 = r6.LLILLL
            if (r0 == 0) goto La0
            int r5 = r0.intValue()
        La0:
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem r0 = r2.LL
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardGiveawayInfo r2 = r0.giveawayInfo
            if (r2 == 0) goto Lbf
            java.lang.String r1 = r2.activityId
            java.lang.String r0 = r2.startTime
            java.lang.String r4 = r2.openTime
        Lac:
            r3.<init>(r5, r1, r0, r4)
            r14 = 0
            r19 = 253823(0x3df7f, float:3.55682E-40)
            r15 = r14
            r16 = r3
            r17 = r14
            r18 = r12
            com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.LiveGiveawayTemplateItem.LIZ(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        Lbf:
            r1 = r4
            r0 = r4
            goto Lac
        Lc2:
            int r3 = r3 + 1
            goto L6a
        Lc5:
            java.lang.String r0 = r8.productName
            goto L5e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.assem.LiveGiveawayTemplateEditAssem.Ul():com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem");
    }

    @Override // X.InterfaceC1728430v4z
    public ViewGroup jE() {
        return kp();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LLJJJJJIL;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
        LiveGiveawayTemplateEditViewModel liveGiveawayTemplateEditViewModelTp = tp();
        C0NOH c0noh = liveGiveawayTemplateEditViewModelTp.LLILLJJLI;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
        liveGiveawayTemplateEditViewModelTp.LLILLJJLI = null;
    }

    @Override // X.InterfaceC459810I1j
    public void ub() {
        C1731050v9D.LIZ(ip());
    }

    public final void Ap(SmartImageView smartImageView) {
        this.LLJJIJIL = smartImageView;
    }

    public final void Bp(TuxTextView tuxTextView) {
        this.LLJJIJIIJIL = tuxTextView;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public Context Eo(Context context) {
        Fragment fragmentLJI;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Context contextLJIIIIZZ;
        if ((C290160BYw.LIZ() || C07MW.LIZ()) && (fragmentLJI = C724240Sb0.LJI(this)) != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        return context;
    }

    public final void Ep(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }

    public final void Fp(Integer num) {
        TemplateField next;
        TemplateFieldData templateFieldData;
        TemplateFieldProduct templateFieldProduct;
        String str;
        TemplateItem templateItem = lp().LL;
        C1730290v7z.LIZ.getClass();
        String strLIZIZ = C1730290v7z.LIZIZ(templateItem, num);
        if (strLIZIZ != null) {
            op().setText(strLIZIZ);
            TuxTextView tuxTextViewOp = op();
            if (num != null && num.intValue() == 2) {
                if (tuxTextViewOp != null) {
                    tuxTextViewOp.setTextColorRes(R.attr.vv);
                }
            } else if (tuxTextViewOp != null) {
                tuxTextViewOp.setTextColorRes(R.attr.a1k);
            }
            C12ES.LJIILL(0, op());
        } else {
            C0H1U.LIZIZ(op());
        }
        if (num != null && num.intValue() == 2 && mp() != null) {
            Iterator<TemplateField> it2 = templateItem.T5().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.fieldName, "giveaway_click_image")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TemplateField templateField = next;
            if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldProduct = templateFieldData.fieldProduct) != null && (str = templateFieldProduct.productImage) != null) {
                C12ES.LJIILL(0, mp());
                C1326790kdB.LIZ.getClass();
                C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
                c1331670kl3LIZLLL.LJJ(mp());
                C786410Ut5.h3(c1331670kl3LIZLLL);
                return;
            }
            return;
        }
        SmartImageView smartImageViewMp = mp();
        if (smartImageViewMp == null) {
            return;
        }
        C0H1U.LIZIZ(smartImageViewMp);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        Long lLJIILIIL;
        Long lLJIILIIL2;
        C0NOI c0noiLIZ;
        super.onViewCreated(view);
        if (!(lp().LL instanceof LiveGiveawayTemplateItem)) {
            return;
        }
        LiveGiveawayTemplateItem liveGiveawayTemplateItem = (LiveGiveawayTemplateItem) lp().LL;
        new C1731260v9Y(kp()).LIZ(liveGiveawayTemplateItem);
        LiveGiveawayTemplateEditViewModel liveGiveawayTemplateEditViewModelTp = tp();
        long j = lp().LLILLJJLI;
        long j2 = lp().LLILLL;
        liveGiveawayTemplateEditViewModelTp.LL = liveGiveawayTemplateItem;
        liveGiveawayTemplateEditViewModelTp.LLILLL = j2;
        liveGiveawayTemplateEditViewModelTp.LLILZ = j;
        liveGiveawayTemplateEditViewModelTp.setState(new AwS605S0100000_26(liveGiveawayTemplateItem, 621));
        BillboardGiveawayInfo billboardGiveawayInfo = liveGiveawayTemplateItem.giveawayInfo;
        C0NOH c0noh = liveGiveawayTemplateEditViewModelTp.LLILLJJLI;
        if (c0noh != null) {
            c0noh.LIZJ();
        }
        TemplateField templateField = null;
        liveGiveawayTemplateEditViewModelTp.LLILLJJLI = null;
        if (billboardGiveawayInfo != null && billboardGiveawayInfo.activityStatus != 3) {
            String str = billboardGiveawayInfo.startTime;
            if (str != null) {
                lLJIILIIL = C2095008Iq.LJIILIIL(str);
            } else {
                lLJIILIIL = null;
            }
            String str2 = billboardGiveawayInfo.openTime;
            if (str2 != null) {
                lLJIILIIL2 = C2095008Iq.LJIILIIL(str2);
            } else {
                lLJIILIIL2 = null;
            }
            if (lLJIILIIL != null && lLJIILIIL2 != null && (c0noiLIZ = C0NOL.LIZ(lLJIILIIL.longValue(), lLJIILIIL2.longValue(), liveGiveawayTemplateEditViewModelTp.LLILZ, liveGiveawayTemplateEditViewModelTp.LLILLL)) != null) {
                C0NOH c0noh2 = new C0NOH();
                liveGiveawayTemplateEditViewModelTp.LLILLJJLI = c0noh2;
                c0noh2.LIZ(new AwS675S0100000_26(liveGiveawayTemplateEditViewModelTp, 30));
                C0NOH c0noh3 = liveGiveawayTemplateEditViewModelTp.LLILLJJLI;
                if (c0noh3 != null) {
                    c0noh3.LIZLLL(c0noiLIZ);
                }
                C0NOH c0noh4 = liveGiveawayTemplateEditViewModelTp.LLILLJJLI;
                if (c0noh4 != null) {
                    liveGiveawayTemplateEditViewModelTp.setState(new AwS38S0001000_26(c0noh4.LIZJ, 5));
                }
                C0NOH c0noh5 = liveGiveawayTemplateEditViewModelTp.LLILLJJLI;
                if (c0noh5 != null) {
                    C0NOH.LJ(c0noh5);
                }
            }
        }
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LLJJJJJIL = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        Iterator<TemplateField> it2 = liveGiveawayTemplateItem.fieldList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            TemplateField next = it2.next();
            if (Intrinsics.LJFF(next.fieldName, "customize_text")) {
                templateField = next;
                break;
            }
        }
        TemplateField templateField2 = templateField;
        if (templateField2 != null && (templateFieldData = templateField2.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ip().setText(templateFieldText.content);
            ip().setHint(templateFieldText.defaultContent);
            ip().setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
        }
        ip().addTextChangedListener(new C1730670v8b() { // from class: X.0v8c
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String string;
                InterfaceC1730790v8n interfaceC1730790v8nHp;
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                LiveGiveawayTemplateEditViewModel liveGiveawayTemplateEditViewModelTp2 = this.LL.tp();
                liveGiveawayTemplateEditViewModelTp2.getClass();
                liveGiveawayTemplateEditViewModelTp2.setState(new AwS76S1000000_26(string, 29));
                if (string.length() == 0) {
                    C0H1U.LIZIZ(this.LL.sp());
                    this.LL.sp().setText("");
                } else {
                    C12ES.LJIILL(0, this.LL.sp());
                    TuxTextView tuxTextViewSp = this.LL.sp();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(string.length());
                    sbLIZ.append('/');
                    sbLIZ.append(((InputFilter.LengthFilter) this.LL.ip().getFilters()[0]).getMax());
                    tuxTextViewSp.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
                C1730290v7z c1730290v7z = C1730290v7z.LIZ;
                Integer num = this.LL.tp().getState().LLILLL;
                c1730290v7z.getClass();
                if (((num != null && num.intValue() != 0 && num.intValue() != 3) || this.LL.lp().LLILZ) && (interfaceC1730790v8nHp = this.LL.hp()) != null) {
                    interfaceC1730790v8nHp.SK();
                }
            }
        });
        C1731050v9D.LIZIZ(ip());
        up();
    }

    public final void yp(C0I7D c0i7d) {
        this.LLJJIII = c0i7d;
    }

    public final void zp(C428440Gr4 c428440Gr4) {
        this.LLJJI = c428440Gr4;
    }
}
