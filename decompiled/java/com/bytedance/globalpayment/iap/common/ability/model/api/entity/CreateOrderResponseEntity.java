package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

/* JADX INFO: loaded from: classes28.dex */
public class CreateOrderResponseEntity extends ResponseEntity {

    @JsonName("data")
    public Data data;

    public static class Data {

        @JsonName("request_id")
        public String requestId;

        @JsonName("pay_in_track_id")
        public String trackId;
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity
    public boolean isSuccess() {
        return this.errorCode == 0;
    }
}
