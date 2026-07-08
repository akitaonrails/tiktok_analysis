package ttpobfuscated;

import X.AbstractC796510VMj;
import X.C0VLF;
import X.InterfaceC2275591E5d;

/* JADX INFO: loaded from: classes36.dex */
public class tf extends AbstractC796510VMj {
    public final InterfaceC2275591E5d a;

    public tf() {
        super(2, 3);
        this.a = new j();
    }

    @Override // X.AbstractC796510VMj
    public void migrate(C0VLF c0vlf) {
        c0vlf.LJIILJJIL("CREATE TABLE IF NOT EXISTS `_new_users` (`userId` TEXT NOT NULL, `deviceId` TEXT NOT NULL, `region` TEXT NOT NULL, `lastUpdateTime` INTEGER NOT NULL, `clientIdentifier` TEXT NOT NULL DEFAULT '', `regionStatus` TEXT NOT NULL DEFAULT '', `exRegions` TEXT NOT NULL DEFAULT '', `activated` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`userId`))");
        c0vlf.LJIILJJIL("INSERT INTO `_new_users` (`regionStatus`,`clientIdentifier`,`region`,`userId`,`deviceId`,`exRegions`,`lastUpdateTime`,`activated`) SELECT `regionStatus`,`clientIdentifier`,`region`,`userId`,`deviceId`,`exRegions`,`lastUpdateTime`,`activated` FROM `users`");
        c0vlf.LJIILJJIL("DROP TABLE `users`");
        c0vlf.LJIILJJIL("ALTER TABLE `_new_users` RENAME TO `users`");
        this.a.onPostMigrate(c0vlf);
    }
}
