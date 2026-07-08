package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C01GW;
import X.C03H5;
import X.C0OOV;
import X.C0OPX;
import X.C0OQK;
import X.C0OS2;
import X.C0OS8;
import X.C0OT1;
import X.C0OV6;
import X.C0OVA;
import X.C0ZP4;
import X.C1196320hEk;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C123100dR;
import X.C1383370m6R;
import X.C13LP;
import X.C1537720q7O;
import X.C1558420qem;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19ME;
import X.C21568919b5;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C293310Beb;
import X.C418440Gaw;
import X.C452501pT;
import X.C619600ORy;
import X.C619650OSd;
import X.C619660OSe;
import X.C621530OZj;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC046500Et;
import X.InterfaceC0148002o;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC619690OSh;
import X.InterfaceC619700OSi;
import X.InterfaceC621520OZi;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCellVmHolder;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinHybridAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridCardConfigStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinHybridMessageCardCell extends BulletinBaseCell<C0OOV> implements InterfaceC724530SbT {
    public InterfaceC619690OSh LLJLLL;
    public InterfaceC619700OSi LLJZ;
    public boolean LLJZIJLIL;
    public Integer LLL;
    public final C619650OSd LLLF = new InterfaceC621520OZi() { // from class: X.0OSd
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.InterfaceC621520OZi
        public final void LIZ() {
            BulletinCardInfo bulletinCardInfo;
            C0OOV c0oov = (C0OOV) this.LIZ.getItem();
            if (c0oov == null || (bulletinCardInfo = c0oov.LLJJL) == null || !Intrinsics.LJFF(bulletinCardInfo.enableLongPressPanel, Boolean.FALSE)) {
                this.LIZ.D6();
            }
        }

        @Override // X.InterfaceC621520OZi
        public final boolean LIZIZ() {
            return this.LIZ.U6(null);
        }

        @Override // X.InterfaceC621520OZi
        public final void LIZJ() {
            this.LIZ.V5();
        }
    };
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS553S0100000_9(this, 686));

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void z6() {
        super.z6();
        C736680Sv4.LJIIIIZZ(this, i6(), new C2217381BqS() { // from class: X.0OKq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OKY) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 66), 4);
        C736680Sv4.LJIIIIZZ(this, i6(), new C2217381BqS() { // from class: X.0OSl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C0OKY) obj).LLJJIJIL);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 67), 4);
        if (To()) {
            C736680Sv4.LJIIIIZZ(this, i6(), new C2217381BqS() { // from class: X.0OKu
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OKY) obj).LLIZLLLIL;
                }
            }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 68), 4);
        }
        AssemViewModel.asyncSubscribe$default(X5(), new C2217371BqR() { // from class: X.0OSm
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OYC) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0OYC) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9(this, 191), 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fd  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C6() {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinHybridMessageCardCell.C6():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final boolean J6() {
        BulletinItemBottomStruct bulletinItemBottomStruct;
        C0OOV c0oov;
        BulletinCardInfo bulletinCardInfo;
        if (!To() || ((c0oov = (C0OOV) getItem()) != null && (bulletinCardInfo = c0oov.LLJJL) != null && Intrinsics.LJFF(bulletinCardInfo.enableViewCount, Boolean.FALSE))) {
            C0OOV c0oov2 = (C0OOV) getItem();
            if (!C123100dR.LIZ((c0oov2 == null || (bulletinItemBottomStruct = c0oov2.LLJJJJJIL) == null) ? null : bulletinItemBottomStruct.bottomTip)) {
                return false;
            }
        }
        return true;
    }

    public final InterfaceC619700OSi b7() {
        if (C0OS8.LIZIZ() && C293310Beb.LIZLLL()) {
            return null;
        }
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d09);
        return C0OS8.LIZIZ() ? new C0OS2(viewStub, this, a6(), f6(), To(), new AwS553S0100000_9(this, 687)) : new C619600ORy(viewStub, this, f6(), a6(), C1558420qem.LIZIZ(this));
    }

    public final BulletinHybridAbility h7() {
        BulletinHybridAbility bulletinHybridAbility;
        BulletinCellVmHolder bulletinCellVmHolderU6 = u6();
        return (bulletinCellVmHolderU6 == null || (bulletinHybridAbility = (BulletinHybridAbility) bulletinCellVmHolderU6.LLJILLL.getValue()) == null) ? (BulletinHybridAbility) this.LLLFF.getValue() : bulletinHybridAbility;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        InterfaceC619690OSh interfaceC619690OSh = this.LLJLLL;
        if (interfaceC619690OSh != null) {
            interfaceC619690OSh.LJIIJ();
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
        this.LLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v6() {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinHybridMessageCardCell.v6():void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final boolean U6(View view) {
        BulletinInteractionAbility bulletinInteractionAbility;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ != null && (bulletinInteractionAbility = (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null)) != null) {
            if (bulletinInteractionAbility.v20() || bulletinInteractionAbility.AK2()) {
                bulletinInteractionAbility.BM1();
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: i7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(final C0OOV c0oov) {
        Integer num;
        Object objLJIJI;
        String strLIZ;
        C621530OZj c621530OZj;
        BulletinHybridCardConfigStruct bulletinHybridCardConfigStruct;
        String str;
        C1537720q7O c1537720q7OLIZLLL;
        C21568919b5 c21568919b5R6;
        C19ME c19me;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        long jCurrentTimeMillis = System.currentTimeMillis();
        super.onBindItemView(c0oov);
        BulletinCardInfo bulletinCardInfo = c0oov.LLJJL;
        View contentContainer = null;
        if (bulletinCardInfo != null) {
            num = bulletinCardInfo.positionType;
        } else {
            num = null;
        }
        if (!Intrinsics.LJFF(this.LLL, num) && (c21568919b5R6 = r6()) != null) {
            if (C0OS8.LIZLLL()) {
                View viewFindViewById = this.itemView.findViewById(R.id.d0d);
                if (viewFindViewById != null) {
                    ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        int i = this.itemView.getResources().getDisplayMetrics().widthPixels;
                        int type = EnumC046500Et.BULLETIN_CARD_POSITION_NORMAL.getType();
                        if (num != null && num.intValue() == type) {
                            if (To()) {
                                P5((int) (i * 0.05f));
                                marginLayoutParams.setMarginEnd(0);
                                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
                            } else {
                                marginLayoutParams.setMarginEnd((int) (i * 0.05f));
                                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
                            }
                        } else {
                            int type2 = EnumC046500Et.BULLETIN_CARD_POSITION_MIDDLE.getType();
                            if (num != null && num.intValue() == type2) {
                                if (To()) {
                                    P5(0);
                                }
                                marginLayoutParams.setMarginStart(0);
                                marginLayoutParams.setMarginEnd(0);
                                C786410Ut5.W5(viewFindViewById, marginLayoutParams);
                            }
                        }
                        BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) getItem();
                        if (bulletinBaseItem != null) {
                            R5(bulletinBaseItem);
                        }
                        this.LLL = num;
                    }
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = c21568919b5R6.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                    int type3 = EnumC046500Et.BULLETIN_CARD_POSITION_NORMAL.getType();
                    if (num != null && num.intValue() == type3) {
                        c19me.startToEnd = -1;
                        c19me.startToStart = -1;
                        c19me.endToStart = -1;
                        c19me.endToEnd = -1;
                        if (To()) {
                            c19me.horizontalBias = 1.0f;
                            c19me.startToStart = R.id.der;
                            c19me.endToEnd = 0;
                        } else {
                            c19me.horizontalBias = 0.0f;
                            c19me.startToEnd = R.id.cyh;
                            c19me.endToStart = R.id.der;
                        }
                        C786410Ut5.j7(c21568919b5R6, c19me);
                    } else {
                        int type4 = EnumC046500Et.BULLETIN_CARD_POSITION_MIDDLE.getType();
                        if (num != null && num.intValue() == type4) {
                            c19me.horizontalBias = 0.5f;
                            c19me.startToEnd = -1;
                            c19me.endToStart = -1;
                            c19me.startToStart = 0;
                            c19me.endToEnd = 0;
                            C786410Ut5.j7(c21568919b5R6, c19me);
                        }
                    }
                    this.LLL = num;
                }
            }
        }
        InterfaceC619690OSh interfaceC619690OSh = this.LLJLLL;
        if (interfaceC619690OSh != null) {
            interfaceC619690OSh.LJIIL(c0oov, jCurrentTimeMillis);
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZLLL(c0oov);
        }
        View view = this.itemView;
        InterfaceC619690OSh interfaceC619690OSh2 = this.LLJLLL;
        if (interfaceC619690OSh2 != null && (c1537720q7OLIZLLL = interfaceC619690OSh2.LIZLLL()) != null) {
            objLJIJI = c1537720q7OLIZLLL.LJIJI("isReuse");
        } else {
            objLJIJI = null;
        }
        if (!(objLJIJI instanceof Boolean)) {
            objLJIJI = null;
        }
        Boolean bool = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(objLJIJI, bool);
        BulletinCardInfo bulletinCardInfo2 = c0oov.LLJJL;
        if (bulletinCardInfo2 != null && (bulletinHybridCardConfigStruct = bulletinCardInfo2.hybridConfigInfo) != null && (str = bulletinHybridCardConfigStruct.schema) != null) {
            strLIZ = C0OQK.LIZ(str);
        } else {
            strLIZ = null;
        }
        String strValueOf = String.valueOf(strLIZ);
        view.setTag(R.id.d2d, bool);
        view.setTag(R.id.d2e, Boolean.valueOf(zLJFF));
        view.setTag(R.id.d2c, strValueOf);
        if (!C0OS8.LIZJ()) {
            InterfaceC619690OSh interfaceC619690OSh3 = this.LLJLLL;
            if (interfaceC619690OSh3 != null) {
                contentContainer = interfaceC619690OSh3.getContentContainer();
            }
            if ((contentContainer instanceof C621530OZj) && (c621530OZj = (C621530OZj) contentContainer) != null) {
                c621530OZj.setCallback(new InterfaceC621520OZi() { // from class: X.0OSg
                    @Override // X.InterfaceC621520OZi
                    public final void LIZ() {
                        BulletinCardInfo bulletinCardInfo3 = c0oov.LLJJL;
                        if (bulletinCardInfo3 == null || !Intrinsics.LJFF(bulletinCardInfo3.enableLongPressPanel, Boolean.FALSE)) {
                            this.LIZ.D6();
                        }
                    }

                    @Override // X.InterfaceC621520OZi
                    public final boolean LIZIZ() {
                        return this.LIZ.U6(null);
                    }

                    @Override // X.InterfaceC621520OZi
                    public final void LIZJ() {
                        this.LIZ.V5();
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /* JADX INFO: renamed from: a7, reason: merged with bridge method [inline-methods] */
    public final void N5(C0OVA c0ova, C0OOV c0oov) {
        BulletinCardInfo bulletinCardInfo;
        C0OOV c0oov2 = (C0OOV) getItem();
        if (c0oov2 != null && (bulletinCardInfo = c0oov2.LLJJL) != null) {
            Integer num = bulletinCardInfo.positionType;
            int type = EnumC046500Et.BULLETIN_CARD_POSITION_MIDDLE.getType();
            if (num != null && num.intValue() == type) {
                return;
            }
        }
        C21568919b5 c21568919b5R6 = r6();
        if (c21568919b5R6 != null) {
            C0OV6 c0ov6 = c0ova.LIZ;
            if (c0ov6 != null) {
                c21568919b5R6.setRoundingParams(c0ov6);
            }
            C0OT1 c0ot1 = c0ova.LIZJ;
            if (c0ot1 != null) {
                c21568919b5R6.setBackgroundColor(c0ot1.LIZ);
            }
            ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1383370m6R.LJI(c21568919b5R6);
            if (To()) {
                if (marginLayoutParamsLJI != null) {
                    marginLayoutParamsLJI.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                }
            } else if (marginLayoutParamsLJI != null) {
                marginLayoutParamsLJI.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
            }
            C786410Ut5.j7(c21568919b5R6, marginLayoutParamsLJI);
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LJI(c0oov);
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: j7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0OOV c0oov, List<? extends Object> list) {
        InterfaceC619700OSi interfaceC619700OSi;
        InterfaceC619690OSh interfaceC619690OSh;
        super.onBindItemView(c0oov, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C619660OSe)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("payloads bind diff:");
        sbLIZ.append(objLJJJLZIJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C619660OSe c619660OSe = (C619660OSe) objLJJJLZIJ;
        if (c619660OSe.LIZ && (interfaceC619690OSh = this.LLJLLL) != null) {
            interfaceC619690OSh.LJI(c0oov);
        }
        if (c619660OSe.LJIIIZ && (interfaceC619700OSi = this.LLJZ) != null) {
            interfaceC619700OSi.LIZLLL(c0oov);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(X.C0OOV r7, boolean r8) {
        /*
            r6 = this;
            boolean r0 = r6.To()
            if (r0 == 0) goto L7e
            android.view.View r0 = r6.itemView
            android.content.Context r2 = r0.getContext()
            boolean r1 = r7.LLJILJILJ
            boolean r0 = X.C444960Hcc.LIZIZ()
            X.0OVA r3 = X.C0OV7.LIZIZ(r2, r1, r0)
        L16:
            if (r8 == 0) goto L1c
            r6.N5(r3, r7)
        L1b:
            return
        L1c:
            X.0zJl r0 = r6.getItem()
            X.0OOV r0 = (X.C0OOV) r0
            if (r0 == 0) goto L79
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCardInfo r0 = r0.LLJJL
            if (r0 == 0) goto L79
            java.lang.Integer r2 = r0.positionType
            X.00Et r0 = X.EnumC046500Et.BULLETIN_CARD_POSITION_MIDDLE
            int r1 = r0.getType()
            if (r2 == 0) goto L79
            int r0 = r2.intValue()
            if (r0 != r1) goto L79
            X.0OV6 r4 = new X.0OV6
            r5 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            float r3 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            float r2 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            float r1 = X.C418440Gaw.LIZIZ(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            r4.<init>(r3, r2, r1, r0)
        L5f:
            X.0OSh r0 = r6.LLJLLL
            if (r0 == 0) goto L1b
            android.view.View r2 = r0.getContentContainer()
            if (r2 == 0) goto L1b
            android.view.View r0 = r6.itemView
            android.content.Context r1 = r0.getContext()
            boolean r0 = r7.LLJILLL
            X.1DQb r0 = X.C0OV7.LIZJ(r1, r4, r0)
            r2.setBackground(r0)
            return
        L79:
            X.0OV6 r4 = r3.LIZ
            if (r4 != 0) goto L5f
            return
        L7e:
            android.view.View r0 = r6.itemView
            android.content.Context r2 = r0.getContext()
            boolean r1 = r7.LLJILJILJ
            boolean r0 = X.C444960Hcc.LIZIZ()
            X.0OVA r3 = X.C0OV7.LIZ(r2, r1, r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinHybridMessageCardCell.k7(X.0OOV, boolean):void");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
