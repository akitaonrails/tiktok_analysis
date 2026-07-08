package com.ss.android.ugc.aweme.im.b2c.pendingmessage;

import X.AbstractC738140SxQ;
import X.C051M;
import X.C0IC5;
import X.C0Y8T;
import X.C0YHX;
import X.C0YM2;
import X.C0YNP;
import X.C0YOY;
import X.C0YOZ;
import X.C0YP2;
import X.C0YTK;
import X.C0YTZ;
import X.C0ZDT;
import X.C123100dR;
import X.C1265504xJ;
import X.C1440005kM;
import X.C1559260qg8;
import X.C1742306s1;
import X.C455040Hss;
import X.C457780HxI;
import X.C459930I1v;
import X.C723580SZw;
import X.C874730YTf;
import X.C874770YTj;
import X.C874780YTk;
import X.C874810YTn;
import X.C875420YVw;
import X.C877840YcA;
import X.C889370Yul;
import X.C889400Yuo;
import X.C901060ZWm;
import X.C909290Zln;
import X.InterfaceC1742406s2;
import X.InterfaceC1743406sC;
import android.util.SparseArray;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes15.dex */
public final class PendingMessageSendAssem extends AbstractC738140SxQ implements InterfaceC1743406sC {
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public C889370Yul LLILLJJLI;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final C909290Zln m230do() {
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        SessionInfo sessionInfo = c457780HxI != null ? c457780HxI.LL : null;
        if (sessionInfo instanceof C909290Zln) {
            return (C909290Zln) sessionInfo;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.06s2, X.0Yul] */
    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        String conversationId;
        super.onCreate();
        if (!C455040Hss.LIZ()) {
            CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
            C874810YTn.LIZ.add(this);
            return;
        }
        C909290Zln c909290ZlnM230do = m230do();
        if (c909290ZlnM230do == null || (conversationId = c909290ZlnM230do.getConversationId()) == null || conversationId.length() == 0) {
            return;
        }
        ?? r0 = new InterfaceC1742406s2() { // from class: X.0Yul
            @Override // X.InterfaceC1742406s2
            public final Object LIZ(Map<String, String> map, Map<String, String> map2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                this.LIZ.fo(map2);
                return Unit.LIZ;
            }
        };
        this.LLILLJJLI = r0;
        C1742306s1.LIZ(conversationId, r0);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (!C455040Hss.LIZ()) {
            CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
            C874810YTn.LIZ.remove(this);
            return;
        }
        C909290Zln c909290ZlnM230do = m230do();
        String conversationId = c909290ZlnM230do != null ? c909290ZlnM230do.getConversationId() : null;
        C889370Yul c889370Yul = this.LLILLJJLI;
        if (c889370Yul != null && conversationId != null && conversationId.length() != 0) {
            C1742306s1.LIZIZ(conversationId, c889370Yul);
        }
        this.LLILLJJLI = null;
    }

