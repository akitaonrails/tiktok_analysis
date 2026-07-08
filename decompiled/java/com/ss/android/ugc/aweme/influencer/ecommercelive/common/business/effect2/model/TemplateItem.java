package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model;

import X.InterfaceC1891350zJl;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public interface TemplateItem extends InterfaceC1891350zJl, Parcelable {
    String Cc();

    boolean LJJIZ();

    boolean PK();

    String S3();

    boolean Sm();

    List<TemplateField> T5();

    Long TA();

    @Override // X.InterfaceC1891350zJl
    boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl);

    boolean b0();

    boolean fR();

    BillboardActivityInfo getActivityInfo();

    Integer getSubType();

    String getTemplateId();

    BillboardTrackParams getTrackParams();

    int getType();

    String gy();

    String kv();

    List<TemplateDecoration> tc();

    BillboardGiveawayInfo vI();
}
