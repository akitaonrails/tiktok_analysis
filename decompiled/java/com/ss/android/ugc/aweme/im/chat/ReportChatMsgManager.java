package com.ss.android.ugc.aweme.im.chat;

import X.C603820NmG;
import X.C869590Y9l;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.report.ReportUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public final class ReportChatMsgManager implements IReportChatMsgManager {
    public static final ReportChatMsgManager LIZIZ = new ReportChatMsgManager();
    public static HashMap<String, List<C869590Y9l>> LIZJ;
    public static HashMap<String, Integer> LIZLLL;
    public static C603820NmG<String, Integer> LJ;
    public static boolean LJFF;
    public static boolean LJI;

    public static final class Service implements IReportChatMsgManager {
        public final /* synthetic */ ReportChatMsgManager LIZIZ = ReportChatMsgManager.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final List<C869590Y9l> LIZ(String str) {
            return this.LIZIZ.LIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final List LIZIZ(int i, List list) {
            return this.LIZIZ.LIZIZ(i, list);
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final int LIZJ(String str) {
            return this.LIZIZ.LIZJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final void LIZLLL(String str, List<? extends C869590Y9l> list) {
            this.LIZIZ.LIZLLL(str, list);
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final Integer LJFF(String str) {
            return this.LIZIZ.LJFF(str);
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final void LJI(String str) {
            this.LIZIZ.LJI(str);
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final void clear() {
            this.LIZIZ.clear();
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final boolean LJ() {
            this.LIZIZ.getClass();
            return ReportChatMsgManager.LJFF;
        }

        @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
        public final boolean isMediaMsgMasking() {
            this.LIZIZ.getClass();
            return ReportChatMsgManager.LJI;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final void clear() {
        if (LIZLLL != null) {
            LIZLLL = null;
        }
        if (LIZJ != null) {
            LIZJ = null;
        }
        LJFF = false;
        LJI = false;
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final boolean LJ() {
        return LJFF;
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final boolean isMediaMsgMasking() {
        return LJI;
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final List<C869590Y9l> LIZ(String str) {
        HashMap<String, List<C869590Y9l>> map = LIZJ;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final int LIZJ(String str) {
        Integer numLIZJ;
        C603820NmG<String, Integer> c603820NmG = LJ;
        if (c603820NmG != null && (numLIZJ = c603820NmG.LIZJ(str)) != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final Integer LJFF(String str) {
        HashMap<String, Integer> map = LIZLLL;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final void LJI(String str) {
        HashMap<String, List<C869590Y9l>> map = LIZJ;
        if (map != null) {
            map.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final List LIZIZ(int i, List list) {
        ArrayList arrayList = new ArrayList(i);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C869590Y9l c869590Y9l = (C869590Y9l) ListProtector.get(list, i2);
            if (ReportUtils.LIZIZ.LIZIZ(c869590Y9l)) {
                arrayList.add(c869590Y9l);
                i--;
                if (i <= 0) {
                    break;
                }
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.chat.IReportChatMsgManager
    public final void LIZLLL(String str, List<? extends C869590Y9l> list) {
        if (LIZJ == null) {
            LIZJ = new HashMap<>();
        }
        LIZJ.put(str, list);
    }
}
