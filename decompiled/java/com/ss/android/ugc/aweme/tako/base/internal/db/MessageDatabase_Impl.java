package com.ss.android.ugc.aweme.tako.base.internal.db;

import X.AbstractC796510VMj;
import X.C0VKN;
import X.C0VLF;
import X.C0VN2;
import X.C0VN3;
import X.C796520VMk;
import X.C796620VMu;
import X.C801350Vc5;
import X.InterfaceC1863480yao;
import X.InterfaceC2275591E5d;
import X.InterfaceC796190VLd;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoDisclaimerInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class MessageDatabase_Impl extends MessageDatabase {
    public volatile C801350Vc5 LLILLJJLI;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Vc5] */
    @Override // com.ss.android.ugc.aweme.tako.base.internal.db.MessageDatabase
    public final InterfaceC1863480yao LIZ() {
        C801350Vc5 c801350Vc5;
        if (this.LLILLJJLI != null) {
            return this.LLILLJJLI;
        }
        synchronized (this) {
            try {
                if (this.LLILLJJLI == null) {
                    this.LLILLJJLI = new InterfaceC1863480yao(this) { // from class: X.0Vc5
                        public final AbstractC796540VMm LIZ;
                        public final C1864570ycZ LIZIZ;
                        public final C854570Xfj LIZJ;
                        public final C1864570ycZ LIZLLL;
                        public final C801360Vc6 LJ;
                        public final C1862410yZ5 LJFF;
                        public final C854550Xfh LJI;
                        public final C854550Xfh LJII;

                        @Override // X.InterfaceC1863480yao
                        public final List<C1863840ybO> LJIILLIIL() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(0, "SELECT * FROM CONFIG_NEW");
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "TIK_BOT_CONVERSATION_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_CURSOR");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SHOWED_DISCLAIMER_POPUP");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "ACCEPTED_DISCLAIMER_POPUP");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "DISCLAIMER_POPUP_TYPE");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SHOWED_MEMORY_GUIDE_POPUP");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "SWITCH_STATUS");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "USER_SEND");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_ID");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_SOURCE");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "SHOWED_LANGUAGE_STYLE_GUIDE_POPUP");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    arrayList.add(new C1863840ybO(cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ), cursorLIZIZ.getLong(iLIZIZ2), cursorLIZIZ.getInt(iLIZIZ3) != 0, cursorLIZIZ.getInt(iLIZIZ4) != 0, cursorLIZIZ.getInt(iLIZIZ5), cursorLIZIZ.getInt(iLIZIZ6) != 0, cursorLIZIZ.isNull(iLIZIZ7) ? null : cursorLIZIZ.getString(iLIZIZ7), cursorLIZIZ.getInt(iLIZIZ8) != 0, cursorLIZIZ.getLong(iLIZIZ9), cursorLIZIZ.getInt(iLIZIZ10), cursorLIZIZ.getInt(iLIZIZ11) != 0));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List LJIJ() {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM CONVERSATION_NEW WHERE STATUS = ?");
                            c0vn5LIZLLL.LJIJ(1, 1);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "STATUS");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "HISTORY_CURSOR");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_CURSOR");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "TITLE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "UNREAD_COUNT");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "LATEST_MESSAGE_TIME");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "RELATED_VIDEO");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string = null;
                                    String string2 = cursorLIZIZ.isNull(iLIZIZ) ? null : cursorLIZIZ.getString(iLIZIZ);
                                    String string3 = cursorLIZIZ.isNull(iLIZIZ2) ? null : cursorLIZIZ.getString(iLIZIZ2);
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    long j = cursorLIZIZ.getLong(iLIZIZ4);
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ5);
                                    String string4 = cursorLIZIZ.isNull(iLIZIZ6) ? null : cursorLIZIZ.getString(iLIZIZ6);
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ7);
                                    long j4 = cursorLIZIZ.getLong(iLIZIZ8);
                                    if (!cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    arrayList.add(new C801390Vc9(i, j, j2, j3, j4, string2, string3, string4, string));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [X.0Vc6] */
                        /* JADX WARN: Type inference failed for: r0v4, types: [X.0yZ5] */
                        /* JADX WARN: Type inference failed for: r1v0, types: [X.0ycZ] */
                        /* JADX WARN: Type inference failed for: r1v2, types: [X.0ycZ] */
                        {
                            this.LIZ = this;
                            final int i = 0;
                            this.LIZIZ = new AbstractC796330VLr(this, i) { // from class: X.0ycZ
                                public final int $t;

                                public static final String createQuery$0(C1864570ycZ c1864570ycZ) {
                                    return "INSERT OR REPLACE INTO `CONFIG_NEW` (`TIK_BOT_CONVERSATION_ID`,`MESSAGE_CURSOR`,`SHOWED_DISCLAIMER_POPUP`,`ACCEPTED_DISCLAIMER_POPUP`,`DISCLAIMER_POPUP_TYPE`,`SHOWED_MEMORY_GUIDE_POPUP`,`SWITCH_STATUS`,`USER_SEND`,`BOT_ID`,`BOT_SOURCE`,`SHOWED_LANGUAGE_STYLE_GUIDE_POPUP`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                public static final String createQuery$1(C1864570ycZ c1864570ycZ) {
                                    return "INSERT OR REPLACE INTO `MESSAGE` (`UUID`,`MESSAGE_ID`,`SERVER_SEQ`,`SUB_SERVER_SEQ`,`CONVERSATION_ID`,`SUB_CONVERSATION_ID`,`SUB_SESSION_ID`,`BOT_ID`,`ACTION_ID`,`CLIENT_STATUS`,`MESSAGE_TYPE`,`SENDER_TYPE`,`SENDER_BOT_ID`,`SENDER_USER_ID`,`SENDER_IS_SELF`,`SERVER_TIME`,`CLIENT_SEQ`,`MESSAGE_SESSION_ID`,`VERSION`,`BODY`,`MULTI_BODY`,`IS_MULTI_ANSWER`,`SELECTED_ANSWER_INDEX`,`IS_DEGRADED`,`SERVER_STATUS`,`EXT_LOG`,`EXT_ACTIVE_ACTION_BAR`,`EXT_ACTIVE_TEMPLATE_TYPE`,`EXT_HASHTAGS`,`EXT_ACTIVE_AI_IMAGE_ACTION_BAR`,`EXT_IMAGE_SHORTCUT_KEY`,`RETRY_TIME`,`REPLY_UUID`,`REPLY_MESSAGE_ID`,`READ`,`CHANNEL`,`UPDATE_ACTION`,`LYNX_DATE`,`PUSH_RECEIVE_TIME`,`THINK_INFO_EXPANDED`,`GEN_STYLE`,`VERSION_ID`,`VERSION_SEQ_ID`,`IS_HIDDEN`,`RETRIED`,`HIDE_PUSH_MESSAGE_BUTTON`,`MODE_SOURCE`,`AIGC_STANDARD_RATIO`,`INPUT_SKILL_MODE`,`IMAGE_TEMPLATE_ID`,`IMAGE_TAB_ID`,`IMAGE_TEMPLATE_TAB`,`IMAGE_STYLE_NAME`,`EDIT_INFO`,`REFERENCE_INFO`,`IS_PUSH_MSG`,`IS_UNCHANGED_TAKO_TEMPLATE`,`IS_REGEN_DEPRECATED`,`IMAGE_TEMPLATE_INFO`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, Object obj) {
                                    switch (this.$t) {
                                        case 0:
                                            bind$0(this, interfaceC796340VLs, obj);
                                            break;
                                        case 1:
                                            bind$1(this, interfaceC796340VLs, obj);
                                            break;
                                        default:
                                            super.bind(interfaceC796340VLs, obj);
                                            break;
                                    }
                                }

                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    switch (this.$t) {
                                        case 0:
                                            return createQuery$0(this);
                                        case 1:
                                            return createQuery$1(this);
                                        default:
                                            return super.createQuery();
                                    }
                                }

                                {
                                    this.$t = i;
                                }

                                public static final void bind$0(C1864570ycZ c1864570ycZ, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
                                    C1863840ybO c1863840ybO = (C1863840ybO) obj;
                                    String str = c1863840ybO.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    interfaceC796340VLs.LJIJ(2, c1863840ybO.LIZIZ);
                                    interfaceC796340VLs.LJIJ(3, c1863840ybO.LIZJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(4, c1863840ybO.LIZLLL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(5, c1863840ybO.LJ);
                                    interfaceC796340VLs.LJIJ(6, c1863840ybO.LJFF ? 1L : 0L);
                                    String str2 = c1863840ybO.LJI;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(8, c1863840ybO.LJII ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(9, c1863840ybO.LJIIIIZZ);
                                    interfaceC796340VLs.LJIJ(10, c1863840ybO.LJIIIZ);
                                    interfaceC796340VLs.LJIJ(11, c1863840ybO.LJIIJ ? 1L : 0L);
                                }

                                public static final void bind$1(C1864570ycZ c1864570ycZ, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
                                    Integer numValueOf;
                                    C1862400yZ4 c1862400yZ4 = (C1862400yZ4) obj;
                                    String str = c1862400yZ4.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c1862400yZ4.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(3, c1862400yZ4.LIZJ);
                                    interfaceC796340VLs.LJIJ(4, c1862400yZ4.LIZLLL);
                                    String str3 = c1862400yZ4.LJ;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str3);
                                    }
                                    String str4 = c1862400yZ4.LJFF;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str4);
                                    }
                                    String str5 = c1862400yZ4.LJI;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str5);
                                    }
                                    interfaceC796340VLs.LJIJ(8, c1862400yZ4.LJII);
                                    interfaceC796340VLs.LJIJ(9, c1862400yZ4.LJIIIIZZ);
                                    interfaceC796340VLs.LJIJ(10, c1862400yZ4.LJIIIZ);
                                    interfaceC796340VLs.LJIJ(11, c1862400yZ4.LJIIJ);
                                    interfaceC796340VLs.LJIJ(12, c1862400yZ4.LJIIJJI);
                                    interfaceC796340VLs.LJIJ(13, c1862400yZ4.LJIIL);
                                    interfaceC796340VLs.LJIJ(14, c1862400yZ4.LJIILIIL);
                                    interfaceC796340VLs.LJIJ(15, c1862400yZ4.LJIILJJIL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(16, c1862400yZ4.LJIILL);
                                    interfaceC796340VLs.LJIJ(17, c1862400yZ4.LJIILLIIL);
                                    String str6 = c1862400yZ4.LJIIZILJ;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(18);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(18, str6);
                                    }
                                    interfaceC796340VLs.LJIJ(19, c1862400yZ4.LJIJ);
                                    String str7 = c1862400yZ4.LJIJI;
                                    if (str7 == null) {
                                        interfaceC796340VLs.LLD(20);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(20, str7);
                                    }
                                    String str8 = c1862400yZ4.LJIJJ;
                                    if (str8 == null) {
                                        interfaceC796340VLs.LLD(21);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(21, str8);
                                    }
                                    interfaceC796340VLs.LJIJ(22, c1862400yZ4.LJIJJLI ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(23, c1862400yZ4.LJIL);
                                    interfaceC796340VLs.LJIJ(24, c1862400yZ4.LJJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(25, c1862400yZ4.LJJI);
                                    interfaceC796340VLs.LJIJ(26, c1862400yZ4.LJJIFFI);
                                    interfaceC796340VLs.LJIJ(27, c1862400yZ4.LJJII);
                                    if (c1862400yZ4.LJJIII == null) {
                                        interfaceC796340VLs.LLD(28);
                                    } else {
                                        interfaceC796340VLs.LJIJ(28, r0.intValue());
                                    }
                                    String str9 = c1862400yZ4.LJJIIJ;
                                    if (str9 == null) {
                                        interfaceC796340VLs.LLD(29);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(29, str9);
                                    }
                                    interfaceC796340VLs.LJIJ(30, c1862400yZ4.LJJIIJZLJL);
                                    String str10 = c1862400yZ4.LJJIIZ;
                                    if (str10 == null) {
                                        interfaceC796340VLs.LLD(31);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(31, str10);
                                    }
                                    interfaceC796340VLs.LJIJ(32, c1862400yZ4.LJJIIZI);
                                    String str11 = c1862400yZ4.LJJIJ;
                                    if (str11 == null) {
                                        interfaceC796340VLs.LLD(33);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(33, str11);
                                    }
                                    String str12 = c1862400yZ4.LJJIJIIJI;
                                    if (str12 == null) {
                                        interfaceC796340VLs.LLD(34);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(34, str12);
                                    }
                                    interfaceC796340VLs.LJIJ(35, c1862400yZ4.LJJIJIIJIL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(36, c1862400yZ4.LJJIJIL);
                                    String str13 = c1862400yZ4.LJJIJL;
                                    if (str13 == null) {
                                        interfaceC796340VLs.LLD(37);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(37, str13);
                                    }
                                    String str14 = c1862400yZ4.LJJIJLIJ;
                                    if (str14 == null) {
                                        interfaceC796340VLs.LLD(38);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(38, str14);
                                    }
                                    interfaceC796340VLs.LJIJ(39, c1862400yZ4.LJJIL);
                                    Boolean bool = c1862400yZ4.LJJIZ;
                                    if (bool == null) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                                    }
                                    if (numValueOf == null) {
                                        interfaceC796340VLs.LLD(40);
                                    } else {
                                        interfaceC796340VLs.LJIJ(40, numValueOf.intValue());
                                    }
                                    interfaceC796340VLs.LJIJ(41, c1862400yZ4.LJJJ);
                                    String str15 = c1862400yZ4.LJJJI;
                                    if (str15 == null) {
                                        interfaceC796340VLs.LLD(42);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(42, str15);
                                    }
                                    interfaceC796340VLs.LJIJ(43, c1862400yZ4.LJJJIL);
                                    interfaceC796340VLs.LJIJ(44, c1862400yZ4.LJJJJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(45, c1862400yZ4.LJJJJI);
                                    interfaceC796340VLs.LJIJ(46, c1862400yZ4.LJJJJIZL);
                                    String str16 = c1862400yZ4.LJJJJJ;
                                    if (str16 == null) {
                                        interfaceC796340VLs.LLD(47);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(47, str16);
                                    }
                                    if (c1862400yZ4.LJJJJJL == null) {
                                        interfaceC796340VLs.LLD(48);
                                    } else {
                                        interfaceC796340VLs.LJIJ(48, r0.intValue());
                                    }
                                    String str17 = c1862400yZ4.LJJJJL;
                                    if (str17 == null) {
                                        interfaceC796340VLs.LLD(49);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(49, str17);
                                    }
                                    String str18 = c1862400yZ4.LJJJJLI;
                                    if (str18 == null) {
                                        interfaceC796340VLs.LLD(50);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(50, str18);
                                    }
                                    String str19 = c1862400yZ4.LJJJJLL;
                                    if (str19 == null) {
                                        interfaceC796340VLs.LLD(51);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(51, str19);
                                    }
                                    String str20 = c1862400yZ4.LJJJJZ;
                                    if (str20 == null) {
                                        interfaceC796340VLs.LLD(52);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(52, str20);
                                    }
                                    String str21 = c1862400yZ4.LJJJJZI;
                                    if (str21 == null) {
                                        interfaceC796340VLs.LLD(53);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(53, str21);
                                    }
                                    String str22 = c1862400yZ4.LJJJLIIL;
                                    if (str22 == null) {
                                        interfaceC796340VLs.LLD(54);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(54, str22);
                                    }
                                    String str23 = c1862400yZ4.LJJJLL;
                                    if (str23 == null) {
                                        interfaceC796340VLs.LLD(55);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(55, str23);
                                    }
                                    interfaceC796340VLs.LJIJ(56, c1862400yZ4.LJJJLZIJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(57, c1862400yZ4.LJJJZ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(58, c1862400yZ4.LJJL ? 1L : 0L);
                                    String str24 = c1862400yZ4.LJJLI;
                                    if (str24 == null) {
                                        interfaceC796340VLs.LLD(59);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(59, str24);
                                    }
                                }
                            };
                            this.LIZJ = new C854570Xfj(this, 28);
                            final int i2 = 1;
                            this.LIZLLL = new AbstractC796330VLr(this, i2) { // from class: X.0ycZ
                                public final int $t;

                                public static final String createQuery$0(C1864570ycZ c1864570ycZ) {
                                    return "INSERT OR REPLACE INTO `CONFIG_NEW` (`TIK_BOT_CONVERSATION_ID`,`MESSAGE_CURSOR`,`SHOWED_DISCLAIMER_POPUP`,`ACCEPTED_DISCLAIMER_POPUP`,`DISCLAIMER_POPUP_TYPE`,`SHOWED_MEMORY_GUIDE_POPUP`,`SWITCH_STATUS`,`USER_SEND`,`BOT_ID`,`BOT_SOURCE`,`SHOWED_LANGUAGE_STYLE_GUIDE_POPUP`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                public static final String createQuery$1(C1864570ycZ c1864570ycZ) {
                                    return "INSERT OR REPLACE INTO `MESSAGE` (`UUID`,`MESSAGE_ID`,`SERVER_SEQ`,`SUB_SERVER_SEQ`,`CONVERSATION_ID`,`SUB_CONVERSATION_ID`,`SUB_SESSION_ID`,`BOT_ID`,`ACTION_ID`,`CLIENT_STATUS`,`MESSAGE_TYPE`,`SENDER_TYPE`,`SENDER_BOT_ID`,`SENDER_USER_ID`,`SENDER_IS_SELF`,`SERVER_TIME`,`CLIENT_SEQ`,`MESSAGE_SESSION_ID`,`VERSION`,`BODY`,`MULTI_BODY`,`IS_MULTI_ANSWER`,`SELECTED_ANSWER_INDEX`,`IS_DEGRADED`,`SERVER_STATUS`,`EXT_LOG`,`EXT_ACTIVE_ACTION_BAR`,`EXT_ACTIVE_TEMPLATE_TYPE`,`EXT_HASHTAGS`,`EXT_ACTIVE_AI_IMAGE_ACTION_BAR`,`EXT_IMAGE_SHORTCUT_KEY`,`RETRY_TIME`,`REPLY_UUID`,`REPLY_MESSAGE_ID`,`READ`,`CHANNEL`,`UPDATE_ACTION`,`LYNX_DATE`,`PUSH_RECEIVE_TIME`,`THINK_INFO_EXPANDED`,`GEN_STYLE`,`VERSION_ID`,`VERSION_SEQ_ID`,`IS_HIDDEN`,`RETRIED`,`HIDE_PUSH_MESSAGE_BUTTON`,`MODE_SOURCE`,`AIGC_STANDARD_RATIO`,`INPUT_SKILL_MODE`,`IMAGE_TEMPLATE_ID`,`IMAGE_TAB_ID`,`IMAGE_TEMPLATE_TAB`,`IMAGE_STYLE_NAME`,`EDIT_INFO`,`REFERENCE_INFO`,`IS_PUSH_MSG`,`IS_UNCHANGED_TAKO_TEMPLATE`,`IS_REGEN_DEPRECATED`,`IMAGE_TEMPLATE_INFO`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                                }

                                @Override // X.AbstractC796330VLr
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, Object obj) {
                                    switch (this.$t) {
                                        case 0:
                                            bind$0(this, interfaceC796340VLs, obj);
                                            break;
                                        case 1:
                                            bind$1(this, interfaceC796340VLs, obj);
                                            break;
                                        default:
                                            super.bind(interfaceC796340VLs, obj);
                                            break;
                                    }
                                }

                                @Override // X.AbstractC795470VIj
                                public final String createQuery() {
                                    switch (this.$t) {
                                        case 0:
                                            return createQuery$0(this);
                                        case 1:
                                            return createQuery$1(this);
                                        default:
                                            return super.createQuery();
                                    }
                                }

                                {
                                    this.$t = i2;
                                }

                                public static final void bind$0(C1864570ycZ c1864570ycZ, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
                                    C1863840ybO c1863840ybO = (C1863840ybO) obj;
                                    String str = c1863840ybO.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    interfaceC796340VLs.LJIJ(2, c1863840ybO.LIZIZ);
                                    interfaceC796340VLs.LJIJ(3, c1863840ybO.LIZJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(4, c1863840ybO.LIZLLL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(5, c1863840ybO.LJ);
                                    interfaceC796340VLs.LJIJ(6, c1863840ybO.LJFF ? 1L : 0L);
                                    String str2 = c1863840ybO.LJI;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(8, c1863840ybO.LJII ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(9, c1863840ybO.LJIIIIZZ);
                                    interfaceC796340VLs.LJIJ(10, c1863840ybO.LJIIIZ);
                                    interfaceC796340VLs.LJIJ(11, c1863840ybO.LJIIJ ? 1L : 0L);
                                }

                                public static final void bind$1(C1864570ycZ c1864570ycZ, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
                                    Integer numValueOf;
                                    C1862400yZ4 c1862400yZ4 = (C1862400yZ4) obj;
                                    String str = c1862400yZ4.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c1862400yZ4.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(3, c1862400yZ4.LIZJ);
                                    interfaceC796340VLs.LJIJ(4, c1862400yZ4.LIZLLL);
                                    String str3 = c1862400yZ4.LJ;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str3);
                                    }
                                    String str4 = c1862400yZ4.LJFF;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str4);
                                    }
                                    String str5 = c1862400yZ4.LJI;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str5);
                                    }
                                    interfaceC796340VLs.LJIJ(8, c1862400yZ4.LJII);
                                    interfaceC796340VLs.LJIJ(9, c1862400yZ4.LJIIIIZZ);
                                    interfaceC796340VLs.LJIJ(10, c1862400yZ4.LJIIIZ);
                                    interfaceC796340VLs.LJIJ(11, c1862400yZ4.LJIIJ);
                                    interfaceC796340VLs.LJIJ(12, c1862400yZ4.LJIIJJI);
                                    interfaceC796340VLs.LJIJ(13, c1862400yZ4.LJIIL);
                                    interfaceC796340VLs.LJIJ(14, c1862400yZ4.LJIILIIL);
                                    interfaceC796340VLs.LJIJ(15, c1862400yZ4.LJIILJJIL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(16, c1862400yZ4.LJIILL);
                                    interfaceC796340VLs.LJIJ(17, c1862400yZ4.LJIILLIIL);
                                    String str6 = c1862400yZ4.LJIIZILJ;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(18);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(18, str6);
                                    }
                                    interfaceC796340VLs.LJIJ(19, c1862400yZ4.LJIJ);
                                    String str7 = c1862400yZ4.LJIJI;
                                    if (str7 == null) {
                                        interfaceC796340VLs.LLD(20);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(20, str7);
                                    }
                                    String str8 = c1862400yZ4.LJIJJ;
                                    if (str8 == null) {
                                        interfaceC796340VLs.LLD(21);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(21, str8);
                                    }
                                    interfaceC796340VLs.LJIJ(22, c1862400yZ4.LJIJJLI ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(23, c1862400yZ4.LJIL);
                                    interfaceC796340VLs.LJIJ(24, c1862400yZ4.LJJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(25, c1862400yZ4.LJJI);
                                    interfaceC796340VLs.LJIJ(26, c1862400yZ4.LJJIFFI);
                                    interfaceC796340VLs.LJIJ(27, c1862400yZ4.LJJII);
                                    if (c1862400yZ4.LJJIII == null) {
                                        interfaceC796340VLs.LLD(28);
                                    } else {
                                        interfaceC796340VLs.LJIJ(28, r0.intValue());
                                    }
                                    String str9 = c1862400yZ4.LJJIIJ;
                                    if (str9 == null) {
                                        interfaceC796340VLs.LLD(29);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(29, str9);
                                    }
                                    interfaceC796340VLs.LJIJ(30, c1862400yZ4.LJJIIJZLJL);
                                    String str10 = c1862400yZ4.LJJIIZ;
                                    if (str10 == null) {
                                        interfaceC796340VLs.LLD(31);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(31, str10);
                                    }
                                    interfaceC796340VLs.LJIJ(32, c1862400yZ4.LJJIIZI);
                                    String str11 = c1862400yZ4.LJJIJ;
                                    if (str11 == null) {
                                        interfaceC796340VLs.LLD(33);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(33, str11);
                                    }
                                    String str12 = c1862400yZ4.LJJIJIIJI;
                                    if (str12 == null) {
                                        interfaceC796340VLs.LLD(34);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(34, str12);
                                    }
                                    interfaceC796340VLs.LJIJ(35, c1862400yZ4.LJJIJIIJIL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(36, c1862400yZ4.LJJIJIL);
                                    String str13 = c1862400yZ4.LJJIJL;
                                    if (str13 == null) {
                                        interfaceC796340VLs.LLD(37);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(37, str13);
                                    }
                                    String str14 = c1862400yZ4.LJJIJLIJ;
                                    if (str14 == null) {
                                        interfaceC796340VLs.LLD(38);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(38, str14);
                                    }
                                    interfaceC796340VLs.LJIJ(39, c1862400yZ4.LJJIL);
                                    Boolean bool = c1862400yZ4.LJJIZ;
                                    if (bool == null) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                                    }
                                    if (numValueOf == null) {
                                        interfaceC796340VLs.LLD(40);
                                    } else {
                                        interfaceC796340VLs.LJIJ(40, numValueOf.intValue());
                                    }
                                    interfaceC796340VLs.LJIJ(41, c1862400yZ4.LJJJ);
                                    String str15 = c1862400yZ4.LJJJI;
                                    if (str15 == null) {
                                        interfaceC796340VLs.LLD(42);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(42, str15);
                                    }
                                    interfaceC796340VLs.LJIJ(43, c1862400yZ4.LJJJIL);
                                    interfaceC796340VLs.LJIJ(44, c1862400yZ4.LJJJJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(45, c1862400yZ4.LJJJJI);
                                    interfaceC796340VLs.LJIJ(46, c1862400yZ4.LJJJJIZL);
                                    String str16 = c1862400yZ4.LJJJJJ;
                                    if (str16 == null) {
                                        interfaceC796340VLs.LLD(47);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(47, str16);
                                    }
                                    if (c1862400yZ4.LJJJJJL == null) {
                                        interfaceC796340VLs.LLD(48);
                                    } else {
                                        interfaceC796340VLs.LJIJ(48, r0.intValue());
                                    }
                                    String str17 = c1862400yZ4.LJJJJL;
                                    if (str17 == null) {
                                        interfaceC796340VLs.LLD(49);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(49, str17);
                                    }
                                    String str18 = c1862400yZ4.LJJJJLI;
                                    if (str18 == null) {
                                        interfaceC796340VLs.LLD(50);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(50, str18);
                                    }
                                    String str19 = c1862400yZ4.LJJJJLL;
                                    if (str19 == null) {
                                        interfaceC796340VLs.LLD(51);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(51, str19);
                                    }
                                    String str20 = c1862400yZ4.LJJJJZ;
                                    if (str20 == null) {
                                        interfaceC796340VLs.LLD(52);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(52, str20);
                                    }
                                    String str21 = c1862400yZ4.LJJJJZI;
                                    if (str21 == null) {
                                        interfaceC796340VLs.LLD(53);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(53, str21);
                                    }
                                    String str22 = c1862400yZ4.LJJJLIIL;
                                    if (str22 == null) {
                                        interfaceC796340VLs.LLD(54);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(54, str22);
                                    }
                                    String str23 = c1862400yZ4.LJJJLL;
                                    if (str23 == null) {
                                        interfaceC796340VLs.LLD(55);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(55, str23);
                                    }
                                    interfaceC796340VLs.LJIJ(56, c1862400yZ4.LJJJLZIJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(57, c1862400yZ4.LJJJZ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(58, c1862400yZ4.LJJL ? 1L : 0L);
                                    String str24 = c1862400yZ4.LJJLI;
                                    if (str24 == null) {
                                        interfaceC796340VLs.LLD(59);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(59, str24);
                                    }
                                }
                            };
                            this.LJ = new AbstractC796320VLq<C801390Vc9>(this) { // from class: X.0Vc6
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR ABORT `CONVERSATION_NEW` SET `CONVERSATION_ID` = ?,`SUB_CONVERSATION_ID` = ?,`STATUS` = ?,`HISTORY_CURSOR` = ?,`READ_CURSOR` = ?,`TITLE` = ?,`UNREAD_COUNT` = ?,`LATEST_MESSAGE_TIME` = ?,`RELATED_VIDEO` = ? WHERE `CONVERSATION_ID` = ? AND `SUB_CONVERSATION_ID` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C801390Vc9 c801390Vc9) {
                                    C801390Vc9 c801390Vc92 = c801390Vc9;
                                    String str = c801390Vc92.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c801390Vc92.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(3, c801390Vc92.LIZJ);
                                    interfaceC796340VLs.LJIJ(4, c801390Vc92.LIZLLL);
                                    interfaceC796340VLs.LJIJ(5, c801390Vc92.LJ);
                                    String str3 = c801390Vc92.LJFF;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str3);
                                    }
                                    interfaceC796340VLs.LJIJ(7, c801390Vc92.LJI);
                                    interfaceC796340VLs.LJIJ(8, c801390Vc92.LJII);
                                    String str4 = c801390Vc92.LJIIIIZZ;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(9);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(9, str4);
                                    }
                                    String str5 = c801390Vc92.LIZ;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(10);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(10, str5);
                                    }
                                    String str6 = c801390Vc92.LIZIZ;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(11);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(11, str6);
                                    }
                                }
                            };
                            this.LJFF = new AbstractC796320VLq<C1862400yZ4>(this) { // from class: X.0yZ5
                                @Override // X.AbstractC796320VLq, X.AbstractC795470VIj
                                public final String createQuery() {
                                    return "UPDATE OR ABORT `MESSAGE` SET `UUID` = ?,`MESSAGE_ID` = ?,`SERVER_SEQ` = ?,`SUB_SERVER_SEQ` = ?,`CONVERSATION_ID` = ?,`SUB_CONVERSATION_ID` = ?,`SUB_SESSION_ID` = ?,`BOT_ID` = ?,`ACTION_ID` = ?,`CLIENT_STATUS` = ?,`MESSAGE_TYPE` = ?,`SENDER_TYPE` = ?,`SENDER_BOT_ID` = ?,`SENDER_USER_ID` = ?,`SENDER_IS_SELF` = ?,`SERVER_TIME` = ?,`CLIENT_SEQ` = ?,`MESSAGE_SESSION_ID` = ?,`VERSION` = ?,`BODY` = ?,`MULTI_BODY` = ?,`IS_MULTI_ANSWER` = ?,`SELECTED_ANSWER_INDEX` = ?,`IS_DEGRADED` = ?,`SERVER_STATUS` = ?,`EXT_LOG` = ?,`EXT_ACTIVE_ACTION_BAR` = ?,`EXT_ACTIVE_TEMPLATE_TYPE` = ?,`EXT_HASHTAGS` = ?,`EXT_ACTIVE_AI_IMAGE_ACTION_BAR` = ?,`EXT_IMAGE_SHORTCUT_KEY` = ?,`RETRY_TIME` = ?,`REPLY_UUID` = ?,`REPLY_MESSAGE_ID` = ?,`READ` = ?,`CHANNEL` = ?,`UPDATE_ACTION` = ?,`LYNX_DATE` = ?,`PUSH_RECEIVE_TIME` = ?,`THINK_INFO_EXPANDED` = ?,`GEN_STYLE` = ?,`VERSION_ID` = ?,`VERSION_SEQ_ID` = ?,`IS_HIDDEN` = ?,`RETRIED` = ?,`HIDE_PUSH_MESSAGE_BUTTON` = ?,`MODE_SOURCE` = ?,`AIGC_STANDARD_RATIO` = ?,`INPUT_SKILL_MODE` = ?,`IMAGE_TEMPLATE_ID` = ?,`IMAGE_TAB_ID` = ?,`IMAGE_TEMPLATE_TAB` = ?,`IMAGE_STYLE_NAME` = ?,`EDIT_INFO` = ?,`REFERENCE_INFO` = ?,`IS_PUSH_MSG` = ?,`IS_UNCHANGED_TAKO_TEMPLATE` = ?,`IS_REGEN_DEPRECATED` = ?,`IMAGE_TEMPLATE_INFO` = ? WHERE `UUID` = ?";
                                }

                                @Override // X.AbstractC796320VLq
                                public final void bind(InterfaceC796340VLs interfaceC796340VLs, C1862400yZ4 c1862400yZ4) {
                                    Integer numValueOf;
                                    C1862400yZ4 c1862400yZ42 = c1862400yZ4;
                                    String str = c1862400yZ42.LIZ;
                                    if (str == null) {
                                        interfaceC796340VLs.LLD(1);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(1, str);
                                    }
                                    String str2 = c1862400yZ42.LIZIZ;
                                    if (str2 == null) {
                                        interfaceC796340VLs.LLD(2);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(2, str2);
                                    }
                                    interfaceC796340VLs.LJIJ(3, c1862400yZ42.LIZJ);
                                    interfaceC796340VLs.LJIJ(4, c1862400yZ42.LIZLLL);
                                    String str3 = c1862400yZ42.LJ;
                                    if (str3 == null) {
                                        interfaceC796340VLs.LLD(5);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(5, str3);
                                    }
                                    String str4 = c1862400yZ42.LJFF;
                                    if (str4 == null) {
                                        interfaceC796340VLs.LLD(6);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(6, str4);
                                    }
                                    String str5 = c1862400yZ42.LJI;
                                    if (str5 == null) {
                                        interfaceC796340VLs.LLD(7);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(7, str5);
                                    }
                                    interfaceC796340VLs.LJIJ(8, c1862400yZ42.LJII);
                                    interfaceC796340VLs.LJIJ(9, c1862400yZ42.LJIIIIZZ);
                                    interfaceC796340VLs.LJIJ(10, c1862400yZ42.LJIIIZ);
                                    interfaceC796340VLs.LJIJ(11, c1862400yZ42.LJIIJ);
                                    interfaceC796340VLs.LJIJ(12, c1862400yZ42.LJIIJJI);
                                    interfaceC796340VLs.LJIJ(13, c1862400yZ42.LJIIL);
                                    interfaceC796340VLs.LJIJ(14, c1862400yZ42.LJIILIIL);
                                    interfaceC796340VLs.LJIJ(15, c1862400yZ42.LJIILJJIL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(16, c1862400yZ42.LJIILL);
                                    interfaceC796340VLs.LJIJ(17, c1862400yZ42.LJIILLIIL);
                                    String str6 = c1862400yZ42.LJIIZILJ;
                                    if (str6 == null) {
                                        interfaceC796340VLs.LLD(18);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(18, str6);
                                    }
                                    interfaceC796340VLs.LJIJ(19, c1862400yZ42.LJIJ);
                                    String str7 = c1862400yZ42.LJIJI;
                                    if (str7 == null) {
                                        interfaceC796340VLs.LLD(20);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(20, str7);
                                    }
                                    String str8 = c1862400yZ42.LJIJJ;
                                    if (str8 == null) {
                                        interfaceC796340VLs.LLD(21);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(21, str8);
                                    }
                                    interfaceC796340VLs.LJIJ(22, c1862400yZ42.LJIJJLI ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(23, c1862400yZ42.LJIL);
                                    interfaceC796340VLs.LJIJ(24, c1862400yZ42.LJJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(25, c1862400yZ42.LJJI);
                                    interfaceC796340VLs.LJIJ(26, c1862400yZ42.LJJIFFI);
                                    interfaceC796340VLs.LJIJ(27, c1862400yZ42.LJJII);
                                    if (c1862400yZ42.LJJIII == null) {
                                        interfaceC796340VLs.LLD(28);
                                    } else {
                                        interfaceC796340VLs.LJIJ(28, r0.intValue());
                                    }
                                    String str9 = c1862400yZ42.LJJIIJ;
                                    if (str9 == null) {
                                        interfaceC796340VLs.LLD(29);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(29, str9);
                                    }
                                    interfaceC796340VLs.LJIJ(30, c1862400yZ42.LJJIIJZLJL);
                                    String str10 = c1862400yZ42.LJJIIZ;
                                    if (str10 == null) {
                                        interfaceC796340VLs.LLD(31);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(31, str10);
                                    }
                                    interfaceC796340VLs.LJIJ(32, c1862400yZ42.LJJIIZI);
                                    String str11 = c1862400yZ42.LJJIJ;
                                    if (str11 == null) {
                                        interfaceC796340VLs.LLD(33);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(33, str11);
                                    }
                                    String str12 = c1862400yZ42.LJJIJIIJI;
                                    if (str12 == null) {
                                        interfaceC796340VLs.LLD(34);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(34, str12);
                                    }
                                    interfaceC796340VLs.LJIJ(35, c1862400yZ42.LJJIJIIJIL ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(36, c1862400yZ42.LJJIJIL);
                                    String str13 = c1862400yZ42.LJJIJL;
                                    if (str13 == null) {
                                        interfaceC796340VLs.LLD(37);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(37, str13);
                                    }
                                    String str14 = c1862400yZ42.LJJIJLIJ;
                                    if (str14 == null) {
                                        interfaceC796340VLs.LLD(38);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(38, str14);
                                    }
                                    interfaceC796340VLs.LJIJ(39, c1862400yZ42.LJJIL);
                                    Boolean bool = c1862400yZ42.LJJIZ;
                                    if (bool == null) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
                                    }
                                    if (numValueOf == null) {
                                        interfaceC796340VLs.LLD(40);
                                    } else {
                                        interfaceC796340VLs.LJIJ(40, numValueOf.intValue());
                                    }
                                    interfaceC796340VLs.LJIJ(41, c1862400yZ42.LJJJ);
                                    String str15 = c1862400yZ42.LJJJI;
                                    if (str15 == null) {
                                        interfaceC796340VLs.LLD(42);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(42, str15);
                                    }
                                    interfaceC796340VLs.LJIJ(43, c1862400yZ42.LJJJIL);
                                    interfaceC796340VLs.LJIJ(44, c1862400yZ42.LJJJJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(45, c1862400yZ42.LJJJJI);
                                    interfaceC796340VLs.LJIJ(46, c1862400yZ42.LJJJJIZL);
                                    String str16 = c1862400yZ42.LJJJJJ;
                                    if (str16 == null) {
                                        interfaceC796340VLs.LLD(47);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(47, str16);
                                    }
                                    if (c1862400yZ42.LJJJJJL == null) {
                                        interfaceC796340VLs.LLD(48);
                                    } else {
                                        interfaceC796340VLs.LJIJ(48, r0.intValue());
                                    }
                                    String str17 = c1862400yZ42.LJJJJL;
                                    if (str17 == null) {
                                        interfaceC796340VLs.LLD(49);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(49, str17);
                                    }
                                    String str18 = c1862400yZ42.LJJJJLI;
                                    if (str18 == null) {
                                        interfaceC796340VLs.LLD(50);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(50, str18);
                                    }
                                    String str19 = c1862400yZ42.LJJJJLL;
                                    if (str19 == null) {
                                        interfaceC796340VLs.LLD(51);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(51, str19);
                                    }
                                    String str20 = c1862400yZ42.LJJJJZ;
                                    if (str20 == null) {
                                        interfaceC796340VLs.LLD(52);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(52, str20);
                                    }
                                    String str21 = c1862400yZ42.LJJJJZI;
                                    if (str21 == null) {
                                        interfaceC796340VLs.LLD(53);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(53, str21);
                                    }
                                    String str22 = c1862400yZ42.LJJJLIIL;
                                    if (str22 == null) {
                                        interfaceC796340VLs.LLD(54);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(54, str22);
                                    }
                                    String str23 = c1862400yZ42.LJJJLL;
                                    if (str23 == null) {
                                        interfaceC796340VLs.LLD(55);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(55, str23);
                                    }
                                    interfaceC796340VLs.LJIJ(56, c1862400yZ42.LJJJLZIJ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(57, c1862400yZ42.LJJJZ ? 1L : 0L);
                                    interfaceC796340VLs.LJIJ(58, c1862400yZ42.LJJL ? 1L : 0L);
                                    String str24 = c1862400yZ42.LJJLI;
                                    if (str24 == null) {
                                        interfaceC796340VLs.LLD(59);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(59, str24);
                                    }
                                    String str25 = c1862400yZ42.LIZ;
                                    if (str25 == null) {
                                        interfaceC796340VLs.LLD(60);
                                    } else {
                                        interfaceC796340VLs.LJIILIIL(60, str25);
                                    }
                                }
                            };
                            this.LJI = new C854550Xfh(this, 68);
                            this.LJII = new C854550Xfh(this, 69);
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List<String> LIZ(int i) {
                            String string;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT DISTINCT CONVERSATION_ID FROM CONVERSATION_NEW WHERE SUB_CONVERSATION_ID != '' AND STATUS = ? LIMIT 5");
                            c0vn5LIZLLL.LJIJ(1, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    if (cursorLIZIZ.isNull(0)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(0);
                                    }
                                    arrayList.add(string);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List<C801390Vc9> LIZJ(String str) {
                            String string;
                            String string2;
                            String string3;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM CONVERSATION_NEW WHERE CONVERSATION_ID = ? AND (STATUS = 6)");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "STATUS");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "HISTORY_CURSOR");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_CURSOR");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "TITLE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "UNREAD_COUNT");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "LATEST_MESSAGE_TIME");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "RELATED_VIDEO");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string4 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    long j = cursorLIZIZ.getLong(iLIZIZ4);
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ5);
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ7);
                                    long j4 = cursorLIZIZ.getLong(iLIZIZ8);
                                    if (!cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    arrayList.add(new C801390Vc9(i, j, j2, j3, j4, string, string2, string3, string4));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LIZLLL(C801390Vc9 c801390Vc9) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                this.LIZJ.insert(c801390Vc9);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final int LJ(int i) {
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT COUNT(*) FROM CONVERSATION_NEW WHERE SUB_CONVERSATION_ID != '' AND STATUS = ?");
                            c0vn5LIZLLL.LJIJ(1, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            int i2 = 0;
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                if (cursorLIZIZ.moveToFirst()) {
                                    i2 = cursorLIZIZ.getInt(0);
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return i2;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List<C1862400yZ4> LJIIIIZZ(String str) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            boolean z;
                            String string6;
                            String string7;
                            String string8;
                            boolean z2;
                            boolean z3;
                            Integer numValueOf;
                            String string9;
                            String string10;
                            String string11;
                            String string12;
                            boolean z4;
                            String string13;
                            String string14;
                            Integer numValueOf2;
                            boolean z5;
                            Boolean boolValueOf;
                            String string15;
                            boolean z6;
                            String string16;
                            Integer numValueOf3;
                            String string17;
                            String string18;
                            String string19;
                            String string20;
                            String string21;
                            String string22;
                            String string23;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM (SELECT * FROM MESSAGE WHERE REPLY_UUID = ? AND CLIENT_STATUS != 8 AND CLIENT_STATUS != 10 AND CLIENT_STATUS != 9 ) ORDER BY CLIENT_SEQ ASC, SERVER_SEQ ASC");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UUID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_SEQ");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SERVER_SEQ");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SESSION_ID");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_ID");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTION_ID");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_STATUS");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_TYPE");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_TYPE");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_BOT_ID");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_USER_ID");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_IS_SELF");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_TIME");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_SEQ");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_SESSION_ID");
                                    int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION");
                                    int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "BODY");
                                    int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "MULTI_BODY");
                                    int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_MULTI_ANSWER");
                                    int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "SELECTED_ANSWER_INDEX");
                                    int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_DEGRADED");
                                    int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_STATUS");
                                    int iLIZIZ26 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_LOG");
                                    int iLIZIZ27 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_ACTION_BAR");
                                    int iLIZIZ28 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_TEMPLATE_TYPE");
                                    int iLIZIZ29 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_HASHTAGS");
                                    int iLIZIZ30 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_AI_IMAGE_ACTION_BAR");
                                    int iLIZIZ31 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_IMAGE_SHORTCUT_KEY");
                                    int iLIZIZ32 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRY_TIME");
                                    int iLIZIZ33 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_UUID");
                                    int iLIZIZ34 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_MESSAGE_ID");
                                    int iLIZIZ35 = C795450VIh.LIZIZ(cursorLIZIZ, "READ");
                                    int iLIZIZ36 = C795450VIh.LIZIZ(cursorLIZIZ, "CHANNEL");
                                    int iLIZIZ37 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_ACTION");
                                    int iLIZIZ38 = C795450VIh.LIZIZ(cursorLIZIZ, "LYNX_DATE");
                                    int iLIZIZ39 = C795450VIh.LIZIZ(cursorLIZIZ, "PUSH_RECEIVE_TIME");
                                    int iLIZIZ40 = C795450VIh.LIZIZ(cursorLIZIZ, "THINK_INFO_EXPANDED");
                                    int iLIZIZ41 = C795450VIh.LIZIZ(cursorLIZIZ, "GEN_STYLE");
                                    int iLIZIZ42 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_ID");
                                    int iLIZIZ43 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_SEQ_ID");
                                    int iLIZIZ44 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_HIDDEN");
                                    int iLIZIZ45 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRIED");
                                    int iLIZIZ46 = C795450VIh.LIZIZ(cursorLIZIZ, "HIDE_PUSH_MESSAGE_BUTTON");
                                    int iLIZIZ47 = C795450VIh.LIZIZ(cursorLIZIZ, "MODE_SOURCE");
                                    int iLIZIZ48 = C795450VIh.LIZIZ(cursorLIZIZ, "AIGC_STANDARD_RATIO");
                                    int iLIZIZ49 = C795450VIh.LIZIZ(cursorLIZIZ, "INPUT_SKILL_MODE");
                                    int iLIZIZ50 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_ID");
                                    int iLIZIZ51 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TAB_ID");
                                    int iLIZIZ52 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_TAB");
                                    int iLIZIZ53 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_STYLE_NAME");
                                    int iLIZIZ54 = C795450VIh.LIZIZ(cursorLIZIZ, "EDIT_INFO");
                                    int iLIZIZ55 = C795450VIh.LIZIZ(cursorLIZIZ, "REFERENCE_INFO");
                                    int iLIZIZ56 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_PUSH_MSG");
                                    int iLIZIZ57 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_UNCHANGED_TAKO_TEMPLATE");
                                    int iLIZIZ58 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_REGEN_DEPRECATED");
                                    int iLIZIZ59 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_INFO");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string24 = null;
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        long j = cursorLIZIZ.getLong(iLIZIZ3);
                                        long j2 = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ7);
                                        }
                                        long j3 = cursorLIZIZ.getLong(iLIZIZ8);
                                        long j4 = cursorLIZIZ.getLong(iLIZIZ9);
                                        int i = cursorLIZIZ.getInt(iLIZIZ10);
                                        int i2 = cursorLIZIZ.getInt(iLIZIZ11);
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ12);
                                        long j5 = cursorLIZIZ.getLong(iLIZIZ13);
                                        long j6 = cursorLIZIZ.getLong(iLIZIZ14);
                                        if (cursorLIZIZ.getInt(iLIZIZ15) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        long j7 = cursorLIZIZ.getLong(iLIZIZ16);
                                        long j8 = cursorLIZIZ.getLong(iLIZIZ17);
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ19);
                                        if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursorLIZIZ.getString(iLIZIZ20);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursorLIZIZ.getString(iLIZIZ21);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ23);
                                        if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ25);
                                        long j9 = cursorLIZIZ.getLong(iLIZIZ26);
                                        int i7 = cursorLIZIZ.getInt(iLIZIZ27);
                                        if (cursorLIZIZ.isNull(iLIZIZ28)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ28));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ29)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursorLIZIZ.getString(iLIZIZ29);
                                        }
                                        int i8 = cursorLIZIZ.getInt(iLIZIZ30);
                                        if (cursorLIZIZ.isNull(iLIZIZ31)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursorLIZIZ.getString(iLIZIZ31);
                                        }
                                        int i9 = cursorLIZIZ.getInt(iLIZIZ32);
                                        if (cursorLIZIZ.isNull(iLIZIZ33)) {
                                            string11 = null;
                                        } else {
                                            string11 = cursorLIZIZ.getString(iLIZIZ33);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ34)) {
                                            string12 = null;
                                        } else {
                                            string12 = cursorLIZIZ.getString(iLIZIZ34);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ35) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        int i10 = cursorLIZIZ.getInt(iLIZIZ36);
                                        if (cursorLIZIZ.isNull(iLIZIZ37)) {
                                            string13 = null;
                                        } else {
                                            string13 = cursorLIZIZ.getString(iLIZIZ37);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ38)) {
                                            string14 = null;
                                        } else {
                                            string14 = cursorLIZIZ.getString(iLIZIZ38);
                                        }
                                        long j10 = cursorLIZIZ.getLong(iLIZIZ39);
                                        if (!cursorLIZIZ.isNull(iLIZIZ40)) {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ40));
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        if (numValueOf2 == null) {
                                            boolValueOf = null;
                                        } else {
                                            if (numValueOf2.intValue() != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z5);
                                        }
                                        int i11 = cursorLIZIZ.getInt(iLIZIZ41);
                                        if (cursorLIZIZ.isNull(iLIZIZ42)) {
                                            string15 = null;
                                        } else {
                                            string15 = cursorLIZIZ.getString(iLIZIZ42);
                                        }
                                        long j11 = cursorLIZIZ.getLong(iLIZIZ43);
                                        if (cursorLIZIZ.getInt(iLIZIZ44) != 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        int i12 = cursorLIZIZ.getInt(iLIZIZ45);
                                        int i13 = cursorLIZIZ.getInt(iLIZIZ46);
                                        if (cursorLIZIZ.isNull(iLIZIZ47)) {
                                            string16 = null;
                                        } else {
                                            string16 = cursorLIZIZ.getString(iLIZIZ47);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ48)) {
                                            numValueOf3 = null;
                                        } else {
                                            numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ48));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ49)) {
                                            string17 = null;
                                        } else {
                                            string17 = cursorLIZIZ.getString(iLIZIZ49);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ50)) {
                                            string18 = null;
                                        } else {
                                            string18 = cursorLIZIZ.getString(iLIZIZ50);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ51)) {
                                            string19 = null;
                                        } else {
                                            string19 = cursorLIZIZ.getString(iLIZIZ51);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ52)) {
                                            string20 = null;
                                        } else {
                                            string20 = cursorLIZIZ.getString(iLIZIZ52);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ53)) {
                                            string21 = null;
                                        } else {
                                            string21 = cursorLIZIZ.getString(iLIZIZ53);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ54)) {
                                            string22 = null;
                                        } else {
                                            string22 = cursorLIZIZ.getString(iLIZIZ54);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ55)) {
                                            string23 = null;
                                        } else {
                                            string23 = cursorLIZIZ.getString(iLIZIZ55);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ56) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ57) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ58) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!cursorLIZIZ.isNull(iLIZIZ59)) {
                                            string24 = cursorLIZIZ.getString(iLIZIZ59);
                                        }
                                        arrayList.add(new C1862400yZ4(string, string2, j, j2, string3, string4, string5, j3, j4, i, i2, i3, j5, j6, z, j7, j8, string6, i4, string7, string8, z2, i5, z3, i6, j9, i7, numValueOf, string9, i8, string10, i9, string11, string12, z4, i10, string13, string14, j10, boolValueOf, i11, string15, j11, z6, i12, i13, string16, numValueOf3, string17, string18, string19, string20, string21, string22, string23, z7, z8, z9, string24));
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List<C1862400yZ4> LJIIJ(String str) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            boolean z;
                            String string6;
                            String string7;
                            String string8;
                            boolean z2;
                            boolean z3;
                            Integer numValueOf;
                            String string9;
                            String string10;
                            String string11;
                            String string12;
                            boolean z4;
                            String string13;
                            String string14;
                            Integer numValueOf2;
                            boolean z5;
                            Boolean boolValueOf;
                            String string15;
                            boolean z6;
                            String string16;
                            Integer numValueOf3;
                            String string17;
                            String string18;
                            String string19;
                            String string20;
                            String string21;
                            String string22;
                            String string23;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM (SELECT * FROM MESSAGE WHERE UUID = ? LIMIT 1) ");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UUID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_SEQ");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SERVER_SEQ");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SESSION_ID");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_ID");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTION_ID");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_STATUS");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_TYPE");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_TYPE");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_BOT_ID");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_USER_ID");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_IS_SELF");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_TIME");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_SEQ");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_SESSION_ID");
                                    int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION");
                                    int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "BODY");
                                    int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "MULTI_BODY");
                                    int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_MULTI_ANSWER");
                                    int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "SELECTED_ANSWER_INDEX");
                                    int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_DEGRADED");
                                    int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_STATUS");
                                    int iLIZIZ26 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_LOG");
                                    int iLIZIZ27 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_ACTION_BAR");
                                    int iLIZIZ28 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_TEMPLATE_TYPE");
                                    int iLIZIZ29 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_HASHTAGS");
                                    int iLIZIZ30 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_AI_IMAGE_ACTION_BAR");
                                    int iLIZIZ31 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_IMAGE_SHORTCUT_KEY");
                                    int iLIZIZ32 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRY_TIME");
                                    int iLIZIZ33 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_UUID");
                                    int iLIZIZ34 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_MESSAGE_ID");
                                    int iLIZIZ35 = C795450VIh.LIZIZ(cursorLIZIZ, "READ");
                                    int iLIZIZ36 = C795450VIh.LIZIZ(cursorLIZIZ, "CHANNEL");
                                    int iLIZIZ37 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_ACTION");
                                    int iLIZIZ38 = C795450VIh.LIZIZ(cursorLIZIZ, "LYNX_DATE");
                                    int iLIZIZ39 = C795450VIh.LIZIZ(cursorLIZIZ, "PUSH_RECEIVE_TIME");
                                    int iLIZIZ40 = C795450VIh.LIZIZ(cursorLIZIZ, "THINK_INFO_EXPANDED");
                                    int iLIZIZ41 = C795450VIh.LIZIZ(cursorLIZIZ, "GEN_STYLE");
                                    int iLIZIZ42 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_ID");
                                    int iLIZIZ43 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_SEQ_ID");
                                    int iLIZIZ44 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_HIDDEN");
                                    int iLIZIZ45 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRIED");
                                    int iLIZIZ46 = C795450VIh.LIZIZ(cursorLIZIZ, "HIDE_PUSH_MESSAGE_BUTTON");
                                    int iLIZIZ47 = C795450VIh.LIZIZ(cursorLIZIZ, "MODE_SOURCE");
                                    int iLIZIZ48 = C795450VIh.LIZIZ(cursorLIZIZ, "AIGC_STANDARD_RATIO");
                                    int iLIZIZ49 = C795450VIh.LIZIZ(cursorLIZIZ, "INPUT_SKILL_MODE");
                                    int iLIZIZ50 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_ID");
                                    int iLIZIZ51 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TAB_ID");
                                    int iLIZIZ52 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_TAB");
                                    int iLIZIZ53 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_STYLE_NAME");
                                    int iLIZIZ54 = C795450VIh.LIZIZ(cursorLIZIZ, "EDIT_INFO");
                                    int iLIZIZ55 = C795450VIh.LIZIZ(cursorLIZIZ, "REFERENCE_INFO");
                                    int iLIZIZ56 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_PUSH_MSG");
                                    int iLIZIZ57 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_UNCHANGED_TAKO_TEMPLATE");
                                    int iLIZIZ58 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_REGEN_DEPRECATED");
                                    int iLIZIZ59 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_INFO");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string24 = null;
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        long j = cursorLIZIZ.getLong(iLIZIZ3);
                                        long j2 = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ7);
                                        }
                                        long j3 = cursorLIZIZ.getLong(iLIZIZ8);
                                        long j4 = cursorLIZIZ.getLong(iLIZIZ9);
                                        int i = cursorLIZIZ.getInt(iLIZIZ10);
                                        int i2 = cursorLIZIZ.getInt(iLIZIZ11);
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ12);
                                        long j5 = cursorLIZIZ.getLong(iLIZIZ13);
                                        long j6 = cursorLIZIZ.getLong(iLIZIZ14);
                                        if (cursorLIZIZ.getInt(iLIZIZ15) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        long j7 = cursorLIZIZ.getLong(iLIZIZ16);
                                        long j8 = cursorLIZIZ.getLong(iLIZIZ17);
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ19);
                                        if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursorLIZIZ.getString(iLIZIZ20);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursorLIZIZ.getString(iLIZIZ21);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ23);
                                        if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ25);
                                        long j9 = cursorLIZIZ.getLong(iLIZIZ26);
                                        int i7 = cursorLIZIZ.getInt(iLIZIZ27);
                                        if (cursorLIZIZ.isNull(iLIZIZ28)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ28));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ29)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursorLIZIZ.getString(iLIZIZ29);
                                        }
                                        int i8 = cursorLIZIZ.getInt(iLIZIZ30);
                                        if (cursorLIZIZ.isNull(iLIZIZ31)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursorLIZIZ.getString(iLIZIZ31);
                                        }
                                        int i9 = cursorLIZIZ.getInt(iLIZIZ32);
                                        if (cursorLIZIZ.isNull(iLIZIZ33)) {
                                            string11 = null;
                                        } else {
                                            string11 = cursorLIZIZ.getString(iLIZIZ33);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ34)) {
                                            string12 = null;
                                        } else {
                                            string12 = cursorLIZIZ.getString(iLIZIZ34);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ35) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        int i10 = cursorLIZIZ.getInt(iLIZIZ36);
                                        if (cursorLIZIZ.isNull(iLIZIZ37)) {
                                            string13 = null;
                                        } else {
                                            string13 = cursorLIZIZ.getString(iLIZIZ37);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ38)) {
                                            string14 = null;
                                        } else {
                                            string14 = cursorLIZIZ.getString(iLIZIZ38);
                                        }
                                        long j10 = cursorLIZIZ.getLong(iLIZIZ39);
                                        if (!cursorLIZIZ.isNull(iLIZIZ40)) {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ40));
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        if (numValueOf2 == null) {
                                            boolValueOf = null;
                                        } else {
                                            if (numValueOf2.intValue() != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z5);
                                        }
                                        int i11 = cursorLIZIZ.getInt(iLIZIZ41);
                                        if (cursorLIZIZ.isNull(iLIZIZ42)) {
                                            string15 = null;
                                        } else {
                                            string15 = cursorLIZIZ.getString(iLIZIZ42);
                                        }
                                        long j11 = cursorLIZIZ.getLong(iLIZIZ43);
                                        if (cursorLIZIZ.getInt(iLIZIZ44) != 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        int i12 = cursorLIZIZ.getInt(iLIZIZ45);
                                        int i13 = cursorLIZIZ.getInt(iLIZIZ46);
                                        if (cursorLIZIZ.isNull(iLIZIZ47)) {
                                            string16 = null;
                                        } else {
                                            string16 = cursorLIZIZ.getString(iLIZIZ47);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ48)) {
                                            numValueOf3 = null;
                                        } else {
                                            numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ48));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ49)) {
                                            string17 = null;
                                        } else {
                                            string17 = cursorLIZIZ.getString(iLIZIZ49);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ50)) {
                                            string18 = null;
                                        } else {
                                            string18 = cursorLIZIZ.getString(iLIZIZ50);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ51)) {
                                            string19 = null;
                                        } else {
                                            string19 = cursorLIZIZ.getString(iLIZIZ51);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ52)) {
                                            string20 = null;
                                        } else {
                                            string20 = cursorLIZIZ.getString(iLIZIZ52);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ53)) {
                                            string21 = null;
                                        } else {
                                            string21 = cursorLIZIZ.getString(iLIZIZ53);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ54)) {
                                            string22 = null;
                                        } else {
                                            string22 = cursorLIZIZ.getString(iLIZIZ54);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ55)) {
                                            string23 = null;
                                        } else {
                                            string23 = cursorLIZIZ.getString(iLIZIZ55);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ56) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ57) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ58) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!cursorLIZIZ.isNull(iLIZIZ59)) {
                                            string24 = cursorLIZIZ.getString(iLIZIZ59);
                                        }
                                        arrayList.add(new C1862400yZ4(string, string2, j, j2, string3, string4, string5, j3, j4, i, i2, i3, j5, j6, z, j7, j8, string6, i4, string7, string8, z2, i5, z3, i6, j9, i7, numValueOf, string9, i8, string10, i9, string11, string12, z4, i10, string13, string14, j10, boolValueOf, i11, string15, j11, z6, i12, i13, string16, numValueOf3, string17, string18, string19, string20, string21, string22, string23, z7, z8, z9, string24));
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List<C1862400yZ4> LJIIJJI(String str) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            boolean z;
                            String string6;
                            String string7;
                            String string8;
                            boolean z2;
                            boolean z3;
                            Integer numValueOf;
                            String string9;
                            String string10;
                            String string11;
                            String string12;
                            boolean z4;
                            String string13;
                            String string14;
                            Integer numValueOf2;
                            boolean z5;
                            Boolean boolValueOf;
                            String string15;
                            boolean z6;
                            String string16;
                            Integer numValueOf3;
                            String string17;
                            String string18;
                            String string19;
                            String string20;
                            String string21;
                            String string22;
                            String string23;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(1, "SELECT * FROM (SELECT * FROM MESSAGE WHERE MESSAGE_ID = ? LIMIT 1) ");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UUID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_SEQ");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SERVER_SEQ");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SESSION_ID");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_ID");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTION_ID");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_STATUS");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_TYPE");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_TYPE");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_BOT_ID");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_USER_ID");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_IS_SELF");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_TIME");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_SEQ");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_SESSION_ID");
                                    int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION");
                                    int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "BODY");
                                    int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "MULTI_BODY");
                                    int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_MULTI_ANSWER");
                                    int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "SELECTED_ANSWER_INDEX");
                                    int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_DEGRADED");
                                    int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_STATUS");
                                    int iLIZIZ26 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_LOG");
                                    int iLIZIZ27 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_ACTION_BAR");
                                    int iLIZIZ28 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_TEMPLATE_TYPE");
                                    int iLIZIZ29 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_HASHTAGS");
                                    int iLIZIZ30 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_AI_IMAGE_ACTION_BAR");
                                    int iLIZIZ31 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_IMAGE_SHORTCUT_KEY");
                                    int iLIZIZ32 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRY_TIME");
                                    int iLIZIZ33 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_UUID");
                                    int iLIZIZ34 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_MESSAGE_ID");
                                    int iLIZIZ35 = C795450VIh.LIZIZ(cursorLIZIZ, "READ");
                                    int iLIZIZ36 = C795450VIh.LIZIZ(cursorLIZIZ, "CHANNEL");
                                    int iLIZIZ37 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_ACTION");
                                    int iLIZIZ38 = C795450VIh.LIZIZ(cursorLIZIZ, "LYNX_DATE");
                                    int iLIZIZ39 = C795450VIh.LIZIZ(cursorLIZIZ, "PUSH_RECEIVE_TIME");
                                    int iLIZIZ40 = C795450VIh.LIZIZ(cursorLIZIZ, "THINK_INFO_EXPANDED");
                                    int iLIZIZ41 = C795450VIh.LIZIZ(cursorLIZIZ, "GEN_STYLE");
                                    int iLIZIZ42 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_ID");
                                    int iLIZIZ43 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_SEQ_ID");
                                    int iLIZIZ44 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_HIDDEN");
                                    int iLIZIZ45 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRIED");
                                    int iLIZIZ46 = C795450VIh.LIZIZ(cursorLIZIZ, "HIDE_PUSH_MESSAGE_BUTTON");
                                    int iLIZIZ47 = C795450VIh.LIZIZ(cursorLIZIZ, "MODE_SOURCE");
                                    int iLIZIZ48 = C795450VIh.LIZIZ(cursorLIZIZ, "AIGC_STANDARD_RATIO");
                                    int iLIZIZ49 = C795450VIh.LIZIZ(cursorLIZIZ, "INPUT_SKILL_MODE");
                                    int iLIZIZ50 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_ID");
                                    int iLIZIZ51 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TAB_ID");
                                    int iLIZIZ52 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_TAB");
                                    int iLIZIZ53 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_STYLE_NAME");
                                    int iLIZIZ54 = C795450VIh.LIZIZ(cursorLIZIZ, "EDIT_INFO");
                                    int iLIZIZ55 = C795450VIh.LIZIZ(cursorLIZIZ, "REFERENCE_INFO");
                                    int iLIZIZ56 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_PUSH_MSG");
                                    int iLIZIZ57 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_UNCHANGED_TAKO_TEMPLATE");
                                    int iLIZIZ58 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_REGEN_DEPRECATED");
                                    int iLIZIZ59 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_INFO");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string24 = null;
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        long j = cursorLIZIZ.getLong(iLIZIZ3);
                                        long j2 = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ7);
                                        }
                                        long j3 = cursorLIZIZ.getLong(iLIZIZ8);
                                        long j4 = cursorLIZIZ.getLong(iLIZIZ9);
                                        int i = cursorLIZIZ.getInt(iLIZIZ10);
                                        int i2 = cursorLIZIZ.getInt(iLIZIZ11);
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ12);
                                        long j5 = cursorLIZIZ.getLong(iLIZIZ13);
                                        long j6 = cursorLIZIZ.getLong(iLIZIZ14);
                                        if (cursorLIZIZ.getInt(iLIZIZ15) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        long j7 = cursorLIZIZ.getLong(iLIZIZ16);
                                        long j8 = cursorLIZIZ.getLong(iLIZIZ17);
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ19);
                                        if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursorLIZIZ.getString(iLIZIZ20);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursorLIZIZ.getString(iLIZIZ21);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ23);
                                        if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ25);
                                        long j9 = cursorLIZIZ.getLong(iLIZIZ26);
                                        int i7 = cursorLIZIZ.getInt(iLIZIZ27);
                                        if (cursorLIZIZ.isNull(iLIZIZ28)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ28));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ29)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursorLIZIZ.getString(iLIZIZ29);
                                        }
                                        int i8 = cursorLIZIZ.getInt(iLIZIZ30);
                                        if (cursorLIZIZ.isNull(iLIZIZ31)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursorLIZIZ.getString(iLIZIZ31);
                                        }
                                        int i9 = cursorLIZIZ.getInt(iLIZIZ32);
                                        if (cursorLIZIZ.isNull(iLIZIZ33)) {
                                            string11 = null;
                                        } else {
                                            string11 = cursorLIZIZ.getString(iLIZIZ33);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ34)) {
                                            string12 = null;
                                        } else {
                                            string12 = cursorLIZIZ.getString(iLIZIZ34);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ35) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        int i10 = cursorLIZIZ.getInt(iLIZIZ36);
                                        if (cursorLIZIZ.isNull(iLIZIZ37)) {
                                            string13 = null;
                                        } else {
                                            string13 = cursorLIZIZ.getString(iLIZIZ37);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ38)) {
                                            string14 = null;
                                        } else {
                                            string14 = cursorLIZIZ.getString(iLIZIZ38);
                                        }
                                        long j10 = cursorLIZIZ.getLong(iLIZIZ39);
                                        if (!cursorLIZIZ.isNull(iLIZIZ40)) {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ40));
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        if (numValueOf2 == null) {
                                            boolValueOf = null;
                                        } else {
                                            if (numValueOf2.intValue() != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z5);
                                        }
                                        int i11 = cursorLIZIZ.getInt(iLIZIZ41);
                                        if (cursorLIZIZ.isNull(iLIZIZ42)) {
                                            string15 = null;
                                        } else {
                                            string15 = cursorLIZIZ.getString(iLIZIZ42);
                                        }
                                        long j11 = cursorLIZIZ.getLong(iLIZIZ43);
                                        if (cursorLIZIZ.getInt(iLIZIZ44) != 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        int i12 = cursorLIZIZ.getInt(iLIZIZ45);
                                        int i13 = cursorLIZIZ.getInt(iLIZIZ46);
                                        if (cursorLIZIZ.isNull(iLIZIZ47)) {
                                            string16 = null;
                                        } else {
                                            string16 = cursorLIZIZ.getString(iLIZIZ47);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ48)) {
                                            numValueOf3 = null;
                                        } else {
                                            numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ48));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ49)) {
                                            string17 = null;
                                        } else {
                                            string17 = cursorLIZIZ.getString(iLIZIZ49);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ50)) {
                                            string18 = null;
                                        } else {
                                            string18 = cursorLIZIZ.getString(iLIZIZ50);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ51)) {
                                            string19 = null;
                                        } else {
                                            string19 = cursorLIZIZ.getString(iLIZIZ51);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ52)) {
                                            string20 = null;
                                        } else {
                                            string20 = cursorLIZIZ.getString(iLIZIZ52);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ53)) {
                                            string21 = null;
                                        } else {
                                            string21 = cursorLIZIZ.getString(iLIZIZ53);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ54)) {
                                            string22 = null;
                                        } else {
                                            string22 = cursorLIZIZ.getString(iLIZIZ54);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ55)) {
                                            string23 = null;
                                        } else {
                                            string23 = cursorLIZIZ.getString(iLIZIZ55);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ56) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ57) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ58) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!cursorLIZIZ.isNull(iLIZIZ59)) {
                                            string24 = cursorLIZIZ.getString(iLIZIZ59);
                                        }
                                        arrayList.add(new C1862400yZ4(string, string2, j, j2, string3, string4, string5, j3, j4, i, i2, i3, j5, j6, z, j7, j8, string6, i4, string7, string8, z2, i5, z3, i6, j9, i7, numValueOf, string9, i8, string10, i9, string11, string12, z4, i10, string13, string14, j10, boolValueOf, i11, string15, j11, z6, i12, i13, string16, numValueOf3, string17, string18, string19, string20, string21, string22, string23, z7, z8, z9, string24));
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List LJIIL(int i) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            boolean z;
                            String string6;
                            String string7;
                            String string8;
                            boolean z2;
                            boolean z3;
                            Integer numValueOf;
                            String string9;
                            String string10;
                            String string11;
                            String string12;
                            boolean z4;
                            String string13;
                            String string14;
                            Integer numValueOf2;
                            boolean z5;
                            Boolean boolValueOf;
                            String string15;
                            boolean z6;
                            String string16;
                            Integer numValueOf3;
                            String string17;
                            String string18;
                            String string19;
                            String string20;
                            String string21;
                            String string22;
                            String string23;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "SELECT * FROM (SELECT * FROM MESSAGE WHERE SERVER_SEQ < ? AND CLIENT_SEQ < ? AND CLIENT_STATUS = ? AND RETRY_TIME < ? ORDER BY CLIENT_SEQ DESC, SERVER_SEQ DESC LIMIT ?) ORDER BY CLIENT_SEQ ASC, SERVER_SEQ ASC");
                            c0vn5LIZLLL.LJIJ(1, Long.MAX_VALUE);
                            c0vn5LIZLLL.LJIJ(2, Long.MAX_VALUE);
                            c0vn5LIZLLL.LJIJ(3, i);
                            c0vn5LIZLLL.LJIJ(4, 3);
                            c0vn5LIZLLL.LJIJ(5, 5);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UUID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_SEQ");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SERVER_SEQ");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SESSION_ID");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_ID");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTION_ID");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_STATUS");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_TYPE");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_TYPE");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_BOT_ID");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_USER_ID");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_IS_SELF");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_TIME");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_SEQ");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_SESSION_ID");
                                    int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION");
                                    int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "BODY");
                                    int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "MULTI_BODY");
                                    int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_MULTI_ANSWER");
                                    int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "SELECTED_ANSWER_INDEX");
                                    int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_DEGRADED");
                                    int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_STATUS");
                                    int iLIZIZ26 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_LOG");
                                    int iLIZIZ27 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_ACTION_BAR");
                                    int iLIZIZ28 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_TEMPLATE_TYPE");
                                    int iLIZIZ29 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_HASHTAGS");
                                    int iLIZIZ30 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_AI_IMAGE_ACTION_BAR");
                                    int iLIZIZ31 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_IMAGE_SHORTCUT_KEY");
                                    int iLIZIZ32 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRY_TIME");
                                    int iLIZIZ33 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_UUID");
                                    int iLIZIZ34 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_MESSAGE_ID");
                                    int iLIZIZ35 = C795450VIh.LIZIZ(cursorLIZIZ, "READ");
                                    int iLIZIZ36 = C795450VIh.LIZIZ(cursorLIZIZ, "CHANNEL");
                                    int iLIZIZ37 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_ACTION");
                                    int iLIZIZ38 = C795450VIh.LIZIZ(cursorLIZIZ, "LYNX_DATE");
                                    int iLIZIZ39 = C795450VIh.LIZIZ(cursorLIZIZ, "PUSH_RECEIVE_TIME");
                                    int iLIZIZ40 = C795450VIh.LIZIZ(cursorLIZIZ, "THINK_INFO_EXPANDED");
                                    int iLIZIZ41 = C795450VIh.LIZIZ(cursorLIZIZ, "GEN_STYLE");
                                    int iLIZIZ42 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_ID");
                                    int iLIZIZ43 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_SEQ_ID");
                                    int iLIZIZ44 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_HIDDEN");
                                    int iLIZIZ45 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRIED");
                                    int iLIZIZ46 = C795450VIh.LIZIZ(cursorLIZIZ, "HIDE_PUSH_MESSAGE_BUTTON");
                                    int iLIZIZ47 = C795450VIh.LIZIZ(cursorLIZIZ, "MODE_SOURCE");
                                    int iLIZIZ48 = C795450VIh.LIZIZ(cursorLIZIZ, "AIGC_STANDARD_RATIO");
                                    int iLIZIZ49 = C795450VIh.LIZIZ(cursorLIZIZ, "INPUT_SKILL_MODE");
                                    int iLIZIZ50 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_ID");
                                    int iLIZIZ51 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TAB_ID");
                                    int iLIZIZ52 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_TAB");
                                    int iLIZIZ53 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_STYLE_NAME");
                                    int iLIZIZ54 = C795450VIh.LIZIZ(cursorLIZIZ, "EDIT_INFO");
                                    int iLIZIZ55 = C795450VIh.LIZIZ(cursorLIZIZ, "REFERENCE_INFO");
                                    int iLIZIZ56 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_PUSH_MSG");
                                    int iLIZIZ57 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_UNCHANGED_TAKO_TEMPLATE");
                                    int iLIZIZ58 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_REGEN_DEPRECATED");
                                    int iLIZIZ59 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_INFO");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string24 = null;
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        long j = cursorLIZIZ.getLong(iLIZIZ3);
                                        long j2 = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ7);
                                        }
                                        long j3 = cursorLIZIZ.getLong(iLIZIZ8);
                                        long j4 = cursorLIZIZ.getLong(iLIZIZ9);
                                        int i2 = cursorLIZIZ.getInt(iLIZIZ10);
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ11);
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ12);
                                        long j5 = cursorLIZIZ.getLong(iLIZIZ13);
                                        long j6 = cursorLIZIZ.getLong(iLIZIZ14);
                                        if (cursorLIZIZ.getInt(iLIZIZ15) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        long j7 = cursorLIZIZ.getLong(iLIZIZ16);
                                        long j8 = cursorLIZIZ.getLong(iLIZIZ17);
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ19);
                                        if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursorLIZIZ.getString(iLIZIZ20);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursorLIZIZ.getString(iLIZIZ21);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ23);
                                        if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int i7 = cursorLIZIZ.getInt(iLIZIZ25);
                                        long j9 = cursorLIZIZ.getLong(iLIZIZ26);
                                        int i8 = cursorLIZIZ.getInt(iLIZIZ27);
                                        if (cursorLIZIZ.isNull(iLIZIZ28)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ28));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ29)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursorLIZIZ.getString(iLIZIZ29);
                                        }
                                        int i9 = cursorLIZIZ.getInt(iLIZIZ30);
                                        if (cursorLIZIZ.isNull(iLIZIZ31)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursorLIZIZ.getString(iLIZIZ31);
                                        }
                                        int i10 = cursorLIZIZ.getInt(iLIZIZ32);
                                        if (cursorLIZIZ.isNull(iLIZIZ33)) {
                                            string11 = null;
                                        } else {
                                            string11 = cursorLIZIZ.getString(iLIZIZ33);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ34)) {
                                            string12 = null;
                                        } else {
                                            string12 = cursorLIZIZ.getString(iLIZIZ34);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ35) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        int i11 = cursorLIZIZ.getInt(iLIZIZ36);
                                        if (cursorLIZIZ.isNull(iLIZIZ37)) {
                                            string13 = null;
                                        } else {
                                            string13 = cursorLIZIZ.getString(iLIZIZ37);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ38)) {
                                            string14 = null;
                                        } else {
                                            string14 = cursorLIZIZ.getString(iLIZIZ38);
                                        }
                                        long j10 = cursorLIZIZ.getLong(iLIZIZ39);
                                        if (!cursorLIZIZ.isNull(iLIZIZ40)) {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ40));
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        if (numValueOf2 == null) {
                                            boolValueOf = null;
                                        } else {
                                            if (numValueOf2.intValue() != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z5);
                                        }
                                        int i12 = cursorLIZIZ.getInt(iLIZIZ41);
                                        if (cursorLIZIZ.isNull(iLIZIZ42)) {
                                            string15 = null;
                                        } else {
                                            string15 = cursorLIZIZ.getString(iLIZIZ42);
                                        }
                                        long j11 = cursorLIZIZ.getLong(iLIZIZ43);
                                        if (cursorLIZIZ.getInt(iLIZIZ44) != 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        int i13 = cursorLIZIZ.getInt(iLIZIZ45);
                                        int i14 = cursorLIZIZ.getInt(iLIZIZ46);
                                        if (cursorLIZIZ.isNull(iLIZIZ47)) {
                                            string16 = null;
                                        } else {
                                            string16 = cursorLIZIZ.getString(iLIZIZ47);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ48)) {
                                            numValueOf3 = null;
                                        } else {
                                            numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ48));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ49)) {
                                            string17 = null;
                                        } else {
                                            string17 = cursorLIZIZ.getString(iLIZIZ49);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ50)) {
                                            string18 = null;
                                        } else {
                                            string18 = cursorLIZIZ.getString(iLIZIZ50);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ51)) {
                                            string19 = null;
                                        } else {
                                            string19 = cursorLIZIZ.getString(iLIZIZ51);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ52)) {
                                            string20 = null;
                                        } else {
                                            string20 = cursorLIZIZ.getString(iLIZIZ52);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ53)) {
                                            string21 = null;
                                        } else {
                                            string21 = cursorLIZIZ.getString(iLIZIZ53);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ54)) {
                                            string22 = null;
                                        } else {
                                            string22 = cursorLIZIZ.getString(iLIZIZ54);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ55)) {
                                            string23 = null;
                                        } else {
                                            string23 = cursorLIZIZ.getString(iLIZIZ55);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ56) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ57) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ58) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!cursorLIZIZ.isNull(iLIZIZ59)) {
                                            string24 = cursorLIZIZ.getString(iLIZIZ59);
                                        }
                                        arrayList.add(new C1862400yZ4(string, string2, j, j2, string3, string4, string5, j3, j4, i2, i3, i4, j5, j6, z, j7, j8, string6, i5, string7, string8, z2, i6, z3, i7, j9, i8, numValueOf, string9, i9, string10, i10, string11, string12, z4, i11, string13, string14, j10, boolValueOf, i12, string15, j11, z6, i13, i14, string16, numValueOf3, string17, string18, string19, string20, string21, string22, string23, z7, z8, z9, string24));
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJIILL(C801390Vc9 c801390Vc9) {
                            C801390Vc9 c801390Vc92 = (C801390Vc9) C13LP.LJJJLL(LJIILIIL(c801390Vc9.LIZ, c801390Vc9.LIZIZ));
                            if (c801390Vc92 == null) {
                                LIZLLL(c801390Vc9);
                                return;
                            }
                            long j = c801390Vc92.LIZLLL;
                            if (j >= -1) {
                                c801390Vc9.LIZLLL = j;
                            }
                            long j2 = c801390Vc92.LJ;
                            if (j2 >= c801390Vc9.LJ) {
                                c801390Vc9.LJ = j2;
                            }
                            LJJIII(c801390Vc9);
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJIIZILJ(C1863840ybO c1863840ybO) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert(c1863840ybO);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJIL(C801390Vc9 c801390Vc9) {
                            if (LJIILIIL(c801390Vc9.LIZ, c801390Vc9.LIZIZ).isEmpty()) {
                                LIZLLL(c801390Vc9);
                            }
                        }

                        public final void LJJI(C1862400yZ4 c1862400yZ4) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                insert(c1862400yZ4);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        public final void LJJIII(C801390Vc9 c801390Vc9) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                handle(c801390Vc9);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        public final void LJJIIJ(C1862400yZ4 c1862400yZ4) {
                            this.LIZ.assertNotSuspendingTransaction();
                            this.LIZ.beginTransaction();
                            try {
                                handle(c1862400yZ4);
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LIZIZ(String str, String str2) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJI.acquire();
                            if (str == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                interfaceC796340VLsAcquire.LLD(2);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(2, str2);
                            }
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJI.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJI.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List<C801390Vc9> LJIILIIL(String str, String str2) {
                            if (str2 != null && str2.length() != 0) {
                                return LJJ(str, str2);
                            }
                            return LJJ(str, "");
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List LJIILJJIL(int i, String str) {
                            String string;
                            String string2;
                            String string3;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM CONVERSATION_NEW WHERE CONVERSATION_ID = ? AND SUB_CONVERSATION_ID != '' AND STATUS = ? ORDER BY LATEST_MESSAGE_TIME DESC");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            c0vn5LIZLLL.LJIJ(2, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "STATUS");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "HISTORY_CURSOR");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_CURSOR");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "TITLE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "UNREAD_COUNT");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "LATEST_MESSAGE_TIME");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "RELATED_VIDEO");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string4 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    int i2 = cursorLIZIZ.getInt(iLIZIZ3);
                                    long j = cursorLIZIZ.getLong(iLIZIZ4);
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ5);
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ7);
                                    long j4 = cursorLIZIZ.getLong(iLIZIZ8);
                                    if (!cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    arrayList.add(new C801390Vc9(i2, j, j2, j3, j4, string, string2, string3, string4));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJIJJ(String str, String str2) {
                            this.LIZ.assertNotSuspendingTransaction();
                            InterfaceC796340VLs interfaceC796340VLsAcquire = this.LJII.acquire();
                            if (str2 == null) {
                                interfaceC796340VLsAcquire.LLD(1);
                            } else {
                                interfaceC796340VLsAcquire.LJIILIIL(1, str2);
                            }
                            interfaceC796340VLsAcquire.LJIILIIL(2, str);
                            this.LIZ.beginTransaction();
                            try {
                                interfaceC796340VLsAcquire.LJIIL();
                                this.LIZ.setTransactionSuccessful();
                                this.LIZ.endTransaction();
                                this.LJII.release(interfaceC796340VLsAcquire);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                this.LIZ.endTransaction();
                                this.LJII.release(interfaceC796340VLsAcquire);
                                throw th;
                            }
                        }

                        public final List<C801390Vc9> LJJ(String str, String str2) {
                            String string;
                            String string2;
                            String string3;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(2, "SELECT * FROM CONVERSATION_NEW WHERE CONVERSATION_ID = ? AND SUB_CONVERSATION_ID = ?");
                            if (str == null) {
                                c0vn5LIZLLL.LLD(1);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(1, str);
                            }
                            if (str2 == null) {
                                c0vn5LIZLLL.LLD(2);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(2, str2);
                            }
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "STATUS");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "HISTORY_CURSOR");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "READ_CURSOR");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "TITLE");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "UNREAD_COUNT");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "LATEST_MESSAGE_TIME");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "RELATED_VIDEO");
                                ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                while (cursorLIZIZ.moveToNext()) {
                                    String string4 = null;
                                    if (cursorLIZIZ.isNull(iLIZIZ)) {
                                        string = null;
                                    } else {
                                        string = cursorLIZIZ.getString(iLIZIZ);
                                    }
                                    if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                        string2 = null;
                                    } else {
                                        string2 = cursorLIZIZ.getString(iLIZIZ2);
                                    }
                                    int i = cursorLIZIZ.getInt(iLIZIZ3);
                                    long j = cursorLIZIZ.getLong(iLIZIZ4);
                                    long j2 = cursorLIZIZ.getLong(iLIZIZ5);
                                    if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                        string3 = null;
                                    } else {
                                        string3 = cursorLIZIZ.getString(iLIZIZ6);
                                    }
                                    long j3 = cursorLIZIZ.getLong(iLIZIZ7);
                                    long j4 = cursorLIZIZ.getLong(iLIZIZ8);
                                    if (!cursorLIZIZ.isNull(iLIZIZ9)) {
                                        string4 = cursorLIZIZ.getString(iLIZIZ9);
                                    }
                                    arrayList.add(new C801390Vc9(i, j, j2, j3, j4, string, string2, string3, string4));
                                }
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                return arrayList;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                cursorLIZIZ.close();
                                c0vn5LIZLLL.release();
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJFF(String str, String str2, Message message) {
                            C1227904rF c1227904rF = C1227904rF.LIZ;
                            Type type = new TypeToken<Map<String, ? extends Object>>() { // from class: X.00WO
                            }.getType();
                            c1227904rF.getClass();
                            Map map = (Map) C1227904rF.LIZJ(str2, type);
                            if (C13LP.LJJJLL(LJIIJ(str)) != null) {
                                message.LJI = C2097608Jq.LJIIL(message.LJI, map);
                                LJJIIJ(C1862370yZ1.LIZ(message));
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJI(long j, String str, String str2) {
                            C801390Vc9 c801390Vc9 = (C801390Vc9) C13LP.LJJJLL(LJIILIIL(str, str2));
                            if (c801390Vc9 != null) {
                                LJJIII(C801390Vc9.LIZ(c801390Vc9, 0, j, 0L, 503));
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJII(long j, String str, String str2) {
                            C801390Vc9 c801390Vc9 = (C801390Vc9) C13LP.LJJJLL(LJIILIIL(str, str2));
                            if (c801390Vc9 != null) {
                                LJJIII(C801390Vc9.LIZ(c801390Vc9, 0, 0L, j, 495));
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final boolean LJIIIZ(Message message, boolean z, boolean z2) {
                            Message messageLIZIZ;
                            Message messageLIZIZ2;
                            TakoMixFeed takoMixFeedLJIIIZ;
                            TakoMixFeed takoMixFeedLJIIIZ2;
                            Message messageLIZIZ3;
                            TakoSug takoSug;
                            Message messageLIZIZ4;
                            Message messageLIZIZ5;
                            TakoMixFeed takoMixFeedLJIIIZ3;
                            TakoMixFeed takoMixFeedLJIIIZ4;
                            Message messageLIZIZ6;
                            TakoDisclaimerInfo takoDisclaimerInfo;
                            Message messageLIZIZ7;
                            List<TakoInteractionConfig> list;
                            TakoMixFeed takoMixFeedLJIIIZ5;
                            TakoMixFeed takoMixFeedLJIIIZ6;
                            Message messageLIZIZ8;
                            List<TakoInteractionConfig> list2;
                            List<TakoInteractionConfig> list3;
                            Message messageLIZIZ9;
                            Message messageLIZIZ10;
                            Map<String, String> map;
                            int i;
                            Map<String, String> map2;
                            TakoMixFeed takoMixFeedLJIIIZ7;
                            Message messageLIZIZ11;
                            Message messageLIZIZ12;
                            List<TakoInteractionConfig> list4;
                            TakoMixFeed takoMixFeedLJII;
                            TakoMixFeed takoMixFeedLJII2;
                            Message messageLIZIZ13;
                            List<TakoInteractionConfig> list5;
                            List<TakoInteractionConfig> list6;
                            List<TakoInteractionConfig> list7;
                            TakoMixFeed takoMixFeedLJI;
                            TakoMixFeed takoMixFeedLJI2;
                            Message messageLIZIZ14;
                            List<TakoInteractionConfig> list8;
                            List<TakoInteractionConfig> list9;
                            Message messageLIZIZ15;
                            Message messageLIZIZ16;
                            TakoMixFeed takoMixFeedLJII3;
                            TakoMixFeed takoMixFeedLJII4;
                            Message messageLIZIZ17;
                            TakoDisclaimerInfo takoDisclaimerInfo2;
                            TakoMixFeed takoMixFeedLJI3;
                            TakoMixFeed takoMixFeedLJI4;
                            Message messageLIZIZ18;
                            TakoDisclaimerInfo takoDisclaimerInfo3;
                            Message messageLIZIZ19;
                            Message messageLIZIZ20;
                            TakoMixFeed takoMixFeedLJII5;
                            TakoMixFeed takoMixFeedLJII6;
                            Message messageLIZIZ21;
                            TakoSug takoSug2;
                            TakoMixFeed takoMixFeedLJI5;
                            TakoMixFeed takoMixFeedLJI6;
                            Message messageLIZIZ22;
                            TakoSug takoSug3;
                            String str;
                            C1862400yZ4 c1862400yZ4;
                            if (message.ext.imageTemplateInfo.length() <= 0 && (str = message.replyUuid) != null && str.length() != 0 && (c1862400yZ4 = (C1862400yZ4) C13LP.LJJJLL(LJIIJ(str))) != null) {
                                String strLIZLLL = c1862400yZ4.LJJLI;
                                if (strLIZLLL.length() == 0) {
                                    strLIZLLL = C1855920yOc.LIZLLL(C1862370yZ1.LIZIZ(c1862400yZ4));
                                }
                                if (strLIZLLL.length() > 0) {
                                    message.ext.imageTemplateInfo = strLIZLLL;
                                }
                            }
                            C1862400yZ4 c1862400yZ42 = (C1862400yZ4) C13LP.LJJJLL(LJIIJ(message.uuid));
                            if (c1862400yZ42 != null) {
                                String str2 = null;
                                if (((Boolean) C2279711EKz.LJIIIIZZ.getValue()).booleanValue()) {
                                    messageLIZIZ = C1862370yZ1.LIZIZ(c1862400yZ42);
                                } else {
                                    messageLIZIZ = null;
                                }
                                long j = c1862400yZ42.LJIILLIIL;
                                if (j != 0) {
                                    message.LIZLLL = j;
                                }
                                if (TextUtils.isEmpty(message.conversationId)) {
                                    message.conversationId = c1862400yZ42.LJ;
                                }
                                if (c1862400yZ42.LJJIJIIJIL) {
                                    message.LIZ = true;
                                }
                                if (C1697810uHb.LJIIJJI(1, 3, 2).contains(Integer.valueOf(c1862400yZ42.LJIIIZ)) && message.LIZIZ == 6) {
                                    message.LIZIZ = 2;
                                }
                                if (C1697810uHb.LJIIJJI(10, 8, 9).contains(Integer.valueOf(c1862400yZ42.LJIIIZ))) {
                                    message.LIZIZ = c1862400yZ42.LJIIIZ;
                                }
                                Boolean bool = c1862400yZ42.LJJIZ;
                                if (bool != null && message.LJIIIIZZ == null) {
                                    message.LJIIIIZZ = bool;
                                }
                                if (!C07IB.LIZ() && message.isMultiAnswer) {
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ19 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ19 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJI7 = messageLIZIZ19.LJI();
                                    if (takoMixFeedLJI7 != null && takoMixFeedLJI7.cacheSug != null && (((takoMixFeedLJI5 = message.LJI()) == null || takoMixFeedLJI5.cacheSug == null) && (takoMixFeedLJI6 = message.LJI()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ22 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ22 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJI8 = messageLIZIZ22.LJI();
                                        if (takoMixFeedLJI8 != null) {
                                            takoSug3 = takoMixFeedLJI8.cacheSug;
                                        } else {
                                            takoSug3 = null;
                                        }
                                        takoMixFeedLJI6.cacheSug = takoSug3;
                                    }
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ20 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ20 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJII7 = messageLIZIZ20.LJII();
                                    if (takoMixFeedLJII7 != null && takoMixFeedLJII7.cacheSug != null && (((takoMixFeedLJII5 = message.LJII()) == null || takoMixFeedLJII5.cacheSug == null) && (takoMixFeedLJII6 = message.LJII()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ21 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ21 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJII8 = messageLIZIZ21.LJII();
                                        if (takoMixFeedLJII8 != null) {
                                            takoSug2 = takoMixFeedLJII8.cacheSug;
                                        } else {
                                            takoSug2 = null;
                                        }
                                        takoMixFeedLJII6.cacheSug = takoSug2;
                                    }
                                } else {
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ2 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ2 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJIIIZ8 = messageLIZIZ2.LJIIIZ();
                                    if (takoMixFeedLJIIIZ8 != null && takoMixFeedLJIIIZ8.cacheSug != null && (((takoMixFeedLJIIIZ = message.LJIIIZ()) == null || takoMixFeedLJIIIZ.cacheSug == null) && (takoMixFeedLJIIIZ2 = message.LJIIIZ()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ3 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ3 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJIIIZ9 = messageLIZIZ3.LJIIIZ();
                                        if (takoMixFeedLJIIIZ9 != null) {
                                            takoSug = takoMixFeedLJIIIZ9.cacheSug;
                                        } else {
                                            takoSug = null;
                                        }
                                        takoMixFeedLJIIIZ2.cacheSug = takoSug;
                                    }
                                }
                                int i2 = c1862400yZ42.LJJII;
                                if (i2 != 0) {
                                    MessageExt messageExt = message.ext;
                                    if (messageExt.activeActionBar == 0) {
                                        messageExt.activeActionBar = i2;
                                    }
                                }
                                int i3 = c1862400yZ42.LJJIIJZLJL;
                                if (i3 != 0) {
                                    MessageExt messageExt2 = message.ext;
                                    if (messageExt2.activeAiImageSubBar == 0) {
                                        messageExt2.activeAiImageSubBar = i3;
                                    }
                                }
                                if (c1862400yZ42.LJJJJJ.length() > 0 && message.ext.modeSource.length() == 0) {
                                    message.ext.modeSource = c1862400yZ42.LJJJJJ;
                                }
                                if (c1862400yZ42.LJJJJLI.length() > 0 && message.ext.imageTemplateId.length() == 0) {
                                    message.ext.imageTemplateId = c1862400yZ42.LJJJJLI;
                                }
                                if (c1862400yZ42.LJJJJLL.length() > 0 && message.ext.imageTabId.length() == 0) {
                                    message.ext.imageTabId = c1862400yZ42.LJJJJLL;
                                }
                                if (c1862400yZ42.LJJJJZ.length() > 0 && message.ext.imageTemplateTab.length() == 0) {
                                    message.ext.imageTemplateTab = c1862400yZ42.LJJJJZ;
                                }
                                if (c1862400yZ42.LJJJJZI.length() > 0 && message.ext.imageStyleName.length() == 0) {
                                    message.ext.imageStyleName = c1862400yZ42.LJJJJZI;
                                }
                                if (messageLIZIZ == null) {
                                    messageLIZIZ4 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                } else {
                                    messageLIZIZ4 = messageLIZIZ;
                                }
                                if (messageLIZIZ4.ext.imageTemplateInfo.length() > 0 && message.ext.imageTemplateInfo.length() == 0) {
                                    message.ext.imageTemplateInfo = messageLIZIZ4.ext.imageTemplateInfo;
                                } else if (messageLIZIZ4.ext.legacyTemplateInfo.length() > 0 && message.ext.imageTemplateInfo.length() == 0) {
                                    message.ext.imageTemplateInfo = messageLIZIZ4.ext.legacyTemplateInfo;
                                }
                                if (!C07IB.LIZ() && message.isMultiAnswer) {
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ15 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ15 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJI9 = messageLIZIZ15.LJI();
                                    if (takoMixFeedLJI9 != null && takoMixFeedLJI9.disclaimer != null && (((takoMixFeedLJI3 = message.LJI()) == null || takoMixFeedLJI3.disclaimer == null) && (takoMixFeedLJI4 = message.LJI()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ18 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ18 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJI10 = messageLIZIZ18.LJI();
                                        if (takoMixFeedLJI10 != null) {
                                            takoDisclaimerInfo3 = takoMixFeedLJI10.disclaimer;
                                        } else {
                                            takoDisclaimerInfo3 = null;
                                        }
                                        takoMixFeedLJI4.disclaimer = takoDisclaimerInfo3;
                                    }
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ16 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ16 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJII9 = messageLIZIZ16.LJII();
                                    if (takoMixFeedLJII9 != null && takoMixFeedLJII9.disclaimer != null && (((takoMixFeedLJII3 = message.LJII()) == null || takoMixFeedLJII3.disclaimer == null) && (takoMixFeedLJII4 = message.LJII()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ17 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ17 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJII10 = messageLIZIZ17.LJII();
                                        if (takoMixFeedLJII10 != null) {
                                            takoDisclaimerInfo2 = takoMixFeedLJII10.disclaimer;
                                        } else {
                                            takoDisclaimerInfo2 = null;
                                        }
                                        takoMixFeedLJII4.disclaimer = takoDisclaimerInfo2;
                                    }
                                } else {
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ5 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ5 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJIIIZ10 = messageLIZIZ5.LJIIIZ();
                                    if (takoMixFeedLJIIIZ10 != null && takoMixFeedLJIIIZ10.disclaimer != null && (((takoMixFeedLJIIIZ3 = message.LJIIIZ()) == null || takoMixFeedLJIIIZ3.disclaimer == null) && (takoMixFeedLJIIIZ4 = message.LJIIIZ()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ6 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ6 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJIIIZ11 = messageLIZIZ6.LJIIIZ();
                                        if (takoMixFeedLJIIIZ11 != null) {
                                            takoDisclaimerInfo = takoMixFeedLJIIIZ11.disclaimer;
                                        } else {
                                            takoDisclaimerInfo = null;
                                        }
                                        takoMixFeedLJIIIZ4.disclaimer = takoDisclaimerInfo;
                                    }
                                }
                                if (!TextUtils.isEmpty(c1862400yZ42.LJJIIZ) && TextUtils.isEmpty(message.ext.imageShortcutKey)) {
                                    message.ext.imageShortcutKey = c1862400yZ42.LJJIIZ;
                                }
                                if (!C07IB.LIZ() && message.isMultiAnswer) {
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ11 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ11 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJI11 = messageLIZIZ11.LJI();
                                    if (takoMixFeedLJI11 != null && (list7 = takoMixFeedLJI11.interactionStatus) != null && !list7.isEmpty() && (((takoMixFeedLJI = message.LJI()) == null || (list9 = takoMixFeedLJI.interactionStatus) == null || list9.isEmpty()) && (takoMixFeedLJI2 = message.LJI()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ14 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ14 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJI12 = messageLIZIZ14.LJI();
                                        if (takoMixFeedLJI12 == null || (list8 = takoMixFeedLJI12.interactionStatus) == null) {
                                            list8 = C13BV.INSTANCE;
                                        }
                                        takoMixFeedLJI2.interactionStatus = list8;
                                    }
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ12 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ12 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJII11 = messageLIZIZ12.LJII();
                                    if (takoMixFeedLJII11 != null && (list4 = takoMixFeedLJII11.interactionStatus) != null && !list4.isEmpty() && (((takoMixFeedLJII = message.LJII()) == null || (list6 = takoMixFeedLJII.interactionStatus) == null || list6.isEmpty()) && (takoMixFeedLJII2 = message.LJII()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ13 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ13 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJII12 = messageLIZIZ13.LJII();
                                        if (takoMixFeedLJII12 == null || (list5 = takoMixFeedLJII12.interactionStatus) == null) {
                                            list5 = C13BV.INSTANCE;
                                        }
                                        takoMixFeedLJII2.interactionStatus = list5;
                                    }
                                } else {
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ7 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    } else {
                                        messageLIZIZ7 = messageLIZIZ;
                                    }
                                    TakoMixFeed takoMixFeedLJIIIZ12 = messageLIZIZ7.LJIIIZ();
                                    if (takoMixFeedLJIIIZ12 != null && (list = takoMixFeedLJIIIZ12.interactionStatus) != null && !list.isEmpty() && (((takoMixFeedLJIIIZ5 = message.LJIIIZ()) == null || (list3 = takoMixFeedLJIIIZ5.interactionStatus) == null || list3.isEmpty()) && (takoMixFeedLJIIIZ6 = message.LJIIIZ()) != null)) {
                                        if (messageLIZIZ == null) {
                                            messageLIZIZ8 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                        } else {
                                            messageLIZIZ8 = messageLIZIZ;
                                        }
                                        TakoMixFeed takoMixFeedLJIIIZ13 = messageLIZIZ8.LJIIIZ();
                                        if (takoMixFeedLJIIIZ13 == null || (list2 = takoMixFeedLJIIIZ13.interactionStatus) == null) {
                                            list2 = C13BV.INSTANCE;
                                        }
                                        takoMixFeedLJIIIZ6.interactionStatus = list2;
                                    }
                                }
                                if (messageLIZIZ == null) {
                                    messageLIZIZ9 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                } else {
                                    messageLIZIZ9 = messageLIZIZ;
                                }
                                TakoMixFeed takoMixFeedLJIIIZ14 = messageLIZIZ9.LJIIIZ();
                                if (takoMixFeedLJIIIZ14 != null && Boolean.parseBoolean(takoMixFeedLJIIIZ14.msgExt.get("video_gen_finish_flag")) && (takoMixFeedLJIIIZ7 = message.LJIIIZ()) != null) {
                                    takoMixFeedLJIIIZ7.msgExt.put("video_gen_finish_flag", "true");
                                    if (takoMixFeedLJIIIZ14.videoGenCard == null && takoMixFeedLJIIIZ7.videoGenCard != null) {
                                        takoMixFeedLJIIIZ7.videoGenCard = null;
                                    }
                                }
                                if (messageLIZIZ == null) {
                                    messageLIZIZ10 = C1862370yZ1.LIZIZ(c1862400yZ42);
                                } else {
                                    messageLIZIZ10 = messageLIZIZ;
                                }
                                if (messageLIZIZ10.msgType == 3) {
                                    if (!Intrinsics.LJFF(messageLIZIZ10.replyMsgId, CardStruct.IStatusCode.DEFAULT) && C123100dR.LIZ(messageLIZIZ10.replyMsgId) && (Intrinsics.LJFF(message.replyMsgId, CardStruct.IStatusCode.DEFAULT) || message.replyMsgId.length() == 0)) {
                                        message.replyMsgId = messageLIZIZ10.replyMsgId;
                                    }
                                    if (C123100dR.LIZ(messageLIZIZ10.replyUuid) && message.replyUuid.length() == 0) {
                                        message.replyUuid = messageLIZIZ10.replyUuid;
                                    }
                                }
                                if (C1697810uHb.LJIIJJI(13, 14).contains(Integer.valueOf(c1862400yZ42.LJIIIZ)) && !z2) {
                                    return false;
                                }
                                int i4 = c1862400yZ42.LJJJJI;
                                if (i4 != 0 && message.retried == 0) {
                                    message.retried = i4;
                                }
                                int i5 = c1862400yZ42.LJJJJIZL;
                                if (i5 != 0 && message.hidePushMessageImageButton == 0) {
                                    message.hidePushMessageImageButton = i5;
                                }
                                if (!z) {
                                    if (messageLIZIZ == null) {
                                        messageLIZIZ = C1862370yZ1.LIZIZ(c1862400yZ42);
                                    }
                                    TakoMixFeed takoMixFeedLJIIIZ15 = messageLIZIZ.LJIIIZ();
                                    if (takoMixFeedLJIIIZ15 != null && (map2 = takoMixFeedLJIIIZ15.msgExt) != null) {
                                        str2 = map2.get("lock_local_data");
                                    }
                                    if (Boolean.parseBoolean(str2) && (i = message.LIZIZ) != 8 && i != 9 && i != 10) {
                                        return false;
                                    }
                                } else {
                                    TakoMixFeed takoMixFeedLJIIIZ16 = message.LJIIIZ();
                                    if (takoMixFeedLJIIIZ16 != null && (map = takoMixFeedLJIIIZ16.msgExt) != null) {
                                        map.put("lock_local_data", "true");
                                    }
                                }
                                LJJIIJ(C1862370yZ1.LIZ(message));
                                return false;
                            }
                            LJJI(C1862370yZ1.LIZ(message));
                            return true;
                        }

                        @Override // X.InterfaceC1863480yao
                        public final void LJIJI(int i, String str, String str2) {
                            C801390Vc9 c801390Vc9 = (C801390Vc9) C13LP.LJJJLL(LJIILIIL(str, str2));
                            if (c801390Vc9 != null) {
                                LJJIII(C801390Vc9.LIZ(c801390Vc9, i, 0L, 0L, 507));
                            }
                        }

                        public final List LJJIFFI(int i, long j, long j2, String str) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            boolean z;
                            String string6;
                            String string7;
                            String string8;
                            boolean z2;
                            boolean z3;
                            Integer numValueOf;
                            String string9;
                            String string10;
                            String string11;
                            String string12;
                            boolean z4;
                            String string13;
                            String string14;
                            Integer numValueOf2;
                            boolean z5;
                            Boolean boolValueOf;
                            String string15;
                            boolean z6;
                            String string16;
                            Integer numValueOf3;
                            String string17;
                            String string18;
                            String string19;
                            String string20;
                            String string21;
                            String string22;
                            String string23;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(4, "SELECT * FROM (SELECT * FROM MESSAGE WHERE SERVER_SEQ < ? AND CLIENT_SEQ < ? AND CONVERSATION_ID = ? AND CLIENT_STATUS != 8 AND CLIENT_STATUS != 10 AND CLIENT_STATUS != 9 AND IS_HIDDEN != 1 ORDER BY CLIENT_SEQ DESC, SERVER_SEQ DESC LIMIT ?) ORDER BY CLIENT_SEQ ASC, SERVER_SEQ ASC");
                            c0vn5LIZLLL.LJIJ(1, j);
                            c0vn5LIZLLL.LJIJ(2, j2);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(3);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(3, str);
                            }
                            c0vn5LIZLLL.LJIJ(4, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UUID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_SEQ");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SERVER_SEQ");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SESSION_ID");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_ID");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTION_ID");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_STATUS");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_TYPE");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_TYPE");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_BOT_ID");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_USER_ID");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_IS_SELF");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_TIME");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_SEQ");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_SESSION_ID");
                                    int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION");
                                    int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "BODY");
                                    int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "MULTI_BODY");
                                    int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_MULTI_ANSWER");
                                    int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "SELECTED_ANSWER_INDEX");
                                    int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_DEGRADED");
                                    int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_STATUS");
                                    int iLIZIZ26 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_LOG");
                                    int iLIZIZ27 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_ACTION_BAR");
                                    int iLIZIZ28 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_TEMPLATE_TYPE");
                                    int iLIZIZ29 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_HASHTAGS");
                                    int iLIZIZ30 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_AI_IMAGE_ACTION_BAR");
                                    int iLIZIZ31 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_IMAGE_SHORTCUT_KEY");
                                    int iLIZIZ32 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRY_TIME");
                                    int iLIZIZ33 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_UUID");
                                    int iLIZIZ34 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_MESSAGE_ID");
                                    int iLIZIZ35 = C795450VIh.LIZIZ(cursorLIZIZ, "READ");
                                    int iLIZIZ36 = C795450VIh.LIZIZ(cursorLIZIZ, "CHANNEL");
                                    int iLIZIZ37 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_ACTION");
                                    int iLIZIZ38 = C795450VIh.LIZIZ(cursorLIZIZ, "LYNX_DATE");
                                    int iLIZIZ39 = C795450VIh.LIZIZ(cursorLIZIZ, "PUSH_RECEIVE_TIME");
                                    int iLIZIZ40 = C795450VIh.LIZIZ(cursorLIZIZ, "THINK_INFO_EXPANDED");
                                    int iLIZIZ41 = C795450VIh.LIZIZ(cursorLIZIZ, "GEN_STYLE");
                                    int iLIZIZ42 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_ID");
                                    int iLIZIZ43 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_SEQ_ID");
                                    int iLIZIZ44 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_HIDDEN");
                                    int iLIZIZ45 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRIED");
                                    int iLIZIZ46 = C795450VIh.LIZIZ(cursorLIZIZ, "HIDE_PUSH_MESSAGE_BUTTON");
                                    int iLIZIZ47 = C795450VIh.LIZIZ(cursorLIZIZ, "MODE_SOURCE");
                                    int iLIZIZ48 = C795450VIh.LIZIZ(cursorLIZIZ, "AIGC_STANDARD_RATIO");
                                    int iLIZIZ49 = C795450VIh.LIZIZ(cursorLIZIZ, "INPUT_SKILL_MODE");
                                    int iLIZIZ50 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_ID");
                                    int iLIZIZ51 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TAB_ID");
                                    int iLIZIZ52 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_TAB");
                                    int iLIZIZ53 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_STYLE_NAME");
                                    int iLIZIZ54 = C795450VIh.LIZIZ(cursorLIZIZ, "EDIT_INFO");
                                    int iLIZIZ55 = C795450VIh.LIZIZ(cursorLIZIZ, "REFERENCE_INFO");
                                    int iLIZIZ56 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_PUSH_MSG");
                                    int iLIZIZ57 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_UNCHANGED_TAKO_TEMPLATE");
                                    int iLIZIZ58 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_REGEN_DEPRECATED");
                                    int iLIZIZ59 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_INFO");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string24 = null;
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        long j3 = cursorLIZIZ.getLong(iLIZIZ3);
                                        long j4 = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ7);
                                        }
                                        long j5 = cursorLIZIZ.getLong(iLIZIZ8);
                                        long j6 = cursorLIZIZ.getLong(iLIZIZ9);
                                        int i2 = cursorLIZIZ.getInt(iLIZIZ10);
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ11);
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ12);
                                        long j7 = cursorLIZIZ.getLong(iLIZIZ13);
                                        long j8 = cursorLIZIZ.getLong(iLIZIZ14);
                                        if (cursorLIZIZ.getInt(iLIZIZ15) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        long j9 = cursorLIZIZ.getLong(iLIZIZ16);
                                        long j10 = cursorLIZIZ.getLong(iLIZIZ17);
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ19);
                                        if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursorLIZIZ.getString(iLIZIZ20);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursorLIZIZ.getString(iLIZIZ21);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ23);
                                        if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int i7 = cursorLIZIZ.getInt(iLIZIZ25);
                                        long j11 = cursorLIZIZ.getLong(iLIZIZ26);
                                        int i8 = cursorLIZIZ.getInt(iLIZIZ27);
                                        if (cursorLIZIZ.isNull(iLIZIZ28)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ28));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ29)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursorLIZIZ.getString(iLIZIZ29);
                                        }
                                        int i9 = cursorLIZIZ.getInt(iLIZIZ30);
                                        if (cursorLIZIZ.isNull(iLIZIZ31)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursorLIZIZ.getString(iLIZIZ31);
                                        }
                                        int i10 = cursorLIZIZ.getInt(iLIZIZ32);
                                        if (cursorLIZIZ.isNull(iLIZIZ33)) {
                                            string11 = null;
                                        } else {
                                            string11 = cursorLIZIZ.getString(iLIZIZ33);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ34)) {
                                            string12 = null;
                                        } else {
                                            string12 = cursorLIZIZ.getString(iLIZIZ34);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ35) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        int i11 = cursorLIZIZ.getInt(iLIZIZ36);
                                        if (cursorLIZIZ.isNull(iLIZIZ37)) {
                                            string13 = null;
                                        } else {
                                            string13 = cursorLIZIZ.getString(iLIZIZ37);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ38)) {
                                            string14 = null;
                                        } else {
                                            string14 = cursorLIZIZ.getString(iLIZIZ38);
                                        }
                                        long j12 = cursorLIZIZ.getLong(iLIZIZ39);
                                        if (!cursorLIZIZ.isNull(iLIZIZ40)) {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ40));
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        if (numValueOf2 == null) {
                                            boolValueOf = null;
                                        } else {
                                            if (numValueOf2.intValue() != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z5);
                                        }
                                        int i12 = cursorLIZIZ.getInt(iLIZIZ41);
                                        if (cursorLIZIZ.isNull(iLIZIZ42)) {
                                            string15 = null;
                                        } else {
                                            string15 = cursorLIZIZ.getString(iLIZIZ42);
                                        }
                                        long j13 = cursorLIZIZ.getLong(iLIZIZ43);
                                        if (cursorLIZIZ.getInt(iLIZIZ44) != 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        int i13 = cursorLIZIZ.getInt(iLIZIZ45);
                                        int i14 = cursorLIZIZ.getInt(iLIZIZ46);
                                        if (cursorLIZIZ.isNull(iLIZIZ47)) {
                                            string16 = null;
                                        } else {
                                            string16 = cursorLIZIZ.getString(iLIZIZ47);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ48)) {
                                            numValueOf3 = null;
                                        } else {
                                            numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ48));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ49)) {
                                            string17 = null;
                                        } else {
                                            string17 = cursorLIZIZ.getString(iLIZIZ49);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ50)) {
                                            string18 = null;
                                        } else {
                                            string18 = cursorLIZIZ.getString(iLIZIZ50);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ51)) {
                                            string19 = null;
                                        } else {
                                            string19 = cursorLIZIZ.getString(iLIZIZ51);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ52)) {
                                            string20 = null;
                                        } else {
                                            string20 = cursorLIZIZ.getString(iLIZIZ52);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ53)) {
                                            string21 = null;
                                        } else {
                                            string21 = cursorLIZIZ.getString(iLIZIZ53);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ54)) {
                                            string22 = null;
                                        } else {
                                            string22 = cursorLIZIZ.getString(iLIZIZ54);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ55)) {
                                            string23 = null;
                                        } else {
                                            string23 = cursorLIZIZ.getString(iLIZIZ55);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ56) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ57) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ58) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!cursorLIZIZ.isNull(iLIZIZ59)) {
                                            string24 = cursorLIZIZ.getString(iLIZIZ59);
                                        }
                                        arrayList.add(new C1862400yZ4(string, string2, j3, j4, string3, string4, string5, j5, j6, i2, i3, i4, j7, j8, z, j9, j10, string6, i5, string7, string8, z2, i6, z3, i7, j11, i8, numValueOf, string9, i9, string10, i10, string11, string12, z4, i11, string13, string14, j12, boolValueOf, i12, string15, j13, z6, i13, i14, string16, numValueOf3, string17, string18, string19, string20, string21, string22, string23, z7, z8, z9, string24));
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }

                        @Override // X.InterfaceC1863480yao
                        public final List LJIJJLI(int i, long j, long j2, String str, String str2) {
                            if (str2.length() == 0) {
                                return LJJIFFI(i, j, j2, str);
                            }
                            return LJJII(i, j, j2, str, str2);
                        }

                        public final List LJJII(int i, long j, long j2, String str, String str2) throws Throwable {
                            String string;
                            String string2;
                            String string3;
                            String string4;
                            String string5;
                            boolean z;
                            String string6;
                            String string7;
                            String string8;
                            boolean z2;
                            boolean z3;
                            Integer numValueOf;
                            String string9;
                            String string10;
                            String string11;
                            String string12;
                            boolean z4;
                            String string13;
                            String string14;
                            Integer numValueOf2;
                            boolean z5;
                            Boolean boolValueOf;
                            String string15;
                            boolean z6;
                            String string16;
                            Integer numValueOf3;
                            String string17;
                            String string18;
                            String string19;
                            String string20;
                            String string21;
                            String string22;
                            String string23;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            C0VN5 c0vn5LIZLLL = C0VN5.LIZLLL(5, "SELECT * FROM (SELECT * FROM MESSAGE WHERE SERVER_SEQ < ? AND CLIENT_SEQ < ? AND CONVERSATION_ID = ? AND SUB_CONVERSATION_ID = ? AND CLIENT_STATUS != 8 AND CLIENT_STATUS != 10 AND CLIENT_STATUS != 9 AND IS_HIDDEN != 1 ORDER BY CLIENT_SEQ DESC, SERVER_SEQ DESC LIMIT ?) ORDER BY CLIENT_SEQ ASC, SERVER_SEQ ASC");
                            c0vn5LIZLLL.LJIJ(1, j);
                            c0vn5LIZLLL.LJIJ(2, j2);
                            if (str == null) {
                                c0vn5LIZLLL.LLD(3);
                            } else {
                                c0vn5LIZLLL.LJIILIIL(3, str);
                            }
                            c0vn5LIZLLL.LJIILIIL(4, str2);
                            c0vn5LIZLLL.LJIJ(5, i);
                            this.LIZ.assertNotSuspendingTransaction();
                            Cursor cursorLIZIZ = C0VN0.LIZIZ(this.LIZ, c0vn5LIZLLL, false);
                            try {
                                int iLIZIZ = C795450VIh.LIZIZ(cursorLIZIZ, "UUID");
                                int iLIZIZ2 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_ID");
                                int iLIZIZ3 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_SEQ");
                                int iLIZIZ4 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SERVER_SEQ");
                                int iLIZIZ5 = C795450VIh.LIZIZ(cursorLIZIZ, "CONVERSATION_ID");
                                int iLIZIZ6 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_CONVERSATION_ID");
                                int iLIZIZ7 = C795450VIh.LIZIZ(cursorLIZIZ, "SUB_SESSION_ID");
                                int iLIZIZ8 = C795450VIh.LIZIZ(cursorLIZIZ, "BOT_ID");
                                int iLIZIZ9 = C795450VIh.LIZIZ(cursorLIZIZ, "ACTION_ID");
                                int iLIZIZ10 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_STATUS");
                                int iLIZIZ11 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_TYPE");
                                int iLIZIZ12 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_TYPE");
                                int iLIZIZ13 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_BOT_ID");
                                int iLIZIZ14 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_USER_ID");
                                try {
                                    int iLIZIZ15 = C795450VIh.LIZIZ(cursorLIZIZ, "SENDER_IS_SELF");
                                    int iLIZIZ16 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_TIME");
                                    int iLIZIZ17 = C795450VIh.LIZIZ(cursorLIZIZ, "CLIENT_SEQ");
                                    int iLIZIZ18 = C795450VIh.LIZIZ(cursorLIZIZ, "MESSAGE_SESSION_ID");
                                    int iLIZIZ19 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION");
                                    int iLIZIZ20 = C795450VIh.LIZIZ(cursorLIZIZ, "BODY");
                                    int iLIZIZ21 = C795450VIh.LIZIZ(cursorLIZIZ, "MULTI_BODY");
                                    int iLIZIZ22 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_MULTI_ANSWER");
                                    int iLIZIZ23 = C795450VIh.LIZIZ(cursorLIZIZ, "SELECTED_ANSWER_INDEX");
                                    int iLIZIZ24 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_DEGRADED");
                                    int iLIZIZ25 = C795450VIh.LIZIZ(cursorLIZIZ, "SERVER_STATUS");
                                    int iLIZIZ26 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_LOG");
                                    int iLIZIZ27 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_ACTION_BAR");
                                    int iLIZIZ28 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_TEMPLATE_TYPE");
                                    int iLIZIZ29 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_HASHTAGS");
                                    int iLIZIZ30 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_ACTIVE_AI_IMAGE_ACTION_BAR");
                                    int iLIZIZ31 = C795450VIh.LIZIZ(cursorLIZIZ, "EXT_IMAGE_SHORTCUT_KEY");
                                    int iLIZIZ32 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRY_TIME");
                                    int iLIZIZ33 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_UUID");
                                    int iLIZIZ34 = C795450VIh.LIZIZ(cursorLIZIZ, "REPLY_MESSAGE_ID");
                                    int iLIZIZ35 = C795450VIh.LIZIZ(cursorLIZIZ, "READ");
                                    int iLIZIZ36 = C795450VIh.LIZIZ(cursorLIZIZ, "CHANNEL");
                                    int iLIZIZ37 = C795450VIh.LIZIZ(cursorLIZIZ, "UPDATE_ACTION");
                                    int iLIZIZ38 = C795450VIh.LIZIZ(cursorLIZIZ, "LYNX_DATE");
                                    int iLIZIZ39 = C795450VIh.LIZIZ(cursorLIZIZ, "PUSH_RECEIVE_TIME");
                                    int iLIZIZ40 = C795450VIh.LIZIZ(cursorLIZIZ, "THINK_INFO_EXPANDED");
                                    int iLIZIZ41 = C795450VIh.LIZIZ(cursorLIZIZ, "GEN_STYLE");
                                    int iLIZIZ42 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_ID");
                                    int iLIZIZ43 = C795450VIh.LIZIZ(cursorLIZIZ, "VERSION_SEQ_ID");
                                    int iLIZIZ44 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_HIDDEN");
                                    int iLIZIZ45 = C795450VIh.LIZIZ(cursorLIZIZ, "RETRIED");
                                    int iLIZIZ46 = C795450VIh.LIZIZ(cursorLIZIZ, "HIDE_PUSH_MESSAGE_BUTTON");
                                    int iLIZIZ47 = C795450VIh.LIZIZ(cursorLIZIZ, "MODE_SOURCE");
                                    int iLIZIZ48 = C795450VIh.LIZIZ(cursorLIZIZ, "AIGC_STANDARD_RATIO");
                                    int iLIZIZ49 = C795450VIh.LIZIZ(cursorLIZIZ, "INPUT_SKILL_MODE");
                                    int iLIZIZ50 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_ID");
                                    int iLIZIZ51 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TAB_ID");
                                    int iLIZIZ52 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_TAB");
                                    int iLIZIZ53 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_STYLE_NAME");
                                    int iLIZIZ54 = C795450VIh.LIZIZ(cursorLIZIZ, "EDIT_INFO");
                                    int iLIZIZ55 = C795450VIh.LIZIZ(cursorLIZIZ, "REFERENCE_INFO");
                                    int iLIZIZ56 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_PUSH_MSG");
                                    int iLIZIZ57 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_UNCHANGED_TAKO_TEMPLATE");
                                    int iLIZIZ58 = C795450VIh.LIZIZ(cursorLIZIZ, "IS_REGEN_DEPRECATED");
                                    int iLIZIZ59 = C795450VIh.LIZIZ(cursorLIZIZ, "IMAGE_TEMPLATE_INFO");
                                    ArrayList arrayList = new ArrayList(cursorLIZIZ.getCount());
                                    while (cursorLIZIZ.moveToNext()) {
                                        String string24 = null;
                                        if (cursorLIZIZ.isNull(iLIZIZ)) {
                                            string = null;
                                        } else {
                                            string = cursorLIZIZ.getString(iLIZIZ);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ2)) {
                                            string2 = null;
                                        } else {
                                            string2 = cursorLIZIZ.getString(iLIZIZ2);
                                        }
                                        long j3 = cursorLIZIZ.getLong(iLIZIZ3);
                                        long j4 = cursorLIZIZ.getLong(iLIZIZ4);
                                        if (cursorLIZIZ.isNull(iLIZIZ5)) {
                                            string3 = null;
                                        } else {
                                            string3 = cursorLIZIZ.getString(iLIZIZ5);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ6)) {
                                            string4 = null;
                                        } else {
                                            string4 = cursorLIZIZ.getString(iLIZIZ6);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ7)) {
                                            string5 = null;
                                        } else {
                                            string5 = cursorLIZIZ.getString(iLIZIZ7);
                                        }
                                        long j5 = cursorLIZIZ.getLong(iLIZIZ8);
                                        long j6 = cursorLIZIZ.getLong(iLIZIZ9);
                                        int i2 = cursorLIZIZ.getInt(iLIZIZ10);
                                        int i3 = cursorLIZIZ.getInt(iLIZIZ11);
                                        int i4 = cursorLIZIZ.getInt(iLIZIZ12);
                                        long j7 = cursorLIZIZ.getLong(iLIZIZ13);
                                        long j8 = cursorLIZIZ.getLong(iLIZIZ14);
                                        if (cursorLIZIZ.getInt(iLIZIZ15) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        long j9 = cursorLIZIZ.getLong(iLIZIZ16);
                                        long j10 = cursorLIZIZ.getLong(iLIZIZ17);
                                        if (cursorLIZIZ.isNull(iLIZIZ18)) {
                                            string6 = null;
                                        } else {
                                            string6 = cursorLIZIZ.getString(iLIZIZ18);
                                        }
                                        int i5 = cursorLIZIZ.getInt(iLIZIZ19);
                                        if (cursorLIZIZ.isNull(iLIZIZ20)) {
                                            string7 = null;
                                        } else {
                                            string7 = cursorLIZIZ.getString(iLIZIZ20);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ21)) {
                                            string8 = null;
                                        } else {
                                            string8 = cursorLIZIZ.getString(iLIZIZ21);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ22) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        int i6 = cursorLIZIZ.getInt(iLIZIZ23);
                                        if (cursorLIZIZ.getInt(iLIZIZ24) != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        int i7 = cursorLIZIZ.getInt(iLIZIZ25);
                                        long j11 = cursorLIZIZ.getLong(iLIZIZ26);
                                        int i8 = cursorLIZIZ.getInt(iLIZIZ27);
                                        if (cursorLIZIZ.isNull(iLIZIZ28)) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ28));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ29)) {
                                            string9 = null;
                                        } else {
                                            string9 = cursorLIZIZ.getString(iLIZIZ29);
                                        }
                                        int i9 = cursorLIZIZ.getInt(iLIZIZ30);
                                        if (cursorLIZIZ.isNull(iLIZIZ31)) {
                                            string10 = null;
                                        } else {
                                            string10 = cursorLIZIZ.getString(iLIZIZ31);
                                        }
                                        int i10 = cursorLIZIZ.getInt(iLIZIZ32);
                                        if (cursorLIZIZ.isNull(iLIZIZ33)) {
                                            string11 = null;
                                        } else {
                                            string11 = cursorLIZIZ.getString(iLIZIZ33);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ34)) {
                                            string12 = null;
                                        } else {
                                            string12 = cursorLIZIZ.getString(iLIZIZ34);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ35) != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        int i11 = cursorLIZIZ.getInt(iLIZIZ36);
                                        if (cursorLIZIZ.isNull(iLIZIZ37)) {
                                            string13 = null;
                                        } else {
                                            string13 = cursorLIZIZ.getString(iLIZIZ37);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ38)) {
                                            string14 = null;
                                        } else {
                                            string14 = cursorLIZIZ.getString(iLIZIZ38);
                                        }
                                        long j12 = cursorLIZIZ.getLong(iLIZIZ39);
                                        if (!cursorLIZIZ.isNull(iLIZIZ40)) {
                                            numValueOf2 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ40));
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        if (numValueOf2 == null) {
                                            boolValueOf = null;
                                        } else {
                                            if (numValueOf2.intValue() != 0) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            boolValueOf = Boolean.valueOf(z5);
                                        }
                                        int i12 = cursorLIZIZ.getInt(iLIZIZ41);
                                        if (cursorLIZIZ.isNull(iLIZIZ42)) {
                                            string15 = null;
                                        } else {
                                            string15 = cursorLIZIZ.getString(iLIZIZ42);
                                        }
                                        long j13 = cursorLIZIZ.getLong(iLIZIZ43);
                                        if (cursorLIZIZ.getInt(iLIZIZ44) != 0) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        int i13 = cursorLIZIZ.getInt(iLIZIZ45);
                                        int i14 = cursorLIZIZ.getInt(iLIZIZ46);
                                        if (cursorLIZIZ.isNull(iLIZIZ47)) {
                                            string16 = null;
                                        } else {
                                            string16 = cursorLIZIZ.getString(iLIZIZ47);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ48)) {
                                            numValueOf3 = null;
                                        } else {
                                            numValueOf3 = Integer.valueOf(cursorLIZIZ.getInt(iLIZIZ48));
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ49)) {
                                            string17 = null;
                                        } else {
                                            string17 = cursorLIZIZ.getString(iLIZIZ49);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ50)) {
                                            string18 = null;
                                        } else {
                                            string18 = cursorLIZIZ.getString(iLIZIZ50);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ51)) {
                                            string19 = null;
                                        } else {
                                            string19 = cursorLIZIZ.getString(iLIZIZ51);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ52)) {
                                            string20 = null;
                                        } else {
                                            string20 = cursorLIZIZ.getString(iLIZIZ52);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ53)) {
                                            string21 = null;
                                        } else {
                                            string21 = cursorLIZIZ.getString(iLIZIZ53);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ54)) {
                                            string22 = null;
                                        } else {
                                            string22 = cursorLIZIZ.getString(iLIZIZ54);
                                        }
                                        if (cursorLIZIZ.isNull(iLIZIZ55)) {
                                            string23 = null;
                                        } else {
                                            string23 = cursorLIZIZ.getString(iLIZIZ55);
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ56) != 0) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ57) != 0) {
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        if (cursorLIZIZ.getInt(iLIZIZ58) != 0) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        if (!cursorLIZIZ.isNull(iLIZIZ59)) {
                                            string24 = cursorLIZIZ.getString(iLIZIZ59);
                                        }
                                        arrayList.add(new C1862400yZ4(string, string2, j3, j4, string3, string4, string5, j5, j6, i2, i3, i4, j7, j8, z, j9, j10, string6, i5, string7, string8, z2, i6, z3, i7, j11, i8, numValueOf, string9, i9, string10, i10, string11, string12, z4, i11, string13, string14, j12, boolValueOf, i12, string15, j13, z6, i13, i14, string16, numValueOf3, string17, string18, string19, string20, string21, string22, string23, z7, z8, z9, string24));
                                    }
                                    cursorLIZIZ.close();
                                    c0vn5LIZLLL.release();
                                    return arrayList;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLIZIZ.close();
                                            c0vn5LIZLLL.release();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    };
                }
                c801350Vc5 = this.LLILLJJLI;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c801350Vc5;
    }

    @Override // X.AbstractC796540VMm
    public final void clearAllTables() {
        super.assertNotMainThread();
        C0VLF c0vlfLJLJJI = this.mOpenHelper.LJLJJI();
        try {
            super.beginTransaction();
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `CONFIG`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `MESSAGE`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `CONVERSATION`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `CONFIG_NEW`");
            c0vlfLJLJJI.LJIILJJIL("DELETE FROM `CONVERSATION_NEW`");
            super.setTransactionSuccessful();
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (c0vlfLJLJJI.LJJIJIIJI()) {
                return;
            }
            c0vlfLJLJJI.LJIILJJIL("VACUUM");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.endTransaction();
            c0vlfLJLJJI.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!c0vlfLJLJJI.LJJIJIIJI()) {
                c0vlfLJLJJI.LJIILJJIL("VACUUM");
            }
            throw th;
        }
    }

    @Override // X.AbstractC796540VMm
    public final C796620VMu createInvalidationTracker() {
        return new C796620VMu(this, new HashMap(0), new HashMap(0), "CONFIG", "MESSAGE", "CONVERSATION", "CONFIG_NEW", "CONVERSATION_NEW");
    }

    @Override // X.AbstractC796540VMm
    public final Set<Class<? extends InterfaceC2275591E5d>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // X.AbstractC796540VMm
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InterfaceC1863480yao.class, Collections.emptyList());
        return map;
    }

    @Override // X.AbstractC796540VMm
    public final InterfaceC796190VLd createOpenHelper(C796520VMk c796520VMk) {
        C0VN2 c0vn2 = new C0VN2(c796520VMk, new C0VN3() { // from class: X.0Vc4
            @Override // X.C0VN3
            public final void onPostMigrate(C0VLF c0vlf) {
            }

            {
                super(44);
            }

            @Override // X.C0VN3
            public final void createAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `CONFIG` (`ID` INTEGER NOT NULL, `TIK_BOT_CONVERSATION_ID` TEXT NOT NULL, `MESSAGE_CURSOR` INTEGER NOT NULL, `SHOWED_DISCLAIMER_POPUP` INTEGER NOT NULL, `ACCEPTED_DISCLAIMER_POPUP` INTEGER NOT NULL, `DISCLAIMER_POPUP_TYPE` INTEGER NOT NULL, `SHOWED_MEMORY_GUIDE_POPUP` INTEGER NOT NULL, `SWITCH_STATUS` TEXT NOT NULL, `USER_SEND` INTEGER NOT NULL, `BOT_ID` INTEGER NOT NULL, `BOT_SOURCE` INTEGER NOT NULL, `SHOWED_LANGUAGE_STYLE_GUIDE_POPUP` INTEGER NOT NULL, PRIMARY KEY(`ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `MESSAGE` (`UUID` TEXT NOT NULL, `MESSAGE_ID` TEXT NOT NULL, `SERVER_SEQ` INTEGER NOT NULL, `SUB_SERVER_SEQ` INTEGER NOT NULL, `CONVERSATION_ID` TEXT NOT NULL, `SUB_CONVERSATION_ID` TEXT NOT NULL, `SUB_SESSION_ID` TEXT NOT NULL, `BOT_ID` INTEGER NOT NULL, `ACTION_ID` INTEGER NOT NULL, `CLIENT_STATUS` INTEGER NOT NULL, `MESSAGE_TYPE` INTEGER NOT NULL, `SENDER_TYPE` INTEGER NOT NULL, `SENDER_BOT_ID` INTEGER NOT NULL, `SENDER_USER_ID` INTEGER NOT NULL, `SENDER_IS_SELF` INTEGER NOT NULL, `SERVER_TIME` INTEGER NOT NULL, `CLIENT_SEQ` INTEGER NOT NULL, `MESSAGE_SESSION_ID` TEXT NOT NULL, `VERSION` INTEGER NOT NULL, `BODY` TEXT NOT NULL, `MULTI_BODY` TEXT NOT NULL, `IS_MULTI_ANSWER` INTEGER NOT NULL, `SELECTED_ANSWER_INDEX` INTEGER NOT NULL, `IS_DEGRADED` INTEGER NOT NULL, `SERVER_STATUS` INTEGER NOT NULL, `EXT_LOG` INTEGER NOT NULL, `EXT_ACTIVE_ACTION_BAR` INTEGER NOT NULL, `EXT_ACTIVE_TEMPLATE_TYPE` INTEGER, `EXT_HASHTAGS` TEXT NOT NULL, `EXT_ACTIVE_AI_IMAGE_ACTION_BAR` INTEGER NOT NULL, `EXT_IMAGE_SHORTCUT_KEY` TEXT NOT NULL, `RETRY_TIME` INTEGER NOT NULL, `REPLY_UUID` TEXT NOT NULL, `REPLY_MESSAGE_ID` TEXT NOT NULL, `READ` INTEGER NOT NULL, `CHANNEL` INTEGER NOT NULL DEFAULT 0, `UPDATE_ACTION` TEXT NOT NULL, `LYNX_DATE` TEXT NOT NULL, `PUSH_RECEIVE_TIME` INTEGER NOT NULL, `THINK_INFO_EXPANDED` INTEGER, `GEN_STYLE` INTEGER NOT NULL, `VERSION_ID` TEXT NOT NULL, `VERSION_SEQ_ID` INTEGER NOT NULL, `IS_HIDDEN` INTEGER NOT NULL, `RETRIED` INTEGER NOT NULL, `HIDE_PUSH_MESSAGE_BUTTON` INTEGER NOT NULL, `MODE_SOURCE` TEXT NOT NULL, `AIGC_STANDARD_RATIO` INTEGER, `INPUT_SKILL_MODE` TEXT, `IMAGE_TEMPLATE_ID` TEXT NOT NULL, `IMAGE_TAB_ID` TEXT NOT NULL, `IMAGE_TEMPLATE_TAB` TEXT NOT NULL, `IMAGE_STYLE_NAME` TEXT NOT NULL, `EDIT_INFO` TEXT NOT NULL, `REFERENCE_INFO` TEXT NOT NULL, `IS_PUSH_MSG` INTEGER NOT NULL, `IS_UNCHANGED_TAKO_TEMPLATE` INTEGER NOT NULL, `IS_REGEN_DEPRECATED` INTEGER NOT NULL, `IMAGE_TEMPLATE_INFO` TEXT NOT NULL, PRIMARY KEY(`UUID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `CONVERSATION` (`CONVERSATION_ID` TEXT NOT NULL, `HISTORY_CURSOR` INTEGER NOT NULL, `READ_CURSOR` INTEGER NOT NULL, PRIMARY KEY(`CONVERSATION_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `CONFIG_NEW` (`TIK_BOT_CONVERSATION_ID` TEXT NOT NULL, `MESSAGE_CURSOR` INTEGER NOT NULL, `SHOWED_DISCLAIMER_POPUP` INTEGER NOT NULL, `ACCEPTED_DISCLAIMER_POPUP` INTEGER NOT NULL, `DISCLAIMER_POPUP_TYPE` INTEGER NOT NULL, `SHOWED_MEMORY_GUIDE_POPUP` INTEGER NOT NULL, `SWITCH_STATUS` TEXT NOT NULL, `USER_SEND` INTEGER NOT NULL, `BOT_ID` INTEGER NOT NULL, `BOT_SOURCE` INTEGER NOT NULL, `SHOWED_LANGUAGE_STYLE_GUIDE_POPUP` INTEGER NOT NULL, PRIMARY KEY(`TIK_BOT_CONVERSATION_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `CONVERSATION_NEW` (`CONVERSATION_ID` TEXT NOT NULL, `SUB_CONVERSATION_ID` TEXT NOT NULL, `STATUS` INTEGER NOT NULL, `HISTORY_CURSOR` INTEGER NOT NULL, `READ_CURSOR` INTEGER NOT NULL, `TITLE` TEXT, `UNREAD_COUNT` INTEGER NOT NULL, `LATEST_MESSAGE_TIME` INTEGER NOT NULL, `RELATED_VIDEO` TEXT, PRIMARY KEY(`CONVERSATION_ID`, `SUB_CONVERSATION_ID`))");
                c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                c0vlf.LJIILJJIL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '255fb31d9953f32c41a70a96cdee9a06')");
            }

            @Override // X.C0VN3
            public final void dropAllTables(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `CONFIG`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `MESSAGE`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `CONVERSATION`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `CONFIG_NEW`");
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS `CONVERSATION_NEW`");
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onCreate(C0VLF c0vlf) {
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ListProtector.get(this.LIZ.mCallbacks, i).getClass();
                    }
                }
            }

            @Override // X.C0VN3
            public final void onOpen(C0VLF c0vlf) {
                this.LIZ.mDatabase = c0vlf;
                this.LIZ.internalInitInvalidationTracker(c0vlf);
                List<C0VK6> list = this.LIZ.mCallbacks;
                if (list != null) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0VK6) ListProtector.get(this.LIZ.mCallbacks, i)).LIZ(c0vlf);
                    }
                }
            }

            @Override // X.C0VN3
            public final void onPreMigrate(C0VLF c0vlf) {
                C0VN0.LIZ(c0vlf);
            }

            @Override // X.C0VN3
            public final C0VN4 onValidateSchema(C0VLF c0vlf) {
                HashMap map = new HashMap(12);
                map.put("ID", new C795990VKj(1, 1, "ID", "INTEGER", null, true));
                map.put("TIK_BOT_CONVERSATION_ID", new C795990VKj(0, 1, "TIK_BOT_CONVERSATION_ID", "TEXT", null, true));
                map.put("MESSAGE_CURSOR", new C795990VKj(0, 1, "MESSAGE_CURSOR", "INTEGER", null, true));
                map.put("SHOWED_DISCLAIMER_POPUP", new C795990VKj(0, 1, "SHOWED_DISCLAIMER_POPUP", "INTEGER", null, true));
                map.put("ACCEPTED_DISCLAIMER_POPUP", new C795990VKj(0, 1, "ACCEPTED_DISCLAIMER_POPUP", "INTEGER", null, true));
                map.put("DISCLAIMER_POPUP_TYPE", new C795990VKj(0, 1, "DISCLAIMER_POPUP_TYPE", "INTEGER", null, true));
                map.put("SHOWED_MEMORY_GUIDE_POPUP", new C795990VKj(0, 1, "SHOWED_MEMORY_GUIDE_POPUP", "INTEGER", null, true));
                map.put("SWITCH_STATUS", new C795990VKj(0, 1, "SWITCH_STATUS", "TEXT", null, true));
                map.put("USER_SEND", new C795990VKj(0, 1, "USER_SEND", "INTEGER", null, true));
                map.put("BOT_ID", new C795990VKj(0, 1, "BOT_ID", "INTEGER", null, true));
                map.put("BOT_SOURCE", new C795990VKj(0, 1, "BOT_SOURCE", "INTEGER", null, true));
                map.put("SHOWED_LANGUAGE_STYLE_GUIDE_POPUP", new C795990VKj(0, 1, "SHOWED_LANGUAGE_STYLE_GUIDE_POPUP", "INTEGER", null, true));
                C0VN6 c0vn6 = new C0VN6("CONFIG", map, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ = C0VN6.LIZ(c0vlf, "CONFIG");
                if (!c0vn6.equals(c0vn6LIZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CONFIG(com.ss.android.ugc.aweme.tako.base.internal.db.ConfigEntity).\n Expected:\n");
                    sbLIZ.append(c0vn6);
                    sbLIZ.append("\n Found:\n");
                    sbLIZ.append(c0vn6LIZ);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ));
                }
                HashMap map2 = new HashMap(59);
                map2.put("UUID", new C795990VKj(1, 1, "UUID", "TEXT", null, true));
                map2.put("MESSAGE_ID", new C795990VKj(0, 1, "MESSAGE_ID", "TEXT", null, true));
                map2.put("SERVER_SEQ", new C795990VKj(0, 1, "SERVER_SEQ", "INTEGER", null, true));
                map2.put("SUB_SERVER_SEQ", new C795990VKj(0, 1, "SUB_SERVER_SEQ", "INTEGER", null, true));
                map2.put("CONVERSATION_ID", new C795990VKj(0, 1, "CONVERSATION_ID", "TEXT", null, true));
                map2.put("SUB_CONVERSATION_ID", new C795990VKj(0, 1, "SUB_CONVERSATION_ID", "TEXT", null, true));
                map2.put("SUB_SESSION_ID", new C795990VKj(0, 1, "SUB_SESSION_ID", "TEXT", null, true));
                map2.put("BOT_ID", new C795990VKj(0, 1, "BOT_ID", "INTEGER", null, true));
                map2.put("ACTION_ID", new C795990VKj(0, 1, "ACTION_ID", "INTEGER", null, true));
                map2.put("CLIENT_STATUS", new C795990VKj(0, 1, "CLIENT_STATUS", "INTEGER", null, true));
                map2.put("MESSAGE_TYPE", new C795990VKj(0, 1, "MESSAGE_TYPE", "INTEGER", null, true));
                map2.put("SENDER_TYPE", new C795990VKj(0, 1, "SENDER_TYPE", "INTEGER", null, true));
                map2.put("SENDER_BOT_ID", new C795990VKj(0, 1, "SENDER_BOT_ID", "INTEGER", null, true));
                map2.put("SENDER_USER_ID", new C795990VKj(0, 1, "SENDER_USER_ID", "INTEGER", null, true));
                map2.put("SENDER_IS_SELF", new C795990VKj(0, 1, "SENDER_IS_SELF", "INTEGER", null, true));
                map2.put("SERVER_TIME", new C795990VKj(0, 1, "SERVER_TIME", "INTEGER", null, true));
                map2.put("CLIENT_SEQ", new C795990VKj(0, 1, "CLIENT_SEQ", "INTEGER", null, true));
                map2.put("MESSAGE_SESSION_ID", new C795990VKj(0, 1, "MESSAGE_SESSION_ID", "TEXT", null, true));
                map2.put("VERSION", new C795990VKj(0, 1, "VERSION", "INTEGER", null, true));
                map2.put("BODY", new C795990VKj(0, 1, "BODY", "TEXT", null, true));
                map2.put("MULTI_BODY", new C795990VKj(0, 1, "MULTI_BODY", "TEXT", null, true));
                map2.put("IS_MULTI_ANSWER", new C795990VKj(0, 1, "IS_MULTI_ANSWER", "INTEGER", null, true));
                map2.put("SELECTED_ANSWER_INDEX", new C795990VKj(0, 1, "SELECTED_ANSWER_INDEX", "INTEGER", null, true));
                map2.put("IS_DEGRADED", new C795990VKj(0, 1, "IS_DEGRADED", "INTEGER", null, true));
                map2.put("SERVER_STATUS", new C795990VKj(0, 1, "SERVER_STATUS", "INTEGER", null, true));
                map2.put("EXT_LOG", new C795990VKj(0, 1, "EXT_LOG", "INTEGER", null, true));
                map2.put("EXT_ACTIVE_ACTION_BAR", new C795990VKj(0, 1, "EXT_ACTIVE_ACTION_BAR", "INTEGER", null, true));
                map2.put("EXT_ACTIVE_TEMPLATE_TYPE", new C795990VKj(0, 1, "EXT_ACTIVE_TEMPLATE_TYPE", "INTEGER", null, false));
                map2.put("EXT_HASHTAGS", new C795990VKj(0, 1, "EXT_HASHTAGS", "TEXT", null, true));
                map2.put("EXT_ACTIVE_AI_IMAGE_ACTION_BAR", new C795990VKj(0, 1, "EXT_ACTIVE_AI_IMAGE_ACTION_BAR", "INTEGER", null, true));
                map2.put("EXT_IMAGE_SHORTCUT_KEY", new C795990VKj(0, 1, "EXT_IMAGE_SHORTCUT_KEY", "TEXT", null, true));
                map2.put("RETRY_TIME", new C795990VKj(0, 1, "RETRY_TIME", "INTEGER", null, true));
                map2.put("REPLY_UUID", new C795990VKj(0, 1, "REPLY_UUID", "TEXT", null, true));
                map2.put("REPLY_MESSAGE_ID", new C795990VKj(0, 1, "REPLY_MESSAGE_ID", "TEXT", null, true));
                map2.put("READ", new C795990VKj(0, 1, "READ", "INTEGER", null, true));
                map2.put("CHANNEL", new C795990VKj(0, 1, "CHANNEL", "INTEGER", CardStruct.IStatusCode.DEFAULT, true));
                map2.put("UPDATE_ACTION", new C795990VKj(0, 1, "UPDATE_ACTION", "TEXT", null, true));
                map2.put("LYNX_DATE", new C795990VKj(0, 1, "LYNX_DATE", "TEXT", null, true));
                map2.put("PUSH_RECEIVE_TIME", new C795990VKj(0, 1, "PUSH_RECEIVE_TIME", "INTEGER", null, true));
                map2.put("THINK_INFO_EXPANDED", new C795990VKj(0, 1, "THINK_INFO_EXPANDED", "INTEGER", null, false));
                map2.put("GEN_STYLE", new C795990VKj(0, 1, "GEN_STYLE", "INTEGER", null, true));
                map2.put("VERSION_ID", new C795990VKj(0, 1, "VERSION_ID", "TEXT", null, true));
                map2.put("VERSION_SEQ_ID", new C795990VKj(0, 1, "VERSION_SEQ_ID", "INTEGER", null, true));
                map2.put("IS_HIDDEN", new C795990VKj(0, 1, "IS_HIDDEN", "INTEGER", null, true));
                map2.put("RETRIED", new C795990VKj(0, 1, "RETRIED", "INTEGER", null, true));
                map2.put("HIDE_PUSH_MESSAGE_BUTTON", new C795990VKj(0, 1, "HIDE_PUSH_MESSAGE_BUTTON", "INTEGER", null, true));
                map2.put("MODE_SOURCE", new C795990VKj(0, 1, "MODE_SOURCE", "TEXT", null, true));
                map2.put("AIGC_STANDARD_RATIO", new C795990VKj(0, 1, "AIGC_STANDARD_RATIO", "INTEGER", null, false));
                map2.put("INPUT_SKILL_MODE", new C795990VKj(0, 1, "INPUT_SKILL_MODE", "TEXT", null, false));
                map2.put("IMAGE_TEMPLATE_ID", new C795990VKj(0, 1, "IMAGE_TEMPLATE_ID", "TEXT", null, true));
                map2.put("IMAGE_TAB_ID", new C795990VKj(0, 1, "IMAGE_TAB_ID", "TEXT", null, true));
                map2.put("IMAGE_TEMPLATE_TAB", new C795990VKj(0, 1, "IMAGE_TEMPLATE_TAB", "TEXT", null, true));
                map2.put("IMAGE_STYLE_NAME", new C795990VKj(0, 1, "IMAGE_STYLE_NAME", "TEXT", null, true));
                map2.put("EDIT_INFO", new C795990VKj(0, 1, "EDIT_INFO", "TEXT", null, true));
                map2.put("REFERENCE_INFO", new C795990VKj(0, 1, "REFERENCE_INFO", "TEXT", null, true));
                map2.put("IS_PUSH_MSG", new C795990VKj(0, 1, "IS_PUSH_MSG", "INTEGER", null, true));
                map2.put("IS_UNCHANGED_TAKO_TEMPLATE", new C795990VKj(0, 1, "IS_UNCHANGED_TAKO_TEMPLATE", "INTEGER", null, true));
                map2.put("IS_REGEN_DEPRECATED", new C795990VKj(0, 1, "IS_REGEN_DEPRECATED", "INTEGER", null, true));
                map2.put("IMAGE_TEMPLATE_INFO", new C795990VKj(0, 1, "IMAGE_TEMPLATE_INFO", "TEXT", null, true));
                C0VN6 c0vn62 = new C0VN6("MESSAGE", map2, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ2 = C0VN6.LIZ(c0vlf, "MESSAGE");
                if (!c0vn62.equals(c0vn6LIZ2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MESSAGE(com.ss.android.ugc.aweme.tako.base.internal.db.MessageEntity).\n Expected:\n");
                    sbLIZ2.append(c0vn62);
                    sbLIZ2.append("\n Found:\n");
                    sbLIZ2.append(c0vn6LIZ2);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ2));
                }
                HashMap map3 = new HashMap(3);
                map3.put("CONVERSATION_ID", new C795990VKj(1, 1, "CONVERSATION_ID", "TEXT", null, true));
                map3.put("HISTORY_CURSOR", new C795990VKj(0, 1, "HISTORY_CURSOR", "INTEGER", null, true));
                map3.put("READ_CURSOR", new C795990VKj(0, 1, "READ_CURSOR", "INTEGER", null, true));
                C0VN6 c0vn63 = new C0VN6("CONVERSATION", map3, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ3 = C0VN6.LIZ(c0vlf, "CONVERSATION");
                if (!c0vn63.equals(c0vn6LIZ3)) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("CONVERSATION(com.ss.android.ugc.aweme.tako.base.internal.db.ConversationEntity).\n Expected:\n");
                    sbLIZ3.append(c0vn63);
                    sbLIZ3.append("\n Found:\n");
                    sbLIZ3.append(c0vn6LIZ3);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ3));
                }
                HashMap map4 = new HashMap(11);
                map4.put("TIK_BOT_CONVERSATION_ID", new C795990VKj(1, 1, "TIK_BOT_CONVERSATION_ID", "TEXT", null, true));
                map4.put("MESSAGE_CURSOR", new C795990VKj(0, 1, "MESSAGE_CURSOR", "INTEGER", null, true));
                map4.put("SHOWED_DISCLAIMER_POPUP", new C795990VKj(0, 1, "SHOWED_DISCLAIMER_POPUP", "INTEGER", null, true));
                map4.put("ACCEPTED_DISCLAIMER_POPUP", new C795990VKj(0, 1, "ACCEPTED_DISCLAIMER_POPUP", "INTEGER", null, true));
                map4.put("DISCLAIMER_POPUP_TYPE", new C795990VKj(0, 1, "DISCLAIMER_POPUP_TYPE", "INTEGER", null, true));
                map4.put("SHOWED_MEMORY_GUIDE_POPUP", new C795990VKj(0, 1, "SHOWED_MEMORY_GUIDE_POPUP", "INTEGER", null, true));
                map4.put("SWITCH_STATUS", new C795990VKj(0, 1, "SWITCH_STATUS", "TEXT", null, true));
                map4.put("USER_SEND", new C795990VKj(0, 1, "USER_SEND", "INTEGER", null, true));
                map4.put("BOT_ID", new C795990VKj(0, 1, "BOT_ID", "INTEGER", null, true));
                map4.put("BOT_SOURCE", new C795990VKj(0, 1, "BOT_SOURCE", "INTEGER", null, true));
                map4.put("SHOWED_LANGUAGE_STYLE_GUIDE_POPUP", new C795990VKj(0, 1, "SHOWED_LANGUAGE_STYLE_GUIDE_POPUP", "INTEGER", null, true));
                C0VN6 c0vn64 = new C0VN6("CONFIG_NEW", map4, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ4 = C0VN6.LIZ(c0vlf, "CONFIG_NEW");
                if (!c0vn64.equals(c0vn6LIZ4)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("CONFIG_NEW(com.ss.android.ugc.aweme.tako.base.internal.db.ConfigEntityNew).\n Expected:\n");
                    sbLIZ4.append(c0vn64);
                    sbLIZ4.append("\n Found:\n");
                    sbLIZ4.append(c0vn6LIZ4);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ4));
                }
                HashMap map5 = new HashMap(9);
                map5.put("CONVERSATION_ID", new C795990VKj(1, 1, "CONVERSATION_ID", "TEXT", null, true));
                map5.put("SUB_CONVERSATION_ID", new C795990VKj(2, 1, "SUB_CONVERSATION_ID", "TEXT", null, true));
                map5.put("STATUS", new C795990VKj(0, 1, "STATUS", "INTEGER", null, true));
                map5.put("HISTORY_CURSOR", new C795990VKj(0, 1, "HISTORY_CURSOR", "INTEGER", null, true));
                map5.put("READ_CURSOR", new C795990VKj(0, 1, "READ_CURSOR", "INTEGER", null, true));
                map5.put("TITLE", new C795990VKj(0, 1, "TITLE", "TEXT", null, false));
                map5.put("UNREAD_COUNT", new C795990VKj(0, 1, "UNREAD_COUNT", "INTEGER", null, true));
                map5.put("LATEST_MESSAGE_TIME", new C795990VKj(0, 1, "LATEST_MESSAGE_TIME", "INTEGER", null, true));
                map5.put("RELATED_VIDEO", new C795990VKj(0, 1, "RELATED_VIDEO", "TEXT", null, false));
                C0VN6 c0vn65 = new C0VN6("CONVERSATION_NEW", map5, new HashSet(0), new HashSet(0));
                C0VN6 c0vn6LIZ5 = C0VN6.LIZ(c0vlf, "CONVERSATION_NEW");
                if (!c0vn65.equals(c0vn6LIZ5)) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("CONVERSATION_NEW(com.ss.android.ugc.aweme.tako.base.internal.db.ConversationEntityNew).\n Expected:\n");
                    sbLIZ5.append(c0vn65);
                    sbLIZ5.append("\n Found:\n");
                    sbLIZ5.append(c0vn6LIZ5);
                    return new C0VN4(false, C2188811AlT.LIZIZ(sbLIZ5));
                }
                return new C0VN4(true, null);
            }
        }, "255fb31d9953f32c41a70a96cdee9a06", "cada9bd1b332907ad44fb2f8a60aebc6");
        C0VKN c0vkn = new C0VKN(c796520VMk.LIZIZ);
        c0vkn.LIZIZ = c796520VMk.LIZJ;
        c0vkn.LIZJ = c0vn2;
        return c796520VMk.LIZ.LIZ(c0vkn.LIZ());
    }

    @Override // X.AbstractC796540VMm
    public final List<AbstractC796510VMj> getAutoMigrations(Map<Class<? extends InterfaceC2275591E5d>, InterfaceC2275591E5d> map) {
        return Arrays.asList(new AbstractC796510VMj[0]);
    }
}
