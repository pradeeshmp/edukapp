/*
 *  (c) 2012 University of Bolton
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.edukapp.renderer;

import uk.ac.edukapp.model.Useraccount;
import uk.ac.edukapp.model.Widgetprofile;

/**
 * An extended widget profile for holding a collection of related objects, useful
 * for rendering extended metadata about a widget
 * 
 * @author scottw
 *
 */
public class ExtendedWidgetProfile {
	
	private Widgetprofile widgetProfile;
	
	private Useraccount uploadedBy;

	/**
	 * @return the widgetProfile
	 */
	public Widgetprofile getWidgetProfile() {
		return widgetProfile;
	}

	/**
	 * @param widgetProfile the widgetProfile to set
	 */
	public void setWidgetProfile(Widgetprofile widgetProfile) {
		this.widgetProfile = widgetProfile;
	}

	/**
	 * @return the uploadedBy
	 */
	public Useraccount getUploadedBy() {
		return uploadedBy;
	}

	/**
	 * @param uploadedBy the uploadedBy to set
	 */
	public void setUploadedBy(Useraccount uploadedBy) {
		this.uploadedBy = uploadedBy;
	}

}