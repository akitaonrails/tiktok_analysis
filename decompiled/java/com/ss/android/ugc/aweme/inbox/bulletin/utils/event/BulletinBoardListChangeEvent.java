package com.ss.android.ugc.aweme.inbox.bulletin.utils.event;

import X.AbstractC624280OeA;
import X.C01GW;
import X.C09CT;
import X.C0OJY;
import X.C0OPX;
import X.C1227904rF;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2241008qG;
import X.C452501pT;
import X.EnumC617060OIe;
import X.InterfaceC1891350zJl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinBoardListChangeEvent extends AbstractC624280OeA<BulletinBoardListChangeEvent> {
    public final Function1<BulletinBaseItem, Boolean> LJI;
    public final C01GW LJII;
    public EnumC617060OIe LJIIIIZZ;
    public WeakReference<List<InterfaceC1891350zJl>> LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;

    @Override // X.AbstractC624280OeA
    public final void LJII() {
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            List<ChangeDetail> listLJIIIZ = LJIIIZ();
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(listLJIIIZ);
            String str = this.LIZ;
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZIZ(Integer.valueOf(LJIIIZ().size()), "total_change_count");
            c2241008qG.LIZIZ(Integer.valueOf(this.LJIIJ), "item_change_count");
            c2241008qG.LIZIZ(Integer.valueOf(this.LJIIJJI), "item_update_count");
            EnumC617060OIe enumC617060OIe = this.LJIIIIZZ;
            if (enumC617060OIe == null) {
                enumC617060OIe = EnumC617060OIe.INVALID;
            }
            c2241008qG.LIZIZ(Integer.valueOf(enumC617060OIe.getValue()), "identity");
            c2241008qG.LIZLLL("detail", strLJI);
            C20684815ws.LJIJ(str, c2241008qG.LJ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportBulletinBoardListChangeEvent error: ");
            sbLIZ.append(e);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final List<ChangeDetail> LJIIIZ() {
        return (List) this.LJII.getValue();
    }

    @Override // X.AbstractC624280OeA
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        this.LJIIIIZZ = EnumC617060OIe.INVALID;
        this.LJIIL = false;
        this.LJIIJ = 0;
        this.LJIIJJI = 0;
        LJIIIZ().clear();
        this.LJIIIZ.clear();
    }

    public BulletinBoardListChangeEvent(C0OJY c0ojy) {
        super("bb_list_change_monitor");
        this.LJI = c0ojy;
        this.LJII = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(153));
        this.LJIIIIZZ = EnumC617060OIe.INVALID;
        this.LJIIIZ = new WeakReference<>(new ArrayList());
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class ChangeDetail {

        @C09CT("change_type")
        public final String changeType;

        @C09CT("item_id")
        public final String itemId;

        @C09CT("item_type")
        public final String itemType;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ChangeDetail(itemId=");
            sbLIZ.append(this.itemId);
            sbLIZ.append(", itemType=");
            sbLIZ.append(this.itemType);
            sbLIZ.append(", changeType=");
            sbLIZ.append(this.changeType);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public ChangeDetail(String str, String str2, String str3) {
            this.itemId = str;
            this.itemType = str2;
            this.changeType = str3;
        }
    }
}
