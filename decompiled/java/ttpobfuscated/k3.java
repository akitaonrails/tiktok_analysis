package ttpobfuscated;

import android.content.Context;
import ttp.orbu.sdk.database.room.TTPRoomDatabase;

/* JADX INFO: loaded from: classes24.dex */
public final class k3 {
    public static final a b = new a();
    public final Context a;

    public final void a() {
        af.a.b();
        this.a.deleteDatabase("ttpDB.db");
    }

    public final void b() {
        af.a.a();
    }

    public final TTPRoomDatabase c() {
        return af.a.a(this.a);
    }

    public static final class a {
        public final void a(Context context) {
            af.a.b();
            context.deleteDatabase("ttpDB.db");
        }
    }

    public k3(Context context) {
        this.a = context;
    }
}
