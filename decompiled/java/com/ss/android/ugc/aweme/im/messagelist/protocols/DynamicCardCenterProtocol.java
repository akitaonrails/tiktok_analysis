package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.C01GW;
import X.C09EF;
import X.C0I73;
import X.C0IB0;
import X.C0Z2Z;
import X.C0ZDX;
import X.C0ZOY;
import X.C0ZT0;
import X.C0ZT1;
import X.C2188811AlT;
import X.C452501pT;
import X.C462600ICc;
import X.C462620ICe;
import X.C462630ICf;
import X.C869590Y9l;
import X.C898560ZMw;
import X.C898790ZNt;
import X.C900030ZSn;
import X.C900150ZSz;
import X.C902730ZbD;
import X.InterfaceC1891350zJl;
import X.InterfaceC900060ZSq;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicCardClientInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.SkeletonLayoutAssemblerBridge;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class DynamicCardCenterProtocol implements IMMessageListProtocol<C900030ZSn> {
    public final Fragment LL;
    public final C898790ZNt LLILLJJLI = new C898790ZNt(new int[]{2000}, AFwS248S0000000_14.get$arr$(136));
    public final MessageListProtocolEnum LLILLL = MessageListProtocolEnum.DYNAMIC_CARD_CENTER;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 522));
    public final Class<? extends PowerCell<C900030ZSn>> LLILZIL = DynamicCardCenterCell.class;

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C900030ZSn> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C900030ZSn> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C900030ZSn>> getWithCell() {
        return this.LLILZIL;
    }

    public DynamicCardCenterProtocol(Fragment fragment) {
        this.LL = fragment;
    }

    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        DynamicCardTemplate dynamicCardTemplate;
        DynamicInfoComponent dynamicInfoComponent;
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent;
        C0ZT1 c0zt1LIZ;
        long jLongValue;
        long jLongValue2;
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            C869590Y9l c869590Y9l2 = c869590Y9l;
            if (!Intrinsics.LJFF(c869590Y9l2.getLocalExt().get("local_ext_dynamic_hide_card"), "1")) {
                if (C0ZDX.LJJIIZ(c869590Y9l2) && (dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l2, DynamicCardTemplate.class)) != null && (dynamicInfoComponent = dynamicCardTemplate.dynamicInfo) != null && (dynamicCardClientInfoComponent = dynamicInfoComponent.dynamicCardClientInfo) != null && (c0zt1LIZ = C0ZT0.LIZ(dynamicCardClientInfoComponent.resourceType)) != null) {
                    c0zt1LIZ.LIZ.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkHideStatus: type ");
                    sbLIZ.append(dynamicCardClientInfoComponent.resourceType);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C0ZT1 c0zt1LIZ2 = C0ZT0.LIZ(dynamicCardClientInfoComponent.resourceType);
                    if (c0zt1LIZ2 != null) {
                        long index = c869590Y9l2.getIndex();
                        String str = dynamicCardClientInfoComponent.resourceId;
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        C900150ZSz c900150ZSz = c0zt1LIZ2.LIZ;
                        Long l = c900150ZSz.LIZLLL.get(str);
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        if (jLongValue < index) {
                            c900150ZSz.LIZLLL.put(str, Long.valueOf(index));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("updateIndex: taskId ");
                            sbLIZ2.append(str);
                            sbLIZ2.append(" , index ");
                            sbLIZ2.append(index);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            Keva keva = c900150ZSz.LIZ;
                            String str3 = c900150ZSz.LIZIZ;
                            Gson gson = C09EF.LIZ;
                            keva.storeString(str3, GsonProtectorUtils.toJson(gson, c900150ZSz.LIZLLL));
                            if (!c900150ZSz.LJ.contains(str)) {
                                c900150ZSz.LJ.put(str, Long.valueOf(System.currentTimeMillis()));
                                c900150ZSz.LIZ.storeString(c900150ZSz.LIZJ, GsonProtectorUtils.toJson(gson, c900150ZSz.LJ));
                            }
                        }
                        if (!Intrinsics.LJFF(c869590Y9l2.getLocalExt().get("local_ext_dynamic_hide_card"), "1")) {
                            if (!Intrinsics.LJFF(dynamicCardClientInfoComponent.hideCard, Boolean.TRUE) && !C0ZDX.LJJJJZ(c869590Y9l2)) {
                                String str4 = dynamicCardClientInfoComponent.resourceId;
                                if (str4 != null) {
                                    str2 = str4;
                                }
                                Long l2 = c0zt1LIZ2.LIZ.LIZLLL.get(str2);
                                if (l2 != null) {
                                    jLongValue2 = l2.longValue();
                                } else {
                                    jLongValue2 = 0;
                                }
                                if (jLongValue2 > index) {
                                    C900150ZSz.LIZ(c869590Y9l2);
                                }
                            } else {
                                C900150ZSz.LIZ(c869590Y9l2);
                            }
                        }
                    }
                }
                arrayList.add(c869590Y9l);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC1891350zJl mapToPowerItem(List list, C869590Y9l c869590Y9l, int i) {
        final Long lValueOf;
        DynamicInfoComponent dynamicInfoComponent;
        DynamicCardClientInfoComponent dynamicCardClientInfoComponent;
        String str;
        C0ZT1 c0zt1LIZ;
        long jLongValue;
        float f = C0I73.LIZ;
        final DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l, DynamicCardTemplate.class);
        final C0IB0 c0ib0LIZ = ((SkeletonLayoutAssemblerBridge) this.LLILZ.getValue()).mN2(list, new C0ZOY(C898560ZMw.LIZ)).LIZ(list, c869590Y9l, i);
        final C462620ICe c462620ICe = new C462620ICe(new C462630ICf(f, f, f, f), new C462600ICc());
        if (dynamicCardTemplate != null && (dynamicInfoComponent = dynamicCardTemplate.dynamicInfo) != null && (dynamicCardClientInfoComponent = dynamicInfoComponent.dynamicCardClientInfo) != null && (str = dynamicCardClientInfoComponent.resourceId) != null && (c0zt1LIZ = C0ZT0.LIZ(dynamicCardClientInfoComponent.resourceType)) != null) {
            Long l = c0zt1LIZ.LIZ.LIZLLL.get(str);
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            lValueOf = Long.valueOf(jLongValue);
        } else {
            lValueOf = null;
        }
        return new InterfaceC900060ZSq(dynamicCardTemplate, c0ib0LIZ, c462620ICe, lValueOf) { // from class: X.0ZSn
            public final DynamicCardTemplate LL;
            public final C0IB0 LLILLJJLI;
            public final C462620ICe LLILLL;
            public final Long LLILZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C900030ZSn)) {
                    return false;
                }
                C900030ZSn c900030ZSn = (C900030ZSn) obj;
                return Intrinsics.LJFF(this.LL, c900030ZSn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900030ZSn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900030ZSn.LLILLL) && Intrinsics.LJFF(this.LLILZ, c900030ZSn.LLILZ);
            }

            public final int hashCode() {
                DynamicCardTemplate dynamicCardTemplate2 = this.LL;
                int iHashCode = (((((dynamicCardTemplate2 == null ? 0 : dynamicCardTemplate2.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
                Long l2 = this.LLILZ;
                return iHashCode + (l2 != null ? l2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DynamicCardCenterData(dynamicCardTemplate=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", skeletonLayoutData=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", backgroundConfig=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", indexOfTaskId=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC900060ZSq
            public final C462620ICe LIZJ() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC900060ZSq
            public final DynamicCardTemplate LJJLIL() {
                return this.LL;
            }

            @Override // X.InterfaceC461380I7k
            public final C0IB0 LLILII() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C461450I7r.LIZ(this, interfaceC1891350zJl);
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return C900050ZSp.LIZ(this, interfaceC1891350zJl);
            }

            {
                this.LL = dynamicCardTemplate;
                this.LLILLJJLI = c0ib0LIZ;
                this.LLILLL = c462620ICe;
                this.LLILZ = lValueOf;
            }
        };
    }
}
