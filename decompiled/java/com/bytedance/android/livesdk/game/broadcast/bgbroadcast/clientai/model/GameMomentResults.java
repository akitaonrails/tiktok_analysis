package com.bytedance.android.livesdk.game.broadcast.bgbroadcast.clientai.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class GameMomentResults {

    @C09CT("game_moment_type")
    public int gameMomentType;

    @C09CT("game_moment_sub_type")
    public String gameMomentSubType = "";

    @C09CT("fusion_tag")
    public String fusionIdTag = "";

    @C09CT("platform")
    public String platform = "";

    @C09CT("prob")
    public List<Float> prob = new ArrayList();

    @C09CT("threshold")
    public List<Float> threshold = new ArrayList();

    @C09CT("source")
    public String source = "";
}
