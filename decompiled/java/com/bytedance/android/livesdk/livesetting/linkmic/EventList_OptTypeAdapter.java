package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class EventList_OptTypeAdapter extends TypeAdapter<EventList> {
    public final Gson LIZ;

    public EventList_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final EventList read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        EventList eventList = new EventList();
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "blocked_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    eventList.blockedList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "audience_blocked_list")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    eventList.audienceBlockedList = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return eventList;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, EventList eventList) {
        EventList eventList2 = eventList;
        if (eventList2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("blocked_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, eventList2.blockedList, String.class);
        c09dl.LJIILLIIL("audience_blocked_list");
        C473040Igo.LIZLLL(this.LIZ, c09dl, eventList2.audienceBlockedList, String.class);
        c09dl.LJII();
    }
}