    public final void fo(Map<String, String> map) {
        Map map2;
        Map<String, String> linkedHashMap;
        int i;
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        final C909290Zln c909290ZlnM230do = m230do();
        if (c909290ZlnM230do != null) {
            try {
                map2 = (Map) new Gson().LJIIIIZZ(c909290ZlnM230do.getAutoQuotedMessageContentInfoMap(), new TypeToken<Map<String, ? extends String>>() { // from class: X.0Yum
                }.getType());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                map2 = null;
            }
            if (c909290ZlnM230do.getEntranceType() == 10 && C123100dR.LIZ(c909290ZlnM230do.getAutoQuotedMessageContentInfoMap())) {
                map.put("a:landing_msg_type", "comment_proactive_message");
            }
            c909290ZlnM230do.setAutoQuotedMessageContentInfoMap(null);
            if (map2 != null) {
                C0ZDT.LIZ.getClass();
                Map mapLJFF = C0ZDT.LJFF(null, null, c909290ZlnM230do, null, null);
                try {
                    linkedHashMap = (Map) new Gson().LJIIIIZZ((String) map2.get("msg_ext"), new TypeToken<Map<String, String>>() { // from class: X.0Yun
                    }.getType());
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap<>();
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    linkedHashMap = new LinkedHashMap<>();
                }
                String str = (String) map2.get("msg_content");
                if (str == null) {
                    str = "";
                }
                String str2 = (String) map2.get("msg_type");
                if (str2 != null) {
                    i = CastIntegerProtector.parseInt(str2);
                } else {
                    i = -1;
                }
                BaseContent contentByMsgType = BaseContentParserKt.getContentByMsgType(str, i);
                if (C455040Hss.LIZ()) {
                    if (contentByMsgType != null) {
                        C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                        IIMCoreProxyService.LIZ.getClass();
                        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
                        if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                            c0yozLJFF.LJI(new C0YP2(new C1265504xJ(c909290ZlnM230do.getConversationId()), C877840YcA.LIZ(contentByMsgType), new C459930I1v(C051M.LJ(contentByMsgType, false)), null, null, linkedHashMap, null, null, null, C901060ZWm.LJ(mapLJFF), null, null, 15832), new C0IC5(null, 3), new C0YOY() { // from class: X.0Yuk
                                @Override // X.C0YOY
                                public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                    if (interfaceC873750YPl instanceof C0YPL) {
                                        this.LIZ.bo(c909290ZlnM230do.getEntranceType(), ((C0YPL) interfaceC873750YPl).LIZ);
                                    } else {
                                        if (!(interfaceC873750YPl instanceof C0YQ0)) {
                                            return;
                                        }
                                        this.LIZ.bo(c909290ZlnM230do.getEntranceType(), ((C0YQ0) interfaceC873750YPl).LIZ);
                                    }
                                }
                            });
                            return;
                        } else {
                            bo(c909290ZlnM230do.getEntranceType(), null);
                            return;
                        }
                    }
                    return;
                }
                CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                c874730YTfLIZ.LIZIZ.LJFF = c909290ZlnM230do.getConversationId();
                c874730YTfLIZ.LIZIZ(contentByMsgType);
                SparseArray<Object> sparseArrayLJ = C901060ZWm.LJ(mapLJFF);
                C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
                c0ytz.LJIILL = sparseArrayLJ;
                c0ytz.LJIIIZ = linkedHashMap;
                c874730YTfLIZ.LJFF(new C0YTK() { // from class: X.0Yuj
                    @Override // X.C0YTY
                    public final void LIZJ(C0Y8T c0y8t, List<? extends C869590Y9l> list) {
                    }

                    @Override // X.C0YTK
                    public final void LIZLLL(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    }

                    @Override // X.C0YTK
                    public final void LJ(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    }

                    @Override // X.C0YTY
                    public final void LJI(C0Y8T c0y8t, C869590Y9l c869590Y9l) {
                    }

                    @Override // X.C0YTK
                    public final void LJII(C0Y8T c0y8t, C869590Y9l c869590Y9l, C0YMW c0ymw) {
                    }

                    @Override // X.C0YTK
                    public final void LIZIZ(C0Y8T c0y8t, List<C869590Y9l> list, Map<C869590Y9l, C0YMW> map3) {
                        this.LIZ.bo(c909290ZlnM230do.getEntranceType(), c0y8t);
                    }
                });
            }
        }
    }

    public final void bo(int i, C0Y8T c0y8t) {
        String conversationId;
        if (c0y8t == null || (conversationId = c0y8t.getConversationId()) == null) {
            C909290Zln c909290ZlnM230do = m230do();
            if (c909290ZlnM230do != null) {
                conversationId = c909290ZlnM230do.getConversationId();
            } else {
                conversationId = "";
            }
        }
        if (i != 10 || conversationId.length() == 0) {
            return;
        }
        C1440005kM.LIZ(new C889400Yuo(String.valueOf(C0YNP.LJII(conversationId))));
    }

    @Override // X.InterfaceC1743406sC
    public final Object TX0(String str, Map map, Map map2, C874770YTj c874770YTj) {
        fo(map2);
        return Unit.LIZ;
    }
}
