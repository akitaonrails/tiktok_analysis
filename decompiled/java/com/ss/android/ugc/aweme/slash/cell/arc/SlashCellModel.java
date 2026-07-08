package com.ss.android.ugc.aweme.slash.cell.arc;

import X.C09CT;
import X.InterfaceC111300bX;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.google.gson.n;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashCellModel implements InterfaceC111300bX, InterfaceC1891350zJl {
    public int LL;
    public final Object LLILLJJLI;
    public final Function1<View, Unit> LLILLL;

    @C09CT("data")
    public final n cellData;

    @C09CT("cell_id")
    public final String cellId;

    @C09CT("cell_type")
    public final String cellType;

    @C09CT("cells")
    public final List<SlashCellModel> cells;

    @C09CT("cells_common_data")
    public final Map<String, n> cellsData;

    @C09CT("click_config")
    public final SlashClickConfig clickConfig;

    @C09CT("events")
    public final List<SlashCommonEvent> events;

    @C09CT("track_config")
    public final List<SlashTrackConfig> trackConfig;

    public SlashCellModel() {
        this(null, null, null, null, null, null, null, null, 0, null, AFwS256S0000000_18.get$arr$(749));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlashCellModel)) {
            return false;
        }
        SlashCellModel slashCellModel = (SlashCellModel) obj;
        return Intrinsics.LJFF(this.cellType, slashCellModel.cellType) && Intrinsics.LJFF(this.cellId, slashCellModel.cellId) && Intrinsics.LJFF(this.cellData, slashCellModel.cellData) && Intrinsics.LJFF(this.cells, slashCellModel.cells) && Intrinsics.LJFF(this.cellsData, slashCellModel.cellsData) && Intrinsics.LJFF(this.trackConfig, slashCellModel.trackConfig) && Intrinsics.LJFF(this.clickConfig, slashCellModel.clickConfig) && Intrinsics.LJFF(this.events, slashCellModel.events) && this.LL == slashCellModel.LL && Intrinsics.LJFF(this.LLILLJJLI, slashCellModel.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, slashCellModel.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.cellType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cellId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        n nVar = this.cellData;
        int iHashCode3 = (iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        List<SlashCellModel> list = this.cells;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, n> map = this.cellsData;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        List<SlashTrackConfig> list2 = this.trackConfig;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SlashClickConfig slashClickConfig = this.clickConfig;
        int iHashCode7 = (iHashCode6 + (slashClickConfig == null ? 0 : slashClickConfig.hashCode())) * 31;
        List<SlashCommonEvent> list3 = this.events;
        int iHashCode8 = (((iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.LL) * 31;
        Object obj = this.LLILLJJLI;
        return ((iHashCode8 + (obj != null ? obj.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        return "SlashCellModel(cellType=" + this.cellType + ", cellId=" + this.cellId + ", cellData=" + this.cellData + ", cells=" + this.cells + ", cellsData=" + this.cellsData + ", trackConfig=" + this.trackConfig + ", clickConfig=" + this.clickConfig + ", events=" + this.events + ", indexInParent=" + this.LL + ", realCellData=" + this.LLILLJJLI + ", onCellClick=" + this.LLILLL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlashCellModel(String str, String str2, n nVar, List<SlashCellModel> list, Map<String, n> map, List<SlashTrackConfig> list2, SlashClickConfig slashClickConfig, List<SlashCommonEvent> list3, int i, Object obj, Function1<? super View, Unit> function1) {
        this.cellType = str;
        this.cellId = str2;
        this.cellData = nVar;
        this.cells = list;
        this.cellsData = map;
        this.trackConfig = list2;
        this.clickConfig = slashClickConfig;
        this.events = list3;
        this.LL = i;
        this.LLILLJJLI = obj;
        this.LLILLL = function1;
    }
}
