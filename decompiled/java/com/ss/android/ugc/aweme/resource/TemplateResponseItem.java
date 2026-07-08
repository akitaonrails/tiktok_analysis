package com.ss.android.ugc.aweme.resource;

import X.C08JS;
import X.C09CT;
import X.C13BV;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.p;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import com.ss.android.ugc.aweme.cutsame.CutSameVideo;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class TemplateResponseItem {

    @C09CT("author")
    public final AuthorInfo authorInfo;

    @C09CT("challenge")
    public final ArrayList<String> challengeIds;

    @C09CT("create_time")
    public final long createTime;

    @C09CT("desc")
    public final String description;

    @C09CT("summary")
    public final String extra;

    @C09CT("icon_url")
    public final String iconUrl;

    @C09CT("template_id")
    public final String id;

    @C09CT("is_collected")
    public final boolean isCollected;

    @C09CT("md5")
    public final String md5;

    @C09CT("music")
    public final ArrayList<String> musicIds;

    @C09CT("music_post_unavailable")
    public final boolean musicPostUnavailable;

    @C09CT("music_url")
    public final String musicUrl;

    @C09CT("sdk_version")
    public final String sdkVersion;

    @C09CT("template_url")
    public final String templateUrl;

    @C09CT("title")
    public final String title;

    @C09CT("video")
    public final CutSameVideo video;

    public TemplateResponseItem() {
        this("", null, "not_set", "not_set", "not_set", 0L, "not_set", false, "not_set", "not_set", null, null, new ArrayList(), new ArrayList(), null, false);
    }

    public static Pair LIZ(String str) {
        boolean z;
        Object next;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new Pair(C13BV.INSTANCE, null);
        }
        try {
            new p();
            List listLJ = C08JS.LJ(TemplateSlot[].class, p.LIZJ(str).LJIILIIL().LJJIIZ("slots").LJIL());
            Iterator it2 = listLJ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    TemplateSlot templateSlot = (TemplateSlot) next;
                    if (Intrinsics.LJFF(templateSlot.getType(), "audio") && NLEEditorJniJNI.NLEMusicResourceProtocol_isMusicResource(templateSlot.getSource())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TemplateSlot templateSlot2 = (TemplateSlot) next;
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJ) {
                if (Intrinsics.LJFF(((TemplateSlot) obj).getType(), "video")) {
                    arrayList.add(obj);
                }
            }
            return new Pair(arrayList, templateSlot2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new Pair(C13BV.INSTANCE, null);
        }
    }

    public TemplateResponseItem(String str, CutSameVideo cutSameVideo, String str2, String str3, String str4, long j, String str5, boolean z, String str6, String str7, String str8, AuthorInfo authorInfo, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str9, boolean z2) {
        this.id = str;
        this.video = cutSameVideo;
        this.title = str2;
        this.description = str3;
        this.templateUrl = str4;
        this.createTime = j;
        this.extra = str5;
        this.isCollected = z;
        this.sdkVersion = str6;
        this.md5 = str7;
        this.iconUrl = str8;
        this.authorInfo = authorInfo;
        this.challengeIds = arrayList;
        this.musicIds = arrayList2;
        this.musicUrl = str9;
        this.musicPostUnavailable = z2;
    }
}
