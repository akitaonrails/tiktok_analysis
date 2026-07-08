package com.bytedance.android.livesdk.model.utils.adapter;

import X.C19748512Ol;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes27.dex */
public class RoomTypeAdapter implements j<Room> {
    @Override // com.google.gson.j
    public final Room deserialize(k kVar, Type type, i iVar) {
        Room room = (Room) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, kVar, type);
        room.init();
        return room;
    }
}
