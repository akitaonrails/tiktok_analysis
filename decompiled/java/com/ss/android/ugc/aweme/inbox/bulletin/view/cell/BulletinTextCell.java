package com.ss.android.ugc.aweme.inbox.bulletin.view.cell;

import X.C0OOP;
import X.C0OPX;
import X.C0OS2;
import X.C0OS7;
import X.C0OS8;
import X.C0OTJ;
import X.C0OVA;
import X.C1196320hEk;
import X.C11JF;
import X.C13LP;
import X.C1558420qem;
import X.C1558520qew;
import X.C21568519b1;
import X.C21568919b5;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C286660BLk;
import X.C293310Beb;
import X.C382201e8;
import X.C418440Gaw;
import X.C619600ORy;
import X.C619630OSb;
import X.C619660OSe;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogC1389620mGW;
import X.InterfaceC619700OSi;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommentAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinInteractionAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinTextCell extends BulletinBaseCell<C0OOP> {
    public C0OS7 LLJLLL;
    public InterfaceC619700OSi LLJZ;
    public boolean LLJZIJLIL;
    public C619630OSb LLL;
    public String LLLF;

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void z6() {
        super.z6();
        AssemViewModel.asyncSubscribe$default(X5(), new C2217371BqR() { // from class: X.0OSo
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0OYC) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C0OYC) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, this, C736820SvI.LIZLLL(), null, null, new AwS588S0100000_9(this, 197), 24, null);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void C6() {
        super.C6();
        if (this.LLJLLL == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d0c);
            BulletinListViewModel bulletinListViewModelF6 = f6();
            boolean zTo = To();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
            this.LLJLLL = new C0OS7(viewStub, bulletinListViewModelF6, zTo, interfaceC665370Q7zLIZ != null ? (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null) : null, a6());
            w6();
        }
        if (!this.LLJZIJLIL) {
            this.LLJZIJLIL = true;
            InterfaceC619700OSi interfaceC619700OSiB7 = b7();
            this.LLJZ = interfaceC619700OSiB7;
            if (interfaceC619700OSiB7 != null) {
                T6(this.itemView.findViewById(R.id.d09));
            }
            C1558520qew.LJII(C1558420qem.LIZIZ(this), this, BulletinCommentAbility.class, null, null);
        }
        if (this.LLL == null) {
            this.LLL = new C619630OSb((ViewStub) this.itemView.findViewById(R.id.d3i), f6(), e6(), a6(), f6().getAssemVMScope());
        }
    }

    public final InterfaceC619700OSi b7() {
        if (C0OS8.LIZIZ() && C293310Beb.LIZLLL()) {
            return null;
        }
        ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d09);
        return C0OS8.LIZIZ() ? new C0OS2(viewStub, this, a6(), f6(), To(), new AwS553S0100000_9(this, 770)) : new C619600ORy(viewStub, this, f6(), a6(), C1558420qem.LIZIZ(this));
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        super.onDestroy();
        C0OS7 c0os7 = this.LLJLLL;
        if (c0os7 != null) {
            C786410Ut5.LJIIJ((DialogC1389620mGW) c0os7.LJIILIIL.getValue());
            C11JF c11jf = c0os7.LJI;
            if (c11jf != null) {
                c11jf.dispose();
            }
        }
        C619630OSb c619630OSb = this.LLL;
        if (c619630OSb != null) {
            c619630OSb.LJFF();
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final void v6() {
        super.v6();
        if (this.LLJLLL == null) {
            ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.d0c);
            BulletinListViewModel bulletinListViewModelF6 = f6();
            boolean zTo = To();
            InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
            this.LLJLLL = new C0OS7(viewStub, bulletinListViewModelF6, zTo, interfaceC665370Q7zLIZ != null ? (BulletinInteractionAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, BulletinInteractionAbility.class, null) : null, a6());
            w6();
        }
        if (!this.LLJZIJLIL) {
            this.LLJZIJLIL = true;
            InterfaceC619700OSi interfaceC619700OSiB7 = b7();
            this.LLJZ = interfaceC619700OSiB7;
            if (interfaceC619700OSiB7 != null) {
                T6(this.itemView.findViewById(R.id.d09));
            }
            C1558520qew.LJII(C1558420qem.LIZIZ(this), this, BulletinCommentAbility.class, null, null);
        }
        if (this.LLL == null) {
            this.LLL = new C619630OSb((ViewStub) this.itemView.findViewById(R.id.d3i), f6(), e6(), a6(), f6().getAssemVMScope());
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    public final boolean U6(View view) {
        return super.U6(view);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: h7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0OOP c0oop) {
        this.LLLF = j7(c0oop);
        super.onBindItemView(c0oop);
        C0OS7 c0os7 = this.LLJLLL;
        if (c0os7 != null) {
            c0os7.LIZLLL(c0oop, this.LLLF, false);
        }
        InterfaceC619700OSi interfaceC619700OSi = this.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LIZLLL(c0oop);
        }
        C619630OSb c619630OSb = this.LLL;
        if (c619630OSb != null) {
            c619630OSb.LIZLLL(this.LLLF, c0oop);
        }
    }

    public final String j7(C0OOP c0oop) {
        String str;
        if (!i6().To() && !C286660BLk.LIZ()) {
            return null;
        }
        List<String> list = c0oop.LLJILJILJ;
        if (list != null) {
            str = (String) C13LP.LJJJLZIJ(0, list);
        } else {
            str = null;
        }
        String strCQ2 = i6().CQ2();
        if (str != null && str.length() != 0 && strCQ2 != null && strCQ2.length() != 0) {
            C382201e8.LIZ.getClass();
            if (C382201e8.LIZ(str, strCQ2)) {
                return str;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.C0OVA r11, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem r12) {
        /*
            r10 = this;
            X.0OOP r12 = (X.C0OOP) r12
            java.lang.String r0 = r10.LLLF
            r9 = 0
            r1 = 1
            if (r0 == 0) goto Laa
            int r0 = r0.length()
            if (r0 == 0) goto Laa
            r3 = 0
        Lf:
            boolean r2 = r12.LLJJJ
            android.view.View r0 = r10.itemView
            android.content.Context r0 = r0.getContext()
            X.0OVA r3 = X.C0OV7.LIZLLL(r0, r3, r2, r9)
            X.19b5 r8 = r10.r6()
            if (r8 == 0) goto L65
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct r0 = r12.LLJILLL
            r7 = 0
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBackgroundStruct r0 = r0.backgroundModel
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel r0 = r0.backgroundResourceModel
            if (r0 == 0) goto La6
            boolean r0 = X.C0OSP.LIZ()
            if (r0 != 0) goto L3a
            boolean r0 = X.C0OSP.LIZIZ()
            if (r0 == 0) goto La6
        L3a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct r0 = r12.LLJILLL
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBackgroundStruct r0 = r0.backgroundModel
            if (r0 == 0) goto La4
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel r0 = r0.backgroundResourceModel
        L44:
            java.lang.String r2 = X.C363301b5.LIZJ(r0)
            if (r2 == 0) goto L73
            X.0NoK r0 = X.C605100NoK.LIZ
            r0.getClass()
            boolean r0 = X.C605100NoK.LIZJ(r8, r2)
            if (r0 == 0) goto L73
            X.0OS7 r2 = r10.LLJLLL
            if (r2 == 0) goto L5e
            java.lang.String r0 = r10.LLLF
            r2.LJFF(r12, r0, r3, r1)
        L5e:
            X.0OSi r0 = r10.LLJZ
            if (r0 == 0) goto L65
            r0.LJFF(r12, r3, r1)
        L65:
            X.0OSi r0 = r10.LLJZ
            if (r0 == 0) goto L6c
            r0.LJI(r12)
        L6c:
            X.0OSb r0 = r10.LLL
            if (r0 == 0) goto L72
            r0.LJIILIIL = r11
        L72:
            return
        L73:
            a7(r12, r10, r8, r3)
            X.0OSa r6 = new X.0OSa
            r6.<init>()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct r0 = r12.LLJILLL
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleBackgroundStruct r0 = r0.backgroundModel
            if (r0 == 0) goto La2
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel r5 = r0.backgroundResourceModel
        L85:
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinListViewModel r0 = r10.f6()
            X.01wk r4 = r0.getAssemVMScope()
            X.01bz r0 = X.EnumC368901bz.IMAGE
            java.util.List r3 = java.util.Collections.singletonList(r0)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0sYq[] r1 = new X.InterfaceC1631620sYq[r1]
            X.0NoA r0 = new X.0NoA
            r0.<init>(r8, r6, r7)
            r1[r9] = r0
            X.C363301b5.LIZ(r5, r4, r3, r2, r1)
            goto L65
        La2:
            r5 = r7
            goto L85
        La4:
            r0 = r7
            goto L44
        La6:
            a7(r12, r10, r8, r3)
            goto L65
        Laa:
            boolean r3 = r12.LLJJIJIL
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinTextCell.N5(X.0OVA, com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem):void");
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinBaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: i7, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C0OOP c0oop, List<? extends Object> list) {
        InterfaceC619700OSi interfaceC619700OSi;
        super.onBindItemView(c0oop, list);
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, list);
        if (!(objLJJJLZIJ instanceof C619660OSe)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("payloads bind diff:");
        sbLIZ.append(objLJJJLZIJ);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        C619660OSe c619660OSe = (C619660OSe) objLJJJLZIJ;
        if (c619660OSe.LIZ) {
            String strJ7 = j7(c0oop);
            this.LLLF = strJ7;
            C0OS7 c0os7 = this.LLJLLL;
            if (c0os7 != null) {
                c0os7.LIZLLL(c0oop, strJ7, false);
            }
            C619630OSb c619630OSb = this.LLL;
            if (c619630OSb != null) {
                c619630OSb.LIZLLL(this.LLLF, c0oop);
            }
        }
        if (c619660OSe.LJIIIZ && (interfaceC619700OSi = this.LLJZ) != null) {
            interfaceC619700OSi.LIZLLL(c0oop);
        }
    }

    public static final void a7(C0OOP c0oop, BulletinTextCell bulletinTextCell, C21568919b5 c21568919b5, C0OVA c0ova) {
        C0OTJ c0otj;
        c21568919b5.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        Context context = c21568919b5.getContext();
        if (c0oop.LLJJJ) {
            if (bulletinTextCell.To()) {
                c0otj = C0OTJ.END;
            } else {
                c0otj = C0OTJ.START;
            }
        } else {
            c0otj = C0OTJ.NONE_MIRROR;
        }
        c21568919b5.setBackground(new C21568519b1(context, c0ova, c0otj, bulletinTextCell.To()));
        C0OS7 c0os7 = bulletinTextCell.LLJLLL;
        if (c0os7 != null) {
            c0os7.LJFF(c0oop, bulletinTextCell.LLLF, c0ova, false);
        }
        InterfaceC619700OSi interfaceC619700OSi = bulletinTextCell.LLJZ;
        if (interfaceC619700OSi != null) {
            interfaceC619700OSi.LJFF(c0oop, c0ova, false);
        }
    }
}
