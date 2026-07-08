package com.ss.lyrax.transcoder;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class LyraxTranscoderFeaturesConfig {
    public ArrayList<LyraxTranscoderFeature> features;

    public ArrayList<LyraxTranscoderFeature> getFeatures() {
        return this.features;
    }

    public LyraxTranscoderFeaturesConfig(ArrayList<LyraxTranscoderFeature> arrayList) {
        this.features = arrayList;
    }

    public void addFeature(LyraxTranscoderFeature lyraxTranscoderFeature) {
        Iterator<LyraxTranscoderFeature> it2 = this.features.iterator();
        while (it2.hasNext()) {
            if (it2.next().equals(lyraxTranscoderFeature)) {
                return;
            }
        }
        this.features.add(lyraxTranscoderFeature);
    }

    public void removeFeature(LyraxTranscoderFeature lyraxTranscoderFeature) {
        for (LyraxTranscoderFeature lyraxTranscoderFeature2 : this.features) {
            if (lyraxTranscoderFeature2.equals(lyraxTranscoderFeature)) {
                this.features.remove(lyraxTranscoderFeature2);
                return;
            }
        }
    }
}
