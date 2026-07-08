package com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery;

import X.C004I;
import X.C13BV;
import X.C1746310vXp;
import X.C786410Ut5;
import X.C948003nC;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public final class DeliveryInstructionState implements C004I {
    public static final int $stable = 8;
    public final C948003nC<DeliveryInstructionInfo> backEvent;
    public final C1746310vXp curSelectItem;
    public final Object editDeliveryInstruction;
    public final List<Object> itemList;
    public final LaneParams logDuration;
    public final LaneParams netEvent;
    public final boolean pageLoaded;
    public final int pageStatus;
    public final Integer saveLoadingStatus;
    public final C948003nC<Integer> scrollerPos;
    public final C948003nC<Integer> toast;

    public DeliveryInstructionState() {
        this(0, null, null, false, null, null, null, null, null, null, null, 2047, null);
    }

    public final DeliveryInstructionState copy(int i, Integer num, List<? extends Object> list, boolean z, Object obj, C1746310vXp c1746310vXp, C948003nC<Integer> c948003nC, C948003nC<DeliveryInstructionInfo> c948003nC2, LaneParams laneParams, C948003nC<Integer> c948003nC3, LaneParams laneParams2) {
        return new DeliveryInstructionState(i, num, list, z, obj, c1746310vXp, c948003nC, c948003nC2, laneParams, c948003nC3, laneParams2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryInstructionState)) {
            return false;
        }
        DeliveryInstructionState deliveryInstructionState = (DeliveryInstructionState) obj;
        return this.pageStatus == deliveryInstructionState.pageStatus && Intrinsics.LJFF(this.saveLoadingStatus, deliveryInstructionState.saveLoadingStatus) && Intrinsics.LJFF(this.itemList, deliveryInstructionState.itemList) && this.pageLoaded == deliveryInstructionState.pageLoaded && Intrinsics.LJFF(this.editDeliveryInstruction, deliveryInstructionState.editDeliveryInstruction) && Intrinsics.LJFF(this.curSelectItem, deliveryInstructionState.curSelectItem) && Intrinsics.LJFF(this.scrollerPos, deliveryInstructionState.scrollerPos) && Intrinsics.LJFF(this.backEvent, deliveryInstructionState.backEvent) && Intrinsics.LJFF(this.netEvent, deliveryInstructionState.netEvent) && Intrinsics.LJFF(this.toast, deliveryInstructionState.toast) && Intrinsics.LJFF(this.logDuration, deliveryInstructionState.logDuration);
    }

    public int hashCode() {
        int i = this.pageStatus * 31;
        Integer num = this.saveLoadingStatus;
        int iHashCode = (((((i + (num == null ? 0 : num.hashCode())) * 31) + this.itemList.hashCode()) * 31) + C786410Ut5.Z2(this.pageLoaded)) * 31;
        Object obj = this.editDeliveryInstruction;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C1746310vXp c1746310vXp = this.curSelectItem;
        int iHashCode3 = (iHashCode2 + (c1746310vXp == null ? 0 : c1746310vXp.hashCode())) * 31;
        C948003nC<Integer> c948003nC = this.scrollerPos;
        int iHashCode4 = (iHashCode3 + (c948003nC == null ? 0 : c948003nC.hashCode())) * 31;
        C948003nC<DeliveryInstructionInfo> c948003nC2 = this.backEvent;
        int iHashCode5 = (iHashCode4 + (c948003nC2 == null ? 0 : c948003nC2.hashCode())) * 31;
        LaneParams laneParams = this.netEvent;
        int iHashCode6 = (iHashCode5 + (laneParams == null ? 0 : laneParams.hashCode())) * 31;
        C948003nC<Integer> c948003nC3 = this.toast;
        int iHashCode7 = (iHashCode6 + (c948003nC3 == null ? 0 : c948003nC3.hashCode())) * 31;
        LaneParams laneParams2 = this.logDuration;
        return iHashCode7 + (laneParams2 != null ? laneParams2.hashCode() : 0);
    }

    public String toString() {
        return "DeliveryInstructionState(pageStatus=" + this.pageStatus + ", saveLoadingStatus=" + this.saveLoadingStatus + ", itemList=" + this.itemList + ", pageLoaded=" + this.pageLoaded + ", editDeliveryInstruction=" + this.editDeliveryInstruction + ", curSelectItem=" + this.curSelectItem + ", scrollerPos=" + this.scrollerPos + ", backEvent=" + this.backEvent + ", netEvent=" + this.netEvent + ", toast=" + this.toast + ", logDuration=" + this.logDuration + ')';
    }

    public final C948003nC<DeliveryInstructionInfo> getBackEvent() {
        return this.backEvent;
    }

    public final C1746310vXp getCurSelectItem() {
        return this.curSelectItem;
    }

    public final Object getEditDeliveryInstruction() {
        return this.editDeliveryInstruction;
    }

    public final List<Object> getItemList() {
        return this.itemList;
    }

    public final LaneParams getLogDuration() {
        return this.logDuration;
    }

    public final LaneParams getNetEvent() {
        return this.netEvent;
    }

    public final boolean getPageLoaded() {
        return this.pageLoaded;
    }

    public final int getPageStatus() {
        return this.pageStatus;
    }

    public final Integer getSaveLoadingStatus() {
        return this.saveLoadingStatus;
    }

    public final C948003nC<Integer> getScrollerPos() {
        return this.scrollerPos;
    }

    public final C948003nC<Integer> getToast() {
        return this.toast;
    }

    public DeliveryInstructionState(int i, Integer num, List<? extends Object> list, boolean z, Object obj, C1746310vXp c1746310vXp, C948003nC<Integer> c948003nC, C948003nC<DeliveryInstructionInfo> c948003nC2, LaneParams laneParams, C948003nC<Integer> c948003nC3, LaneParams laneParams2) {
        this.pageStatus = i;
        this.saveLoadingStatus = num;
        this.itemList = list;
        this.pageLoaded = z;
        this.editDeliveryInstruction = obj;
        this.curSelectItem = c1746310vXp;
        this.scrollerPos = c948003nC;
        this.backEvent = c948003nC2;
        this.netEvent = laneParams;
        this.toast = c948003nC3;
        this.logDuration = laneParams2;
    }

    public DeliveryInstructionState(int i, Integer num, List list, boolean z, Object obj, C1746310vXp c1746310vXp, C948003nC c948003nC, C948003nC c948003nC2, LaneParams laneParams, C948003nC c948003nC3, LaneParams laneParams2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? C13BV.INSTANCE : list, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : obj, (i2 & 32) != 0 ? null : c1746310vXp, (i2 & 64) != 0 ? null : c948003nC, (i2 & 128) != 0 ? null : c948003nC2, (i2 & 256) != 0 ? null : laneParams, (i2 & 512) != 0 ? null : c948003nC3, (i2 & 1024) == 0 ? laneParams2 : null);
    }
}
