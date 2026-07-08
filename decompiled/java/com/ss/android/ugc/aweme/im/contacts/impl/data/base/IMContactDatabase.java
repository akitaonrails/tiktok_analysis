package com.ss.android.ugc.aweme.im.contacts.impl.data.base;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C0VQO;
import X.C1697810uHb;
import X.InterfaceC1581706Hf;
import X.InterfaceC2201871BFp;
import X.InterfaceC808330VnL;
import X.InterfaceC808350VnN;
import android.database.SQLException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes14.dex */
public abstract class IMContactDatabase extends AbstractC796540VMm {
    public static IMContactDatabase LLILLJJLI;
    public static IMContactDatabase LLILLL;
    public static String LLILZ;
    public static final C0VQO LL = new C0VQO();
    public static final ReentrantReadWriteLock LLILZIL = new ReentrantReadWriteLock();
    public static final List<AbstractC796510VMj> LLILZLL = C1697810uHb.LJIIJJI(new AbstractC796510VMj() { // from class: X.0VQV
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs = C0VQS.COLUMN_FOLLOWER_STATUS;
            sbLIZ.append(c0vqs.key);
            sbLIZ.append(' ');
            sbLIZ.append(c0vqs.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs2 = C0VQS.COLUMN_BLOCK;
            sbLIZ2.append(c0vqs2.key);
            sbLIZ2.append(' ');
            sbLIZ2.append(c0vqs2.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ2));
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs3 = C0VQS.COLUMN_BLOCKED_BY;
            sbLIZ3.append(c0vqs3.key);
            sbLIZ3.append(' ');
            sbLIZ3.append(c0vqs3.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs4 = C0VQS.COLUMN_RECOMMEND_REASON;
            sbLIZ4.append(c0vqs4.key);
            sbLIZ4.append(' ');
            sbLIZ4.append(c0vqs4.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ4));
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs5 = C0VQS.COLUMN_ENTERPRISE_USER_VERIFY_REASON;
            sbLIZ5.append(c0vqs5.key);
            sbLIZ5.append(' ');
            sbLIZ5.append(c0vqs5.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ5));
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs6 = C0VQS.COLUMN_USER_VERIFY_REASON;
            sbLIZ6.append(c0vqs6.key);
            sbLIZ6.append(' ');
            sbLIZ6.append(c0vqs6.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ6));
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs7 = C0VQS.COLUMN_USER_VERIFY_TYPE;
            sbLIZ7.append(c0vqs7.key);
            sbLIZ7.append(' ');
            sbLIZ7.append(c0vqs7.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ7));
        }
    }, new AbstractC796510VMj() { // from class: X.0VQX
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs = C0VQS.COLUMN_FOLLOWER_COUNT;
            sbLIZ.append(c0vqs.key);
            sbLIZ.append(' ');
            sbLIZ.append(c0vqs.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs2 = C0VQS.COLUMN_FOLLOWING_COUNT;
            sbLIZ2.append(c0vqs2.key);
            sbLIZ2.append(' ');
            sbLIZ2.append(c0vqs2.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPf
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CREATE TABLE IF NOT EXISTS IM_USER_BIZ_INFO (");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_UID;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            sbLIZ.append(',');
            EnumC797230VPd enumC797230VPd2 = EnumC797230VPd.COLUMN_SHARE_FILTER_TYPE;
            sbLIZ.append(enumC797230VPd2.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd2.type);
            sbLIZ.append(',');
            EnumC797230VPd enumC797230VPd3 = EnumC797230VPd.COLUMN_UPDATE_TIME;
            sbLIZ.append(enumC797230VPd3.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd3.type);
            sbLIZ.append(");");
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VQP
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            C0VQQ[] c0vqqArrValues = C0VQQ.values();
            StringBuilder sb = new StringBuilder();
            for (C0VQQ c0vqq : c0vqqArrValues) {
                sb.append(c0vqq.key);
                sb.append(" ");
                sb.append(c0vqq.type);
                if (!c0vqq.nullable) {
                    sb.append(" NOT NULL");
                }
                sb.append(", ");
            }
            StringBuilder sb2 = new StringBuilder();
            for (C0VQQ c0vqq2 : c0vqqArrValues) {
                if (c0vqq2.isPrimaryKey) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(c0vqq2.key);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CREATE TABLE IF NOT EXISTS USER_INTERACTION (");
            sbLIZ.append((Object) sb);
            sbLIZ.append("PRIMARY KEY (");
            sbLIZ.append((Object) sb2);
            sbLIZ.append(")); ");
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPp
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_AFFINITY_SCORE;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPq
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_USER_B2C_ACCOUNT_INFO;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPr
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_USER_CAMERA_INFO;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPs
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_CHAT_BOT_INFO;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VQR
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BASE_INFO add column ");
            C0VQS c0vqs = C0VQS.COLUMN_DELETED;
            sbLIZ.append(c0vqs.key);
            sbLIZ.append(' ');
            sbLIZ.append(c0vqs.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPm
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_ALLOW_SINGLE_CHAT_SCREENSHOT;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPn
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_GROUP_CHAT_PERMISSION_INFO;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPk
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
                EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_ACTIVITY_STATUS_SETTING;
                sbLIZ.append(enumC797230VPd.key);
                sbLIZ.append(' ');
                sbLIZ.append(enumC797230VPd.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VPo
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
            EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_CHAT_BUBBLE_ID;
            sbLIZ.append(enumC797230VPd.key);
            sbLIZ.append(' ');
            sbLIZ.append(enumC797230VPd.type);
            c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
        }
    }, new AbstractC796510VMj() { // from class: X.0VPl
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER table IM_USER_BIZ_INFO add column ");
                EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_VOICE_CALL_INFO;
                sbLIZ.append(enumC797230VPd.key);
                sbLIZ.append(' ');
                sbLIZ.append(enumC797230VPd.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }, new AbstractC796510VMj() { // from class: X.0VPj
        @Override // X.AbstractC796510VMj
        public final void migrate(C0VLF c0vlf) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER TABLE IM_USER_BIZ_INFO ADD COLUMN ");
                EnumC797230VPd enumC797230VPd = EnumC797230VPd.COLUMN_UNLOCKED_BUBBLE_IDS;
                sbLIZ.append(enumC797230VPd.key);
                sbLIZ.append(' ');
                sbLIZ.append(enumC797230VPd.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            } catch (SQLException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    });

    public abstract InterfaceC2201871BFp LIZ();

    public abstract InterfaceC808330VnL LIZIZ();

    public abstract InterfaceC808350VnN LIZJ();

    public abstract InterfaceC1581706Hf LJFF();
}
