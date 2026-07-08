package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final PendingIntent LJ;
    public final PendingIntent LJFF;
    public final PendingIntent LJI;
    public final PendingIntent LJII;
    public final Map LJIIIIZZ;
    public boolean LJIIIZ;

    public a(int i, int i2, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, Map map) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = pendingIntent;
        this.LJFF = pendingIntent2;
        this.LJI = pendingIntent3;
        this.LJII = pendingIntent4;
        this.LJIIIIZZ = map;
    }

    public final PendingIntent LIZ(z zVar) {
        int i = zVar.LIZ;
        if (i == 0) {
            PendingIntent pendingIntent = this.LJFF;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!zVar.LIZIZ || this.LIZJ > this.LIZLLL) {
                return null;
            }
            return this.LJII;
        }
        if (i == 1) {
            PendingIntent pendingIntent2 = this.LJ;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (zVar.LIZIZ && this.LIZJ <= this.LIZLLL) {
                return this.LJI;
            }
        }
        return null;
    }
}
