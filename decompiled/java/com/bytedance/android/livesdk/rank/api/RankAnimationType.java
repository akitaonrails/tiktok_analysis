package com.bytedance.android.livesdk.rank.api;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes28.dex */
public final class RankAnimationType {
    public static final TypeAdapter ADAPTER;
    public static final RankAnimationType LIZ;
    public static final RankAnimationType LIZIZ;
    public static final RankAnimationType LIZJ;
    public static final RankAnimationType LIZLLL;
    public static final RankAnimationType LJ;
    public static final RankAnimationType LJFF;
    public static final RankAnimationType LJI;
    public static final RankAnimationType LJII;
    public static final RankAnimationType LJIIIIZZ;
    public static final RankAnimationType LJIIIZ;
    public static final RankAnimationType LJIIJ;
    public static final RankAnimationType LJIIJJI;
    public static final RankAnimationType LJIIL;
    public static final RankAnimationType LJIILIIL;
    public static final RankAnimationType LJIILJJIL;
    public static final RankAnimationType LJIILL;
    public static final RankAnimationType LJIILLIIL;
    public static final RankAnimationType LJIIZILJ;
    public static final RankAnimationType LJIJ;
    public static final RankAnimationType LJIJI;
    public static final RankAnimationType LJIJJ;
    public static final Map<Object, Integer> LJIJJLI;

    @C09CT("rank_animation_type")
    public int type;

    public RankAnimationType() {
        this(0);
    }

    static {
        RankAnimationType rankAnimationType = new RankAnimationType(-1);
        LIZ = rankAnimationType;
        RankAnimationType rankAnimationType2 = new RankAnimationType(-5);
        LIZIZ = rankAnimationType2;
        RankAnimationType rankAnimationType3 = new RankAnimationType(-3);
        LIZJ = rankAnimationType3;
        RankAnimationType rankAnimationType4 = new RankAnimationType(0);
        LIZLLL = rankAnimationType4;
        RankAnimationType rankAnimationType5 = new RankAnimationType(1);
        LJ = rankAnimationType5;
        RankAnimationType rankAnimationType6 = new RankAnimationType(2);
        LJFF = rankAnimationType6;
        RankAnimationType rankAnimationType7 = new RankAnimationType(3);
        LJI = rankAnimationType7;
        RankAnimationType rankAnimationType8 = new RankAnimationType(4);
        LJII = rankAnimationType8;
        RankAnimationType rankAnimationType9 = new RankAnimationType(5);
        LJIIIIZZ = rankAnimationType9;
        RankAnimationType rankAnimationType10 = new RankAnimationType(6);
        LJIIIZ = rankAnimationType10;
        RankAnimationType rankAnimationType11 = new RankAnimationType(7);
        LJIIJ = rankAnimationType11;
        RankAnimationType rankAnimationType12 = new RankAnimationType(8);
        LJIIJJI = rankAnimationType12;
        RankAnimationType rankAnimationType13 = new RankAnimationType(9);
        LJIIL = rankAnimationType13;
        RankAnimationType rankAnimationType14 = new RankAnimationType(10);
        LJIILIIL = rankAnimationType14;
        RankAnimationType rankAnimationType15 = new RankAnimationType(11);
        LJIILJJIL = rankAnimationType15;
        RankAnimationType rankAnimationType16 = new RankAnimationType(12);
        LJIILL = rankAnimationType16;
        RankAnimationType rankAnimationType17 = new RankAnimationType(13);
        LJIILLIIL = rankAnimationType17;
        RankAnimationType rankAnimationType18 = new RankAnimationType(14);
        LJIIZILJ = rankAnimationType18;
        RankAnimationType rankAnimationType19 = new RankAnimationType(15);
        LJIJ = rankAnimationType19;
        RankAnimationType rankAnimationType20 = new RankAnimationType(16);
        LJIJI = rankAnimationType20;
        RankAnimationType rankAnimationType21 = new RankAnimationType(17);
        LJIJJ = rankAnimationType21;
        LJIJJLI = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(rankAnimationType.type), 1), new Pair(Integer.valueOf(rankAnimationType16.type), 2), new Pair(Integer.valueOf(rankAnimationType14.type), 3), new Pair(Integer.valueOf(rankAnimationType2.type), 4), new Pair(Integer.valueOf(rankAnimationType5.type), 5), new Pair(Integer.valueOf(rankAnimationType6.type), 6), new Pair(Integer.valueOf(rankAnimationType10.type), 7), new Pair(Integer.valueOf(rankAnimationType11.type), 8), new Pair(Integer.valueOf(rankAnimationType17.type), 9), new Pair(Integer.valueOf(rankAnimationType18.type), 10), new Pair(Integer.valueOf(rankAnimationType15.type), 11), new Pair(Integer.valueOf(rankAnimationType7.type), 12), new Pair(Integer.valueOf(rankAnimationType20.type), 12), new Pair(Integer.valueOf(rankAnimationType8.type), 13), new Pair(Integer.valueOf(rankAnimationType21.type), 13), new Pair(Integer.valueOf(rankAnimationType12.type), 14), new Pair(Integer.valueOf(rankAnimationType13.type), 15), new Pair(Integer.valueOf(rankAnimationType3.type), 16), new Pair(Integer.valueOf(rankAnimationType4.type), 17), new Pair(Integer.valueOf(rankAnimationType9.type), 18), new Pair(rankAnimationType19, 19));
        NormalGson.singleton();
        ADAPTER = new RankAnimationType_OptTypeAdapter();
    }

    public RankAnimationType(int i) {
        this.type = i;
    }
}
