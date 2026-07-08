package com.ss.android.ugc.aweme.social.creation.record.viewmodel;

import X.C004I;
import X.C1378605aS;
import X.C1658370tFz;
import X.C1658470tG9;
import X.C1658500tGC;
import X.C1665700tRo;
import X.C1683130ttv;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1308705Af;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class RecordViewModelState implements C004I {
    public static final int $stable = 0;
    public final C1658470tG9 bottomViewState;
    public final C1683130ttv cameraLayoutMarginsPx;
    public final boolean cameraVisible;
    public final C1658500tGC centerViewState;
    public final Function2<MotionEvent, C1378605aS, Unit> inRecordMotionEventConsumer;
    public final boolean panelShowing;
    public final EnumC1308705Af recordStatus;
    public final C1665700tRo topViewState;
    public final C1658370tFz visibility;

    public RecordViewModelState() {
        this(new C1665700tRo(0), new C1658500tGC(null, null, 7), new C1658470tG9(null), new C1683130ttv(0.0f, 0.0f, 0.0f, 0.0f), false, true, EnumC1308705Af.NOT_RECORDING, AFwS311S0000000_25.get$arr$(25), new C1658370tFz(false, 15));
    }

    public final RecordViewModelState copy(C1665700tRo c1665700tRo, C1658500tGC c1658500tGC, C1658470tG9 c1658470tG9, C1683130ttv c1683130ttv, boolean z, boolean z2, EnumC1308705Af enumC1308705Af, Function2<? super MotionEvent, ? super C1378605aS, Unit> function2, C1658370tFz c1658370tFz) {
        return new RecordViewModelState(c1665700tRo, c1658500tGC, c1658470tG9, c1683130ttv, z, z2, enumC1308705Af, function2, c1658370tFz);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordViewModelState)) {
            return false;
        }
        RecordViewModelState recordViewModelState = (RecordViewModelState) obj;
        return Intrinsics.LJFF(this.topViewState, recordViewModelState.topViewState) && Intrinsics.LJFF(this.centerViewState, recordViewModelState.centerViewState) && Intrinsics.LJFF(this.bottomViewState, recordViewModelState.bottomViewState) && Intrinsics.LJFF(this.cameraLayoutMarginsPx, recordViewModelState.cameraLayoutMarginsPx) && this.panelShowing == recordViewModelState.panelShowing && this.cameraVisible == recordViewModelState.cameraVisible && this.recordStatus == recordViewModelState.recordStatus && Intrinsics.LJFF(this.inRecordMotionEventConsumer, recordViewModelState.inRecordMotionEventConsumer) && Intrinsics.LJFF(this.visibility, recordViewModelState.visibility);
    }

    public int hashCode() {
        return (((((((((((((((this.topViewState.hashCode() * 31) + this.centerViewState.hashCode()) * 31) + this.bottomViewState.hashCode()) * 31) + this.cameraLayoutMarginsPx.hashCode()) * 31) + C786410Ut5.Z2(this.panelShowing)) * 31) + C786410Ut5.Z2(this.cameraVisible)) * 31) + this.recordStatus.hashCode()) * 31) + this.inRecordMotionEventConsumer.hashCode()) * 31) + this.visibility.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecordViewModelState(topViewState=");
        sbLIZ.append(this.topViewState);
        sbLIZ.append(", centerViewState=");
        sbLIZ.append(this.centerViewState);
        sbLIZ.append(", bottomViewState=");
        sbLIZ.append(this.bottomViewState);
        sbLIZ.append(", cameraLayoutMarginsPx=");
        sbLIZ.append(this.cameraLayoutMarginsPx);
        sbLIZ.append(", panelShowing=");
        sbLIZ.append(this.panelShowing);
        sbLIZ.append(", cameraVisible=");
        sbLIZ.append(this.cameraVisible);
        sbLIZ.append(", recordStatus=");
        sbLIZ.append(this.recordStatus);
        sbLIZ.append(", inRecordMotionEventConsumer=");
        sbLIZ.append(this.inRecordMotionEventConsumer);
        sbLIZ.append(", visibility=");
        sbLIZ.append(this.visibility);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C1658470tG9 getBottomViewState() {
        return this.bottomViewState;
    }

    public final C1683130ttv getCameraLayoutMarginsPx() {
        return this.cameraLayoutMarginsPx;
    }

    public final boolean getCameraVisible() {
        return this.cameraVisible;
    }

    public final C1658500tGC getCenterViewState() {
        return this.centerViewState;
    }

    public final Function2<MotionEvent, C1378605aS, Unit> getInRecordMotionEventConsumer() {
        return this.inRecordMotionEventConsumer;
    }

    public final boolean getPanelShowing() {
        return this.panelShowing;
    }

    public final EnumC1308705Af getRecordStatus() {
        return this.recordStatus;
    }

    public final C1665700tRo getTopViewState() {
        return this.topViewState;
    }

    public final C1658370tFz getVisibility() {
        return this.visibility;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecordViewModelState(C1665700tRo c1665700tRo, C1658500tGC c1658500tGC, C1658470tG9 c1658470tG9, C1683130ttv c1683130ttv, boolean z, boolean z2, EnumC1308705Af enumC1308705Af, Function2<? super MotionEvent, ? super C1378605aS, Unit> function2, C1658370tFz c1658370tFz) {
        this.topViewState = c1665700tRo;
        this.centerViewState = c1658500tGC;
        this.bottomViewState = c1658470tG9;
        this.cameraLayoutMarginsPx = c1683130ttv;
        this.panelShowing = z;
        this.cameraVisible = z2;
        this.recordStatus = enumC1308705Af;
        this.inRecordMotionEventConsumer = function2;
        this.visibility = c1658370tFz;
    }
}
