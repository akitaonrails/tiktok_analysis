package com.ss.android.ugc.aweme.im.contacts.api.database;

import X.AbstractC796510VMj;
import X.AbstractC796540VMm;
import X.C1697810uHb;
import X.C797570VQl;
import X.InterfaceC805460Vii;
import android.database.SQLException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS247S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public abstract class IMDatabase extends AbstractC796540VMm {
    public static IMDatabase LLILLJJLI;
    public static final List<AbstractC796510VMj> LLILZ;
    public static final List<AbstractC796510VMj> LLILZIL;
    public static final C797570VQl LL = new C797570VQl();
    public static final Object LLILLL = new Object();

    public abstract InterfaceC805460Vii LIZ();

    static {
        List<AbstractC796510VMj> listLJIIJJI = C1697810uHb.LJIIJJI(new AbstractC796510VMj() { // from class: X.0VQj
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER table FRIENDS_RELATION RENAME TO ");
                sbLIZ.append("Familiar_TEMP_TABLE");
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
                c0vlf.LJIILJJIL(C13LQ.LJJJ(EnumC797540VQi.values(), ",", "create table if not exists FRIENDS_RELATION (", ")", AFwS247S0000000_13.get$arr$(57), 24));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("INSERT INTO FRIENDS_RELATION (SEC_UID, RELATION_TYPE, CREATED_TIME) SELECT SEC_UID, RELATION_TYPE, CREATED_TIME FROM ");
                sbLIZ2.append("Familiar_TEMP_TABLE");
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("DROP table ");
                sbLIZ3.append("Familiar_TEMP_TABLE");
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }, new AbstractC796510VMj() { // from class: X.0VQc
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                c0vlf.LJIILJJIL("DROP TABLE IF EXISTS dummy_migration_table");
            }
        }, new AbstractC796510VMj() { // from class: X.0VQY
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER table SIMPLE_USER add column ");
                C0VQU c0vqu = C0VQU.COLUMN_FOLLOWER_COUNT;
                sbLIZ.append(c0vqu.key);
                sbLIZ.append(' ');
                sbLIZ.append(c0vqu.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ALTER table SIMPLE_USER add column ");
                C0VQU c0vqu2 = C0VQU.COLUMN_FOLLOWING_COUNT;
                sbLIZ2.append(c0vqu2.key);
                sbLIZ2.append(' ');
                sbLIZ2.append(c0vqu2.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }, new AbstractC796510VMj() { // from class: X.0VQa
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER TABLE SIMPLE_USER ADD COLUMN ");
                C0VQU c0vqu = C0VQU.COLUMN_INTERNAL_SHARE_VERSION;
                sbLIZ.append(c0vqu.key);
                sbLIZ.append(' ');
                sbLIZ.append(c0vqu.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }, new AbstractC796510VMj() { // from class: X.0VQb
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER TABLE SIMPLE_USER ADD COLUMN ");
                C0VQU c0vqu = C0VQU.COLUMN_AVATAR_MEDIUM;
                sbLIZ.append(c0vqu.key);
                sbLIZ.append(' ');
                sbLIZ.append(c0vqu.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }, new AbstractC796510VMj() { // from class: X.0VQd
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                InterfaceC805460Vii.LIZ.getClass();
                c0vlf.LJIILJJIL(C797520VQg.LIZIZ);
            }
        }, new AbstractC796510VMj() { // from class: X.0VQW
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                StringBuilder sb = new StringBuilder("create table if not exists MAF_USER (");
                for (C0VQT c0vqt : C0VQT.values()) {
                    sb.append(c0vqt.key);
                    sb.append(" ");
                    sb.append(c0vqt.type);
                    sb.append(",");
                }
                String string = sb.toString();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string.substring(0, string.length() - 1));
                sbLIZ.append(");");
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }, new AbstractC796510VMj() { // from class: X.0VQZ
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ALTER TABLE SIMPLE_USER ADD COLUMN ");
                C0VQU c0vqu = C0VQU.COLUMN_WELCOME_MESSAGE_ENABLED;
                sbLIZ.append(c0vqu.key);
                sbLIZ.append(' ');
                sbLIZ.append(c0vqu.type);
                c0vlf.LJIILJJIL(C2188811AlT.LIZIZ(sbLIZ));
            }
        }, new AbstractC796510VMj() { // from class: X.0VQe
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                C797520VQg c797520VQg = InterfaceC805460Vii.LIZ;
                c797520VQg.getClass();
                c0vlf.LJIILJJIL(C797520VQg.LIZLLL);
                c797520VQg.getClass();
                c0vlf.LJIILJJIL(C797520VQg.LIZJ);
            }
        }, new AbstractC796510VMj() { // from class: X.0VQf
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                InterfaceC805460Vii.LIZ.getClass();
                c0vlf.LJIILJJIL(C797520VQg.LJ);
            }
        }, new AbstractC796510VMj() { // from class: X.0VOP
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                try {
                    c0vlf.LJIILJJIL("DROP TABLE IF EXISTS MAF_USER");
                } catch (SQLException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }, new AbstractC796510VMj() { // from class: X.0VOQ
            @Override // X.AbstractC796510VMj
            public final void migrate(C0VLF c0vlf) {
                try {
                    c0vlf.LJIILJJIL("DROP TABLE IF EXISTS FRIENDS_RELATION");
                } catch (SQLException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        });
        LLILZ = listLJIIJJI;
        LLILZIL = listLJIIJJI;
    }
}
