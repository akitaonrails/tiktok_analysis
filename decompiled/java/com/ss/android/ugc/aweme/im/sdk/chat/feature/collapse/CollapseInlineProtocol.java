package com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse;

import X.C019F;
import X.C01D1;
import X.C0YUT;
import X.C0ZTH;
import X.C13BV;
import X.C13DB;
import X.C13LE;
import X.C13LP;
import X.C1622206Wu;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C457780HxI;
import X.C724750Sbp;
import X.C869590Y9l;
import X.C898790ZNt;
import X.C902730ZbD;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC903660Zci;
import X.InterfaceC904590ZeD;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.MessageListProtocolEnum;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class CollapseInlineProtocol implements IMMessageListProtocol<C0ZTH> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C457780HxI LL;
    public final C898790ZNt LLILLJJLI = new C898790ZNt(new int[]{4009});
    public final Class<? extends PowerCell<C0ZTH>> LLILLL = CollapseInlinePowerCell.class;
    public final MessageListProtocolEnum LLILZ = MessageListProtocolEnum.COLLAPSE_INLINE_PROTOCOL;
    public final AssemVMLazy LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollapseInlineProtocol.class, "collapseInlineVM", "getCollapseInlineVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/collapse/CollapseInlineVM;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC902790ZbJ
    public final Integer getCustomViewPoolSize() {
        return null;
    }

    @Override // X.InterfaceC902790ZbJ
    public final Class<C0ZTH> getPowerItemClazz() {
        return null;
    }

    @Override // X.InterfaceC902770ZbH
    public final boolean isEnabled() {
        return true;
    }

    public final CollapseInlineVM LIZ() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZLL;
        return (CollapseInlineVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    public final InterfaceC904590ZeD<MessageListProtocolEnum, C0ZTH> toMessageListProtocol() {
        return new C902730ZbD(this);
    }

    @Override // X.InterfaceC902770ZbH
    public final MessageListProtocolEnum getInterceptOrdering() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC902770ZbH
    public final /* bridge */ /* synthetic */ InterfaceC903660Zci getMsgHandlerCheck() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC902800ZbK
    public final Class<? extends PowerCell<C0ZTH>> getWithCell() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC902770ZbH
    public final List<C869590Y9l> intercept(List<? extends C869590Y9l> list) {
        long jLongValue;
        int i;
        if (this.LL.LL.isChatroomInteractionBlocked()) {
            return list;
        }
        CollapseInlineVM collapseInlineVMLIZ = LIZ();
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C13DB c13db = new C13DB();
        Iterator<T> it2 = collapseInlineVMLIZ.LLILZ.iterator();
        while (it2.hasNext()) {
            Set<String> set = collapseInlineVMLIZ.LLILZIL.get(Integer.valueOf(((Number) it2.next()).intValue()));
            if (set != null) {
                c13db.addAll(set);
            }
        }
        Set setBuild = c13db.build();
        int i2 = 0;
        int iIntValue = 0;
        boolean z = false;
        for (Object obj : list) {
            int i3 = i2 + 1;
            String uuid = null;
            if (i2 >= 0) {
                C869590Y9l c869590Y9l = (C869590Y9l) obj;
                if (!collapseInlineVMLIZ.vQ2(c869590Y9l)) {
                    if (c869590Y9l.getMessageStatus() == C0YUT.RECALLED) {
                        collapseInlineVMLIZ.LLILLJJLI.add(c869590Y9l.getUuid());
                    }
                    arrayList.add(c869590Y9l);
                } else {
                    long index = c869590Y9l.getIndex();
                    Long l = collapseInlineVMLIZ.LL;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = Long.MIN_VALUE;
                    }
                    if (index > jLongValue) {
                        arrayList.add(c869590Y9l);
                    } else {
                        C869590Y9l c869590Y9l2 = (C869590Y9l) C13LP.LJJJLZIJ(i3, list);
                        C869590Y9l c869590Y9l3 = (C869590Y9l) C13LP.LJJJLZIJ(i2 - 1, list);
                        if ((c869590Y9l3 != null && collapseInlineVMLIZ.vQ2(c869590Y9l3)) || (c869590Y9l2 != null && collapseInlineVMLIZ.vQ2(c869590Y9l2))) {
                            String uuid2 = c869590Y9l.getUuid();
                            if (c869590Y9l3 != null) {
                                uuid = c869590Y9l3.getUuid();
                            }
                            Integer num = (Integer) linkedHashMap2.get(uuid);
                            if (num != null) {
                                i = iIntValue;
                                iIntValue = num.intValue();
                            } else {
                                i = iIntValue + 1;
                            }
                            Integer numValueOf = Integer.valueOf(iIntValue);
                            Object linkedHashSet2 = linkedHashMap.get(numValueOf);
                            if (linkedHashSet2 == null) {
                                linkedHashSet2 = new LinkedHashSet();
                                linkedHashMap.put(numValueOf, linkedHashSet2);
                            }
                            ((Set) linkedHashSet2).add(uuid2);
                            linkedHashMap2.put(uuid2, Integer.valueOf(iIntValue));
                            if (!z && !setBuild.contains(uuid2)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            arrayList2.add(c869590Y9l);
                            if (c869590Y9l2 == null || !collapseInlineVMLIZ.vQ2(c869590Y9l2)) {
                                if (z) {
                                    linkedHashSet.add(Integer.valueOf(iIntValue));
                                    arrayList.addAll(arrayList2);
                                    z = false;
                                }
                                arrayList2.clear();
                                long index2 = c869590Y9l.getIndex();
                                FakeMessage.Builder builder = new FakeMessage.Builder();
                                builder.msgType(4009);
                                C869590Y9l c869590Y9lBuild = builder.build();
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("groupId,");
                                sbLIZ.append(iIntValue);
                                c869590Y9lBuild.setUuid(C2188811AlT.LIZIZ(sbLIZ));
                                c869590Y9lBuild.setIndex(index2);
                                arrayList.add(c869590Y9lBuild);
                                collapseInlineVMLIZ.LLILLL.put(Integer.valueOf(iIntValue), Integer.valueOf(arrayList.size() - 1));
                            }
                            iIntValue = i;
                        } else {
                            arrayList.add(c869590Y9l);
                        }
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        collapseInlineVMLIZ.LLILZ = linkedHashSet;
        collapseInlineVMLIZ.LLILZIL = linkedHashMap;
        return arrayList;
    }

    public CollapseInlineProtocol(Fragment fragment, C457780HxI c457780HxI) {
        AssemVMLazy assemVMLazy;
        this.LL = c457780HxI;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CollapseInlineVM.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 591);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(150);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(fragment, true), new C338490DOt(fragment, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 592), aFwS248S0000000_14, new C451460Hn6(fragment, true), new C451620HnM(fragment, true), new C987103tV(fragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(fragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14(fragment, 593), aFwS248S0000000_14, null, null, null);
        } else if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(fragment, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(fragment), C724750Sbp.LJIIIZ(fragment), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) fragment, 594), aFwS248S0000000_14, new C451460Hn6(fragment, false), new C451620HnM(fragment, false), new C987103tV(fragment, false));
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LLILZIL = assemVMLazy;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8 A[PHI: r13
      0x00a8: PHI (r13v1 boolean) = (r13v0 boolean), (r13v5 boolean) binds: [B:27:0x00a5, B:16:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac A[PHI: r13 r14
      0x00ac: PHI (r13v2 boolean) = (r13v1 boolean), (r13v4 boolean) binds: [B:30:0x00a9, B:19:0x0082] A[DONT_GENERATE, DONT_INLINE]
      0x00ac: PHI (r14v1 boolean) = (r14v0 boolean), (r14v3 boolean) binds: [B:30:0x00a9, B:19:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1891350zJl mapToPowerItem(java.util.List r25, X.C869590Y9l r26, int r27) {
        /*
            r24 = this;
            r5 = r26
            java.lang.String r4 = r5.getUuid()
            r1 = 1
            char[] r3 = new char[r1]
            r0 = 44
            r2 = 0
            r3[r2] = r0
            r0 = 6
            java.util.List r0 = kotlin.text.a0.LJJLIIIJ(r4, r3, r2, r2, r0)
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
            r4 = r24
            com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineVM r0 = r4.LIZ()
            java.util.Set<java.lang.Integer> r3 = r0.LLILZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r19 = r3.contains(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineVM r0 = r4.LIZ()
            java.util.Map<java.lang.Integer, ? extends java.util.Set<java.lang.String>> r3 = r0.LLILZIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r3.get(r0)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto Lb0
            int r20 = r0.size()
        L43:
            r3 = r27
            int r0 = r3 + (-1)
            r6 = r25
            java.lang.Object r7 = X.C13LP.LJJJLZIJ(r0, r6)
            X.0Y9l r7 = (X.C869590Y9l) r7
            X.0ZTH r17 = new X.0ZTH
            boolean r10 = X.C0ZDX.LJJIJIL(r5)
            boolean r11 = X.C0ZOT.LIZIZ(r5, r7)
            java.util.Map r0 = r5.getPropertyItemListMap()
            if (r0 == 0) goto Lae
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lae
            r0 = 0
        L66:
            r12 = r0 ^ 1
            if (r7 == 0) goto La4
            boolean r0 = X.C0ZDX.LJJIJIL(r7)
            if (r0 != r1) goto La4
            r13 = 1
        L71:
            long r8 = r5.getSender()
            long r5 = r7.getSender()
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 != 0) goto La8
            r14 = 1
        L7e:
            boolean r0 = X.C0ZDX.LJJJ(r7)
            if (r0 != r1) goto Lac
            r15 = 1
        L85:
            if (r3 != 0) goto La1
            r16 = 1
        L89:
            X.0ZqV r22 = X.C912220ZqW.LIZ(r10, r11, r12, r13, r14, r15, r16)
            X.06Ws r1 = new X.06Ws
            X.0ZTE r0 = new X.0ZTE
            r0.<init>(r4, r2, r3)
            r1.<init>(r0)
            r21 = r3
            r23 = r1
            r18 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23)
            return r17
        La1:
            r16 = 0
            goto L89
        La4:
            r13 = 0
            if (r7 == 0) goto La8
            goto L71
        La8:
            r14 = 0
            if (r7 == 0) goto Lac
            goto L7e
        Lac:
            r15 = 0
            goto L85
        Lae:
            r0 = 1
            goto L66
        Lb0:
            r20 = -1
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineProtocol.mapToPowerItem(java.util.List, X.0Y9l, int):X.0zJl");
    }
}
