/*
 * Copyright 2014 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplannerdelirium.sss.domain.location;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("SphereLocation")
public class SphereLocation extends Location {

    public SphereLocation() {
    }

    public SphereLocation(long id, double latitude, double longitude) {
        super(id, latitude, longitude);
    }

    @Override
    public long getDistanceTo(Location location) {
        double distance = getAirDistanceDoubleTo(location); // TODO not correct
        // Multiplied by 1000 to avoid floating point arithmetic rounding errors
        return (long) (distance * 1000.0 + 0.5);
    }

}
