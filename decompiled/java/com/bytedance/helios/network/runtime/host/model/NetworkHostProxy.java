package com.bytedance.helios.network.runtime.host.model;

import X.C0WZW;
import X.C2097608Jq;
import X.InterfaceC1631620sYq;
import X.InterfaceC2280171EMt;
import X.InterfaceC2280181EMu;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkHostProxy {
    public final Function0<String> currentRegionGetter;
    public final Function0<String> deviceIdGetter;
    public final Function1<Object, Unit> doAfterRegisterTTNetInterceptor;
    public final Function1<Object, Unit> doBeforeRegisterTTNetInterceptor;
    public final NetworkEventMonitor eventMonitor;
    public final NetworkExceptionMonitor exceptionMonitor;
    public final Function1<String, Map<String, String>> getSparkEvent;
    public final Function0<String> installIdGetter;
    public final InterfaceC1631620sYq<String, Map<String, String>, List<String>, Set<String>> nativeRequestInterceptor;
    public final Function2<String, Map<String, String>, Unit> notifySpark;
    public final Function0<Set<String>> onePartyDomainList;
    public final InterfaceC2280181EMu<Integer, String, String, Object, Object[], Object, C0WZW, Boolean, Unit> postInvokeInterceptor;
    public final InterfaceC2280171EMt<Integer, String, String, Object, Object[], String, C0WZW, Unit> preInvokeInterceptor;
    public final Function0<String> regionSourceGetter;
    public final Object ruleEngine;
    public final Function0<String> sandboxStateGetter;
    public final Map<String, Function0<Boolean>> sceneStatusGetter;
    public final NetworkStore store;
    public final Function0<Set<String>> thirdPartyDomainList;
    public final Function0<String> userRegionGetter;

    public NetworkHostProxy() {
        this(AFwS200S0000000_13.get$arr$(20), AFwS200S0000000_13.get$arr$(21), AFwS200S0000000_13.get$arr$(22), AFwS200S0000000_13.get$arr$(23), C2097608Jq.LJ(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkHostProxy)) {
            return false;
        }
        NetworkHostProxy networkHostProxy = (NetworkHostProxy) obj;
        return Intrinsics.LJFF(this.deviceIdGetter, networkHostProxy.deviceIdGetter) && Intrinsics.LJFF(this.userRegionGetter, networkHostProxy.userRegionGetter) && Intrinsics.LJFF(this.currentRegionGetter, networkHostProxy.currentRegionGetter) && Intrinsics.LJFF(this.regionSourceGetter, networkHostProxy.regionSourceGetter) && Intrinsics.LJFF(this.sceneStatusGetter, networkHostProxy.sceneStatusGetter) && Intrinsics.LJFF(this.installIdGetter, networkHostProxy.installIdGetter) && Intrinsics.LJFF(this.sandboxStateGetter, networkHostProxy.sandboxStateGetter) && Intrinsics.LJFF(this.onePartyDomainList, networkHostProxy.onePartyDomainList) && Intrinsics.LJFF(this.thirdPartyDomainList, networkHostProxy.thirdPartyDomainList) && Intrinsics.LJFF(this.doBeforeRegisterTTNetInterceptor, networkHostProxy.doBeforeRegisterTTNetInterceptor) && Intrinsics.LJFF(this.doAfterRegisterTTNetInterceptor, networkHostProxy.doAfterRegisterTTNetInterceptor) && Intrinsics.LJFF(this.getSparkEvent, networkHostProxy.getSparkEvent) && Intrinsics.LJFF(this.notifySpark, networkHostProxy.notifySpark) && Intrinsics.LJFF(this.nativeRequestInterceptor, networkHostProxy.nativeRequestInterceptor) && Intrinsics.LJFF(this.preInvokeInterceptor, networkHostProxy.preInvokeInterceptor) && Intrinsics.LJFF(this.postInvokeInterceptor, networkHostProxy.postInvokeInterceptor) && Intrinsics.LJFF(this.eventMonitor, networkHostProxy.eventMonitor) && Intrinsics.LJFF(this.store, networkHostProxy.store) && Intrinsics.LJFF(this.exceptionMonitor, networkHostProxy.exceptionMonitor) && Intrinsics.LJFF(this.ruleEngine, networkHostProxy.ruleEngine);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.deviceIdGetter.hashCode() * 31) + this.userRegionGetter.hashCode()) * 31) + this.currentRegionGetter.hashCode()) * 31) + this.regionSourceGetter.hashCode()) * 31) + this.sceneStatusGetter.hashCode()) * 31;
        Function0<String> function0 = this.installIdGetter;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<String> function02 = this.sandboxStateGetter;
        int iHashCode3 = (iHashCode2 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0<Set<String>> function03 = this.onePartyDomainList;
        int iHashCode4 = (iHashCode3 + (function03 == null ? 0 : function03.hashCode())) * 31;
        Function0<Set<String>> function04 = this.thirdPartyDomainList;
        int iHashCode5 = (iHashCode4 + (function04 == null ? 0 : function04.hashCode())) * 31;
        Function1<Object, Unit> function1 = this.doBeforeRegisterTTNetInterceptor;
        int iHashCode6 = (iHashCode5 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<Object, Unit> function12 = this.doAfterRegisterTTNetInterceptor;
        int iHashCode7 = (iHashCode6 + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<String, Map<String, String>> function13 = this.getSparkEvent;
        int iHashCode8 = (iHashCode7 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function2<String, Map<String, String>, Unit> function2 = this.notifySpark;
        int iHashCode9 = (iHashCode8 + (function2 == null ? 0 : function2.hashCode())) * 31;
        InterfaceC1631620sYq<String, Map<String, String>, List<String>, Set<String>> interfaceC1631620sYq = this.nativeRequestInterceptor;
        int iHashCode10 = (iHashCode9 + (interfaceC1631620sYq == null ? 0 : interfaceC1631620sYq.hashCode())) * 31;
        InterfaceC2280171EMt<Integer, String, String, Object, Object[], String, C0WZW, Unit> interfaceC2280171EMt = this.preInvokeInterceptor;
        int iHashCode11 = (iHashCode10 + (interfaceC2280171EMt == null ? 0 : interfaceC2280171EMt.hashCode())) * 31;
        InterfaceC2280181EMu<Integer, String, String, Object, Object[], Object, C0WZW, Boolean, Unit> interfaceC2280181EMu = this.postInvokeInterceptor;
        int iHashCode12 = (iHashCode11 + (interfaceC2280181EMu == null ? 0 : interfaceC2280181EMu.hashCode())) * 31;
        NetworkEventMonitor networkEventMonitor = this.eventMonitor;
        int iHashCode13 = (iHashCode12 + (networkEventMonitor == null ? 0 : networkEventMonitor.hashCode())) * 31;
        NetworkStore networkStore = this.store;
        int iHashCode14 = (iHashCode13 + (networkStore == null ? 0 : networkStore.hashCode())) * 31;
        NetworkExceptionMonitor networkExceptionMonitor = this.exceptionMonitor;
        int iHashCode15 = (iHashCode14 + (networkExceptionMonitor == null ? 0 : networkExceptionMonitor.hashCode())) * 31;
        Object obj = this.ruleEngine;
        return iHashCode15 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "NetworkHostProxy(deviceIdGetter=" + this.deviceIdGetter + ", userRegionGetter=" + this.userRegionGetter + ", currentRegionGetter=" + this.currentRegionGetter + ", regionSourceGetter=" + this.regionSourceGetter + ", sceneStatusGetter=" + this.sceneStatusGetter + ", installIdGetter=" + this.installIdGetter + ", sandboxStateGetter=" + this.sandboxStateGetter + ", onePartyDomainList=" + this.onePartyDomainList + ", thirdPartyDomainList=" + this.thirdPartyDomainList + ", doBeforeRegisterTTNetInterceptor=" + this.doBeforeRegisterTTNetInterceptor + ", doAfterRegisterTTNetInterceptor=" + this.doAfterRegisterTTNetInterceptor + ", getSparkEvent=" + this.getSparkEvent + ", notifySpark=" + this.notifySpark + ", nativeRequestInterceptor=" + this.nativeRequestInterceptor + ", preInvokeInterceptor=" + this.preInvokeInterceptor + ", postInvokeInterceptor=" + this.postInvokeInterceptor + ", eventMonitor=" + this.eventMonitor + ", store=" + this.store + ", exceptionMonitor=" + this.exceptionMonitor + ", ruleEngine=" + this.ruleEngine + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NetworkHostProxy(Function0<String> function0, Function0<String> function02, Function0<String> function03, Function0<String> function04, Map<String, ? extends Function0<Boolean>> map, Function0<String> function05, Function0<String> function06, Function0<? extends Set<String>> function07, Function0<? extends Set<String>> function08, Function1<Object, Unit> function1, Function1<Object, Unit> function12, Function1<? super String, ? extends Map<String, String>> function13, Function2<? super String, ? super Map<String, String>, Unit> function2, InterfaceC1631620sYq<? super String, ? super Map<String, String>, ? super List<String>, ? extends Set<String>> interfaceC1631620sYq, InterfaceC2280171EMt<? super Integer, ? super String, ? super String, Object, ? super Object[], ? super String, ? super C0WZW, Unit> interfaceC2280171EMt, InterfaceC2280181EMu<? super Integer, ? super String, ? super String, Object, ? super Object[], Object, ? super C0WZW, ? super Boolean, Unit> interfaceC2280181EMu, NetworkEventMonitor networkEventMonitor, NetworkStore networkStore, NetworkExceptionMonitor networkExceptionMonitor, Object obj) {
        this.deviceIdGetter = function0;
        this.userRegionGetter = function02;
        this.currentRegionGetter = function03;
        this.regionSourceGetter = function04;
        this.sceneStatusGetter = map;
        this.installIdGetter = function05;
        this.sandboxStateGetter = function06;
        this.onePartyDomainList = function07;
        this.thirdPartyDomainList = function08;
        this.doBeforeRegisterTTNetInterceptor = function1;
        this.doAfterRegisterTTNetInterceptor = function12;
        this.getSparkEvent = function13;
        this.notifySpark = function2;
        this.nativeRequestInterceptor = interfaceC1631620sYq;
        this.preInvokeInterceptor = interfaceC2280171EMt;
        this.postInvokeInterceptor = interfaceC2280181EMu;
        this.eventMonitor = networkEventMonitor;
        this.store = networkStore;
        this.exceptionMonitor = networkExceptionMonitor;
        this.ruleEngine = obj;
    }
}
